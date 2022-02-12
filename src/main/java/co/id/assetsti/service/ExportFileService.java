package co.id.assetsti.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import co.id.assetsti.bean.PdfRequest;

@Service
public class ExportFileService {
	@Value("${file.tempDir}")
	private String BASE_DIR;

	private String[] headers = new String[] { "Jenis perangkat", "Jumlah perangkat yang disewa", "Jumlah perangkat yang rusak",
			"Total perangkat" };

	public String writeToPdf(PdfRequest request) throws FileNotFoundException, DocumentException {
		String fileName = "Report_" + request.getStatus() + "_" + request.getYear() + ".pdf";
		String file = BASE_DIR + fileName;

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(file));

		document.open();
		addMetaData(document, request.getUserName());
		addTitlePage(document);
		addSubTitlePage(document, request);
		addTableAsset(document, request);
		addTableTotalAsset(document, request);
		document.close();

		return file;
	}

	private void addMetaData(Document document, String username) {
		document.addTitle("Report Asset STI");
		document.addSubject("Using iText");
		document.addKeywords("Java, PDF, iText");
		document.addAuthor(username);
		document.addCreator(username);
	}

	private void addTitlePage(Document document) throws DocumentException {
		Font titleFont = setFont(22, Font.BOLD);

		Paragraph p1 = new Paragraph(new Chunk("Laporan Asset STI", titleFont));
		p1.setAlignment(Paragraph.ALIGN_CENTER);
		addEmptyLine(p1, 1, 12f);
		document.add(p1);
	}

	private void addSubTitlePage(Document document, PdfRequest request) throws DocumentException {
		Font subTitleFont = setFont(12, 0);
		// add data to map
		Map<Integer, Map<String, String>> data = new HashMap<Integer, Map<String, String>>();
		Map<String, String> insideData = new HashMap<String, String>();

		// set inside data
		insideData.put("NAMA USER", request.getUserName());
		data.put(1, insideData);

		insideData = new HashMap<String, String>();
		insideData.put("TAHUN PERIODE", request.getYear());
		data.put(2, insideData);

		insideData = new HashMap<String, String>();
		insideData.put("STATUS", request.getStatus());
		data.put(3, insideData);

		// set content
		float[] columnWidths = { 15, 1, 15 };
		PdfPTable table = new PdfPTable(columnWidths);
		table.setWidthPercentage(50);
		table.setHorizontalAlignment(Element.ALIGN_CENTER);
		data.entrySet().stream().forEach(p -> {
			p.getValue().entrySet().stream().forEach(q -> {
				PdfPCell cell1 = new PdfPCell();
				cell1.setBorder(0);
				cell1.setPhrase(new Phrase(q.getKey(), subTitleFont));
				table.addCell(cell1);

				PdfPCell cell2 = new PdfPCell();
				cell2.setBorder(0);
				cell2.setPhrase(new Phrase(":", subTitleFont));
				table.addCell(cell2);

				PdfPCell cell3 = new PdfPCell();
				cell3.setBorder(0);
				cell3.setPhrase(new Phrase(q.getValue(), subTitleFont));
				table.addCell(cell3);
			});

		});
		document.add(table);

		Paragraph emptyPr = new Paragraph();
		addEmptyLine(emptyPr, 1, 12f);
		document.add(emptyPr);
	}

	private void addTableAsset(Document document, PdfRequest request) throws DocumentException {
		float[] columnWidths = { 15, 15, 15, 15 };
		PdfPTable table = new PdfPTable(columnWidths);
		table.setWidthPercentage(100);

		// add table header
		Font fontTableHeader = setFont(10, 1);
		Stream.of(headers).forEach(p -> {
			PdfPCell header = new PdfPCell();
			header.setPhrase(new Phrase(p, fontTableHeader));
			table.addCell(header);
		});

		// add data into table
		request.getData().stream().forEach(p -> {
			table.addCell(new PdfPCell(new Phrase(p.getDeviceCategory(), fontTableHeader)));
			table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getTotalDeviceRented()), fontTableHeader)));
			table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getTotalDeviceBrokenLost()), fontTableHeader)));
			table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getTotalDeviceType()), fontTableHeader)));
		});

		document.add(table);

		Paragraph emptyPr = new Paragraph();
		addEmptyLine(emptyPr, 1, 12f);
		document.add(emptyPr);
	}

	private void addTableTotalAsset(Document document, PdfRequest request) throws DocumentException {
		Font fontTableTotalAsset = setFont(10, 1);
		
		float[] columnWidths = { 15, 15, 15, 15 };
		PdfPTable table = new PdfPTable(columnWidths);
		table.setWidthPercentage(100);
		int grandTotalDeviceRented = request.getData().stream().mapToInt(m -> m.getTotalDeviceRented()).sum();
		int grandTotalDeviceBrokenLost = request.getData().stream().mapToInt(m -> m.getTotalDeviceBrokenLost()).sum();
		int grandTotalDeviceType = request.getData().stream().mapToInt(m -> m.getTotalDeviceType()).sum();

		table.addCell(new PdfPCell(new Phrase("Total", fontTableTotalAsset)));
		table.addCell(new PdfPCell(new Phrase(String.valueOf(grandTotalDeviceRented), fontTableTotalAsset)));
		table.addCell(new PdfPCell(new Phrase(String.valueOf(grandTotalDeviceBrokenLost), fontTableTotalAsset)));
		table.addCell(new PdfPCell(new Phrase(String.valueOf(grandTotalDeviceType), fontTableTotalAsset)));
		document.add(table);

		Paragraph emptyPr = new Paragraph();
		addEmptyLine(emptyPr, 1, 12f);
		document.add(emptyPr);
	}

	private void addEmptyLine(Paragraph paragraph, int number, float leading) {
		for (int i = 0; i < number; i++) {
			Paragraph p = new Paragraph(" ");
			// default leading is 18
			p.setLeading(leading);
			paragraph.add(p);
		}
	}

	private Font setFont(int fontSize, int boldSize) {
		Font font = new Font(Font.FontFamily.TIMES_ROMAN, fontSize, boldSize);
		return font;
	}

}

package co.id.assetsti.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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

	private Font font = new Font(Font.FontFamily.TIMES_ROMAN, 12);
	private String[] headers = new String[] { "Jenis perangkat", "Jumlah perangkat yang disewa", "Jumlah perangkat yang rusak",
			"Total perangkat" };

	public String writeToPdf(PdfRequest request) throws FileNotFoundException, DocumentException {
		String fileName = "Report.pdf";
		String file = BASE_DIR + fileName;

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(file));

		document.open();
		addMetaData(document, request.getUserName());
		addTitlePage(document, request);
		addTableResult(document, request);
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

	private void addTitlePage(Document document, PdfRequest request) throws DocumentException {
		float[] columnWidths = { 15, 15, 15 };
		PdfPTable table = new PdfPTable(columnWidths);
		table.setWidthPercentage(100);
		PdfPCell cell1 = new PdfPCell();
		cell1.setBorder(0);
		cell1.setPhrase(new Phrase("User request: " + request.getUserName(), font));
		table.addCell(cell1);

		PdfPCell cell2 = new PdfPCell();
		cell2.setBorder(0);
		cell2.setPhrase(new Phrase());
		table.addCell(cell2);

		PdfPCell cell3 = new PdfPCell();
		cell3.setBorder(0);
		cell3.setHorizontalAlignment(Element.ALIGN_RIGHT);
		cell3.setPhrase(new Phrase("Status: " + request.getStatus(), font));
		table.addCell(cell3);

		PdfPCell cell4 = new PdfPCell();
		cell4.setBorder(0);
		cell4.setPhrase(new Phrase("Tahun periode: " + request.getYear(), font));
		table.addCell(cell4);

		PdfPCell cell5 = new PdfPCell();
		cell5.setBorder(0);
		cell5.setPhrase(new Phrase());
		table.addCell(cell5);

		PdfPCell cell6 = new PdfPCell();
		cell6.setBorder(0);
		cell6.setHorizontalAlignment(Element.ALIGN_RIGHT);
		cell6.setPhrase(new Phrase());
		table.addCell(cell6);

		document.add(table);

		Paragraph p = new Paragraph();
		addEmptyLine(p, 1);
		document.add(p);
	}

	private void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
			paragraph.setFirstLineIndent(0);
		}
	}

	private void addTableHeader(PdfPTable table) {
		Stream.of(headers).forEach(p -> {
			PdfPCell header = new PdfPCell();
			header.setPhrase(new Phrase(p));
			table.addCell(header);
		});
	}

	private void addRows(PdfPTable table, PdfRequest request) {
		request.getData().stream().forEach(p -> {
			table.addCell(p.getDeviceCategory());
			table.addCell(String.valueOf(p.getTotalDeviceRented()));
			table.addCell(String.valueOf(p.getTotalDeviceBrokenLost()));
			table.addCell(String.valueOf(p.getTotalDeviceType()));
		});

		// set total
		int grandTotalDeviceRented = request.getData().stream().mapToInt(m -> m.getTotalDeviceRented()).sum();
		int grandTotalDeviceBrokenLost = request.getData().stream().mapToInt(m -> m.getTotalDeviceBrokenLost()).sum();
		int grandTotalDeviceType = request.getData().stream().mapToInt(m -> m.getTotalDeviceType()).sum();

		table.addCell("Total");
		table.addCell(String.valueOf(grandTotalDeviceRented));
		table.addCell(String.valueOf(grandTotalDeviceBrokenLost));
		table.addCell(String.valueOf(grandTotalDeviceType));

	}

	private void addTableResult(Document document, PdfRequest request) throws DocumentException {
		float[] columnWidths = { 15, 15, 15, 15 };
		PdfPTable table = new PdfPTable(columnWidths);
		table.setWidthPercentage(100);
		addTableHeader(table);
		addRows(table, request);
		document.add(table);
	}

}

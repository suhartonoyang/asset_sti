package co.id.assetsti.bean;

import java.util.List;

import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class PdfRequest {

	private int userId;
	@Transient
	private String userName;
	private String year;
	private String status;
	private List<DeviceTypeGrouping> data;
}

package co.id.assetsti.bean;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeviceTypeGrouping {
	private String deviceTypeName;
	private int totalDeviceRented;
	private int totalDeviceBrokenLost;
	private int totalDeviceType;
	@Override
	public String toString() {
		return "DeviceTypeGrouping [deviceTypeName=" + deviceTypeName + ", totalDeviceRented=" + totalDeviceRented
				+ ", totalDeviceBrokenLost=" + totalDeviceBrokenLost + ", totalDeviceType=" + totalDeviceType + "]";
	}
	
	
}

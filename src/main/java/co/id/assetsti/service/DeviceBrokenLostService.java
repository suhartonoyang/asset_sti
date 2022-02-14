package co.id.assetsti.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.id.assetsti.model.DeviceBrokenLost;
import co.id.assetsti.repo.DeviceBrokenLostRepository;

@Service
public class DeviceBrokenLostService {

	@Autowired
	private DeviceBrokenLostRepository deviceBrokenLostRepository;

	public List<DeviceBrokenLost> getAllDeviceBrokenLosts() {
		return deviceBrokenLostRepository.findAll();
	}

	public DeviceBrokenLost getDeviceBrokenLostById(Integer id) {
		return deviceBrokenLostRepository.findById(id).orElse(null);
	}

	public DeviceBrokenLost saveDeviceBrokenLost(DeviceBrokenLost deviceBrokenLost) {
		return deviceBrokenLostRepository.save(deviceBrokenLost);
	}

	public void deleteDeviceBrokenLostById(Integer id) {
		deviceBrokenLostRepository.deleteById(id);
	}

	public List<DeviceBrokenLost> getDeviceBrokenLostsByDeviceCategory(String deviceCategory) {
		return deviceBrokenLostRepository.findByDeviceCategory(deviceCategory);
	}

	public List<DeviceBrokenLost> getDeviceBrokenLostsByFilter(String deviceCategory, String serialNumber) {
		List<DeviceBrokenLost> data = getAllDeviceBrokenLosts();
		if (deviceCategory != null) {
			data = data.stream().filter(f -> f.getDeviceCategory().equalsIgnoreCase(deviceCategory)).collect(Collectors.toList());
		}

		if (serialNumber != null) {
			data = data.stream().filter(f -> f.getSerialNumber().equalsIgnoreCase(serialNumber)).collect(Collectors.toList());
		}

		return data;
	}
}

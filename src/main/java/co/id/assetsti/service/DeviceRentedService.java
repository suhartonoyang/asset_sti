package co.id.assetsti.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.id.assetsti.model.DeviceRented;
import co.id.assetsti.repo.DeviceRentedRepository;

@Service
public class DeviceRentedService {

	@Autowired
	private DeviceRentedRepository deviceRentedRepository;

	public List<DeviceRented> getAllDeviceRenteds() {
		return deviceRentedRepository.findAll();
	}

	public DeviceRented getDeviceRentedById(Integer id) {
		return deviceRentedRepository.findById(id).orElse(null);
	}

	public DeviceRented saveDeviceRented(DeviceRented deviceRented) {
		return deviceRentedRepository.save(deviceRented);
	}

	public void delteDeviceRentedById(Integer id) {
		deviceRentedRepository.deleteById(id);
	}

	public List<DeviceRented> getDeviceRentedsByDeviceCategory(String deviceCategory) {
		return deviceRentedRepository.findByDeviceCategory(deviceCategory);
	}

	public List<DeviceRented> getDeviceRentedsByFilter(String deviceCategory, String serialNumber) {
		List<DeviceRented> data = getAllDeviceRenteds();
		if (deviceCategory != null) {
			data = data.stream().filter(f -> f.getDeviceCategory().equalsIgnoreCase(deviceCategory)).collect(Collectors.toList());
		}
		if (serialNumber != null) {
			data = data.stream().filter(f -> f.getSerialNumber().equalsIgnoreCase(serialNumber)).collect(Collectors.toList());
		}

		return data;

	}
}

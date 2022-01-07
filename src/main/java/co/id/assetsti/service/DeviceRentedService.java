package co.id.assetsti.service;

import java.util.List;

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
		return deviceRentedRepository.getById(id);
	}
	
	public DeviceRented saveDeviceRented(DeviceRented deviceRented) {
		return deviceRentedRepository.save(deviceRented);
	}
}

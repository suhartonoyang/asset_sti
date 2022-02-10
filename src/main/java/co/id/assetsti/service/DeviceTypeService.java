package co.id.assetsti.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.id.assetsti.model.DeviceRented;
import co.id.assetsti.model.DeviceType;
import co.id.assetsti.repo.DeviceTypeRepository;

@Service
public class DeviceTypeService {

	@Autowired
	private DeviceTypeRepository deviceTypeRepository;

	@Autowired
	private DeviceRentedService deviceRentedService;

	public List<DeviceType> getAllDeviceTypes() {
		return deviceTypeRepository.findAll();
	}

	public DeviceType getDeviceTypeById(Integer id) {
		return deviceTypeRepository.findById(id).orElse(null);
	}

	public DeviceType saveDeviceType(DeviceType deviceType) {
		return deviceTypeRepository.save(deviceType);
	}

	public void deleteDeviceTypeById(Integer id) {
		deviceTypeRepository.deleteById(id);
	}
	
	public List<DeviceType> getDeviceTypesByDeviceCategory(String deviceCategory){
		return deviceTypeRepository.findByDeviceCategory(deviceCategory);
	}

	public List<DeviceType> getDeviceTypesExcludeRented(String deviceCategory) {
		List<DeviceRented> deviceRented = deviceRentedService.getAllDeviceRenteds();
		List<String> serialNumberRented = deviceRented.stream().filter(f1 -> f1.getStatus().equalsIgnoreCase("ac"))
				.map(m -> m.getSerialNumber()).collect(Collectors.toList());

		List<DeviceType> deviceTypeExcludeRented = deviceTypeRepository.findAll().stream().filter(f1 -> {
			return !serialNumberRented.contains(f1.getSerialNumber());
		}).collect(Collectors.toList());

		if (deviceCategory != null) {
			System.out.println("masuk sini");
			deviceTypeExcludeRented = deviceTypeExcludeRented.stream().filter(f1 -> f1.getDeviceCategory().equals(deviceCategory)).collect(Collectors.toList());
		}

		return deviceTypeExcludeRented;
	}

}

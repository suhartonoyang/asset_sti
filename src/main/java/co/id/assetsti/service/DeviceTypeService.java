package co.id.assetsti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.id.assetsti.model.DeviceType;
import co.id.assetsti.repo.DeviceTypeRepository;

@Service
public class DeviceTypeService {
	
	@Autowired
	private DeviceTypeRepository deviceTypeRepository;
	
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
}

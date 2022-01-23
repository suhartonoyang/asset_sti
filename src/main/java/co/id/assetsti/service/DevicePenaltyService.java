package co.id.assetsti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.id.assetsti.model.DevicePenalty;
import co.id.assetsti.repo.DevicePenaltyRepository;

@Service
public class DevicePenaltyService {
	
	@Autowired
	private DevicePenaltyRepository devicePenaltyRepository;
	
	public List<DevicePenalty> getAllDevicePenalties() {
		return devicePenaltyRepository.findAll();
	}
	
	public DevicePenalty getDevicePenaltyById(Integer id) {
		return devicePenaltyRepository.findById(id).orElse(null);
	}
	
	public DevicePenalty saveDevicePenalty(DevicePenalty deviceType) {
		return devicePenaltyRepository.save(deviceType);
	}
	
	public void deleteDevicePenaltyById(Integer id) {
		devicePenaltyRepository.deleteById(id);
	}
}

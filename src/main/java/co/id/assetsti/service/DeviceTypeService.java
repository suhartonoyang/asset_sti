package co.id.assetsti.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.id.assetsti.bean.DeviceTypeGrouping;
import co.id.assetsti.bean.PdfRequest;
import co.id.assetsti.model.DeviceBrokenLost;
import co.id.assetsti.model.DeviceRented;
import co.id.assetsti.model.DeviceType;
import co.id.assetsti.repo.DeviceTypeRepository;

@Service
public class DeviceTypeService {

	@Autowired
	private DeviceTypeRepository deviceTypeRepository;

	@Autowired
	private DeviceRentedService deviceRentedService;

	@Autowired
	private DeviceBrokenLostService deviceBrokenLostService;

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

	public List<DeviceType> getDeviceTypesByDeviceCategory(String deviceCategory) {
		return deviceTypeRepository.findByDeviceCategory(deviceCategory);
	}

	public List<DeviceType> getDeviceTypesExcludeRented(String deviceCategory) {
		List<DeviceRented> deviceRented = deviceRentedService.getAllDeviceRenteds();
		List<String> serialNumberRented = deviceRented.stream().map(m -> m.getSerialNumber()).collect(Collectors.toList());

		List<DeviceType> deviceTypeExcludeRented = deviceTypeRepository.findAll().stream().filter(f1 -> {
			return !serialNumberRented.contains(f1.getSerialNumber());
		}).collect(Collectors.toList());

		if (deviceCategory != null) {
			System.out.println("masuk sini");
			deviceTypeExcludeRented = deviceTypeExcludeRented.stream().filter(f1 -> f1.getDeviceCategory().equals(deviceCategory))
					.collect(Collectors.toList());
		}

		return deviceTypeExcludeRented;
	}

	public List<DeviceTypeGrouping> mappingDataReportPdf(PdfRequest request) {
		List<DeviceTypeGrouping> dataList = new ArrayList<DeviceTypeGrouping>();
//		Map<String, String> deviceTypeMap = getAllDeviceTypes().stream().filter(f -> f.getStatus().equals(request.getStatus()))
//				.collect(Collectors.toMap(DeviceType::getSerialNumber, DeviceType::getDeviceCategory));

		List<DeviceType> deviceTypes = getAllDeviceTypes().stream().filter(f -> {
//			SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
//			String year = sdf.format(f.getCreatedDate());
			return f.getStatus().equals(request.getStatus());
		}).collect(Collectors.toList());

//		deviceTypeMap.entrySet().stream().forEach(p -> {
//			System.out.println(p.getKey() + " - " + p.getValue());
//		});

		List<DeviceRented> deviceRenteds = deviceRentedService.getAllDeviceRenteds().stream().filter(f -> {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
			String year = sdf.format(f.getCreatedDate());
			return f.getStatus().equals(request.getStatus()) && year.equals(request.getYear());
		}).collect(Collectors.toList());

//		System.out.println("device rented");
//		deviceRenteds.stream().forEach(p -> {
//			System.out.println(p.getSerialNumber() + " - " + p.getCreatedDate());
//		});

		List<DeviceBrokenLost> deviceBrokenLosts = deviceBrokenLostService.getAllDeviceBrokenLosts().stream().filter(f -> {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
			String year = sdf.format(f.getCreatedDate());
			return f.getStatus().equals(request.getStatus()) && year.equals(request.getYear());
		}).collect(Collectors.toList());

//		System.out.println("device broken lost");
//		deviceBrokenLosts.stream().forEach(p -> {
//			System.out.println(p.getSerialNumber() + " - " + p.getCreatedDate());
//		});

		List<DeviceTypeGrouping> dataListTemp = new ArrayList<DeviceTypeGrouping>();
		deviceTypes.stream().forEach(k -> {
			DeviceTypeGrouping dataTemp = new DeviceTypeGrouping();
			dataTemp.setDeviceCategory(k.getDeviceCategory());
			int totalDeviceRented = (int) deviceRenteds.stream().filter(f -> f.getSerialNumber().equals(k.getSerialNumber())).count();
			int totalDeviceBrokenLost = (int) deviceBrokenLosts.stream().filter(f -> f.getSerialNumber().equals(k.getSerialNumber()))
					.count();
			dataTemp.setTotalDeviceRented(totalDeviceRented);
			dataTemp.setTotalDeviceBrokenLost(totalDeviceBrokenLost);
			dataTemp.setTotalDeviceType(1);
			dataListTemp.add(dataTemp);
//			System.out.println(k.getValue() + ", rent: " + totalDeviceRented + ", brokenLost: " + totalDeviceBrokenLost);
		});

		List<String> deviceTypeNames = dataListTemp.stream().map(m -> m.getDeviceCategory()).distinct().collect(Collectors.toList());
		for (String s : deviceTypeNames) {
			DeviceTypeGrouping data = new DeviceTypeGrouping();
			int totalDeviceRented = dataListTemp.stream().filter(f -> f.getDeviceCategory().equals(s))
					.mapToInt(i -> i.getTotalDeviceRented()).sum();
			int totalDeviceBrokenLost = dataListTemp.stream().filter(f -> f.getDeviceCategory().equals(s))
					.mapToInt(i -> i.getTotalDeviceBrokenLost()).sum();
			int totalDeviceType = dataListTemp.stream().filter(f -> f.getDeviceCategory().equals(s)).mapToInt(i -> i.getTotalDeviceType())
					.sum();

			data.setDeviceCategory(s);
			data.setTotalDeviceRented(totalDeviceRented);
			data.setTotalDeviceBrokenLost(totalDeviceBrokenLost);
			data.setTotalDeviceType(totalDeviceType);
			dataList.add(data);
		}

		return dataList;
	}
}

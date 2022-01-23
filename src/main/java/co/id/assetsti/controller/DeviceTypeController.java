package co.id.assetsti.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.id.assetsti.bean.Response;
import co.id.assetsti.model.DeviceType;
import co.id.assetsti.service.DeviceTypeService;
import io.swagger.annotations.Api;

@RequestMapping(value = "/api/device-types")
@RestController
@CrossOrigin
@Api(description = "for device types")
public class DeviceTypeController {
	
	@Autowired
	private DeviceTypeService deviceTypeService;
	
	@GetMapping("")
	public ResponseEntity<Response> getAllDeviceTypes() {
		List<DeviceType> deviceTypes = deviceTypeService.getAllDeviceTypes();
		Response resp = new Response();
		if (deviceTypes.isEmpty()) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(deviceTypes);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getDeviceTypeById(@PathVariable Integer id) {
		DeviceType deviceType = deviceTypeService.getDeviceTypeById(id);
		Response resp = new Response();
		if (deviceType == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(Arrays.asList(deviceType));
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
	
	@PostMapping("")
	public ResponseEntity<Response> saveDeviceType(@RequestBody DeviceType deviceType) throws Exception {
		DeviceType newDeviceType = deviceTypeService.saveDeviceType(deviceType);
		Response resp = new Response();

		if (newDeviceType != null) {
			resp.setCode(String.valueOf(HttpStatus.CREATED.value()));
			resp.setMessage("Data Sucessfully Saved!");
			resp.setData(Arrays.asList(newDeviceType));
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(resp);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Response> deleteDeviceTypeById(@PathVariable Integer id) {
		DeviceType deviceType = deviceTypeService.getDeviceTypeById(id);
		Response resp = new Response();
		if (deviceType == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			deviceTypeService.deleteDeviceTypeById(id);
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage("Data Successfully Deleted");
			resp.setData(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
}

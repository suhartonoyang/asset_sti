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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.id.assetsti.bean.Response;
import co.id.assetsti.model.DeviceRented;
import co.id.assetsti.service.DeviceRentedService;
import io.swagger.annotations.Api;

@RequestMapping(value = "/api/device-rents")
@RestController
@CrossOrigin
@Api(description = "for device rents")
public class DeviceRentedController {

	@Autowired
	private DeviceRentedService deviceRentedService;

	@GetMapping("")
	public ResponseEntity<Response> getAllDeviceRenteds(@RequestParam(required = false) String deviceCategory,
			@RequestParam(required = false) String serialNumber) {
		List<DeviceRented> deviceRenteds = deviceRentedService.getDeviceRentedsByFilter(deviceCategory, serialNumber);
		Response resp = new Response();
		if (deviceRenteds.isEmpty()) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(deviceRenteds);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getDeviceRentedById(@PathVariable Integer id) {
		DeviceRented deviceRented = deviceRentedService.getDeviceRentedById(id);
		Response resp = new Response();
		if (deviceRented == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(Arrays.asList(deviceRented));
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

	@PostMapping("")
	public ResponseEntity<Response> saveDeviceRented(@RequestBody DeviceRented deviceRented) throws Exception {
		DeviceRented newDeviceRented = deviceRentedService.saveDeviceRented(deviceRented);
		Response resp = new Response();

		if (newDeviceRented != null) {
			resp.setCode(String.valueOf(HttpStatus.CREATED.value()));
			resp.setMessage("Data Sucessfully Saved!");
			resp.setData(Arrays.asList(newDeviceRented));
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(resp);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Response> deleteDeviceRentedById(@PathVariable Integer id) {
		DeviceRented deviceRented = deviceRentedService.getDeviceRentedById(id);
		Response resp = new Response();
		if (deviceRented == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			deviceRentedService.delteDeviceRentedById(id);
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage("Data Successfully Deleted");
			resp.setData(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
}

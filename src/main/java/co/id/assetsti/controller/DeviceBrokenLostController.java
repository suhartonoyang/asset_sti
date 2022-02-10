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
import co.id.assetsti.model.DeviceBrokenLost;
import co.id.assetsti.service.DeviceBrokenLostService;
import io.swagger.annotations.Api;

@RequestMapping(value = "/api/device-broken-losts")
@RestController
@CrossOrigin
@Api(description = "for device rents")
public class DeviceBrokenLostController {

	@Autowired
	private DeviceBrokenLostService deviceBrokenLostService;

	@GetMapping("")
	public ResponseEntity<Response> getAllDeviceBrokenLosts(@RequestParam(required = false) String deviceCategory) {
		List<DeviceBrokenLost> deviceBrokenLosts;
		if (deviceCategory != null) {
			deviceBrokenLosts = deviceBrokenLostService.getDeviceBrokenLostsByDeviceCategory(deviceCategory);
		} else {
			deviceBrokenLosts = deviceBrokenLostService.getAllDeviceBrokenLosts();
		}
		Response resp = new Response();
		if (deviceBrokenLosts.isEmpty()) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(deviceBrokenLosts);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getDeviceBrokenLostById(@PathVariable Integer id) {
		DeviceBrokenLost deviceBrokenLost = deviceBrokenLostService.getDeviceBrokenLostById(id);
		Response resp = new Response();
		if (deviceBrokenLost == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(Arrays.asList(deviceBrokenLost));
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

	@PostMapping("")
	public ResponseEntity<Response> saveDeviceBrokenLost(@RequestBody DeviceBrokenLost deviceBrokenLost) throws Exception {
		DeviceBrokenLost newDeviceBrokenLost = deviceBrokenLostService.saveDeviceBrokenLost(deviceBrokenLost);
		Response resp = new Response();

		if (newDeviceBrokenLost != null) {
			resp.setCode(String.valueOf(HttpStatus.CREATED.value()));
			resp.setMessage("Data Sucessfully Saved!");
			resp.setData(Arrays.asList(newDeviceBrokenLost));
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(resp);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Response> deleteDeviceBrokenLostById(@PathVariable Integer id) {
		DeviceBrokenLost deviceBrokenLost = deviceBrokenLostService.getDeviceBrokenLostById(id);
		Response resp = new Response();
		if (deviceBrokenLost == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			deviceBrokenLostService.deleteDeviceBrokenLostById(id);
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage("Data Successfully Deleted");
			resp.setData(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
}

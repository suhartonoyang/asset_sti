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
import co.id.assetsti.model.DevicePenalty;
import co.id.assetsti.service.DevicePenaltyService;
import io.swagger.annotations.Api;

@RequestMapping(value = "/api/device-penalties")
@RestController
@CrossOrigin
@Api(description = "for device types")
public class DevicePenaltyController {
	
	@Autowired
	private DevicePenaltyService devicePenaltyService;
	
	@GetMapping("")
	public ResponseEntity<Response> getAllDevicePenalties() {
		List<DevicePenalty> devicePenalties = devicePenaltyService.getAllDevicePenalties();
		Response resp = new Response();
		if (devicePenalties.isEmpty()) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(devicePenalties);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getDevicePenaltyById(@PathVariable Integer id) {
		DevicePenalty devicePenalty = devicePenaltyService.getDevicePenaltyById(id);
		Response resp = new Response();
		if (devicePenalty == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage(HttpStatus.OK.name());
			resp.setData(Arrays.asList(devicePenalty));
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
	
	@PostMapping("")
	public ResponseEntity<Response> saveDevicePenalty(@RequestBody DevicePenalty devicePenalty) throws Exception {
		DevicePenalty newDevicePenalty = devicePenaltyService.saveDevicePenalty(devicePenalty);
		Response resp = new Response();

		if (newDevicePenalty != null) {
			resp.setCode(String.valueOf(HttpStatus.CREATED.value()));
			resp.setMessage("Data Sucessfully Saved!");
			resp.setData(Arrays.asList(newDevicePenalty));
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(resp);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Response> deleteDevicePenaltyById(@PathVariable Integer id) {
		DevicePenalty devicePenalty = devicePenaltyService.getDevicePenaltyById(id);
		Response resp = new Response();
		if (devicePenalty == null) {
			resp.setCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
			resp.setMessage("Data not found");
			resp.setData(null);
		} else {
			devicePenaltyService.deleteDevicePenaltyById(id);
			resp.setCode(String.valueOf(HttpStatus.OK.value()));
			resp.setMessage("Data Successfully Deleted");
			resp.setData(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
}

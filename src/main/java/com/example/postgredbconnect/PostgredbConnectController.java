package com.example.postgredbconnect;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostgredbConnectController {

	private final PostgredbConnectService pcs;

	public PostgredbConnectController(PostgredbConnectService pcs) {

		this.pcs = pcs;
	}
	@GetMapping("/hello")
	public List<PostgredbConnectModel> getpatientDetails() {
		List<PostgredbConnectModel> PatientList = pcs.getPatientDetails();
		return PatientList;
	}

}

package com.example.postgredbconnect;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostgredbConnectService {

	private final PostgredbConnectRepository pcr;
	
	public PostgredbConnectService(PostgredbConnectRepository pcr) {

		this.pcr = pcr;
	}

	public List<PostgredbConnectModel> getPatientDetails() {

		List<PostgredbConnectModel> patientlist = pcr.findAll();
		return patientlist;

	}

	public void postPatientDetails(PostgredbConnectModel model) {

		pcr.save(model);
	}

}

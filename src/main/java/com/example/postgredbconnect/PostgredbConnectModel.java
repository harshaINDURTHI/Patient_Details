package com.example.postgredbconnect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patientDetails")
public class PostgredbConnectModel {
	
	@Id
	private Long id;
	@Column
	private String patientName;
	@Column
	private int patientAge;
	@Column
	private char patientGender;
	
	public  PostgredbConnectModel() {
		
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public char getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(char patientGender) {
		this.patientGender = patientGender;
	}

	@Override
	public String toString() {
		return "PostgredbConnectModel [patientName=" + patientName + ", patientAge=" + patientAge + ", patientGender="
				+ patientGender + "]";
	}

}

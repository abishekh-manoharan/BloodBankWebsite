package com.assignment;


import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAllPatients(){
		List<Patient> allPatients = new ArrayList<>();
		allPatients.addAll((Collection<Patient>) patientRepository.findAll());
		return allPatients;
	}
	
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public void deletePatient(Patient patient) {
		patientRepository.delete(patient);
		
	}
	
	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public Patient findPatientById(int id) {
		List<Patient> patients = (List<Patient>) patientRepository.findAll();
		Patient toReturn = new Patient();
		for (Patient patient:patients) {
			if (patient.getPatientId()==id) { toReturn = patient;}
		}
		return toReturn;
	}
}

package com.assignment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class PatientController {
	@Autowired
	private PatientService patientService;

	
	@RequestMapping("/add-patient-page")
	public String addPatientPage(Model model) 
	{
		model.addAttribute("patient", new Patient());
		return "AddPatient";
	}
	
	@RequestMapping(value="/add-patient", method=RequestMethod.POST)
	public String addPatient(@ModelAttribute Patient patient, Model model) {
		patientService.addPatient(patient);
		
		model.addAttribute("patients", patientService.getAllPatients());
		return "PatientList";
	}
	

	
	@RequestMapping("/")
	public String getAllPatients(Model model){
		model.addAttribute("patients", patientService.getAllPatients());
		return "PatientList";
	}
	
	
	@RequestMapping(value="/delete/{patientId}", method=RequestMethod.POST)
	public String deletePatient(@PathVariable("patientId") int patientId, Model model) {
		Patient patient = patientService.findPatientById(patientId);
		patientService.deletePatient(patient);
		
		model.addAttribute("patients", patientService.getAllPatients());
		return "redirect:/";
	}
	

	@RequestMapping(value="/update-page/{patientId}", method=RequestMethod.GET)
	public String updatePatientPage(@PathVariable("patientId") int patientId, @ModelAttribute Patient patient, Model model) {
		patient = patientService.findPatientById(patientId);
		model.addAttribute("patient",patient);
		return "UpdatePatient";
	}

	
	@RequestMapping(value="/update-patient", method=RequestMethod.POST)
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);
	}
}

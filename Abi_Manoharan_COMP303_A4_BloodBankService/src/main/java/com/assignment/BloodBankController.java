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
public class BloodBankController {
	@Autowired
	private BloodBankService bloodBankService;

	
	@RequestMapping("/add-bloodBank-page")
	public String addBloodBankPage(Model model) 
	{
		model.addAttribute("bloodBank", new BloodBank());
		return "AddBloodBank";
	}
	
	@RequestMapping(value="/add-bloodBank", method=RequestMethod.POST)
	public String addBloodBank(@ModelAttribute BloodBank bloodBank, Model model) {
		bloodBankService.addBloodBank(bloodBank);
		
		model.addAttribute("bloodBanks", bloodBankService.getAllBloodBanks());
		return "BloodBankList";
	}
	

	
	@RequestMapping("/")
	public String getAllBloodBanks(Model model){
		model.addAttribute("bloodBanks", bloodBankService.getAllBloodBanks());
		return "BloodBankList";
	}
	
	
	@RequestMapping(value="/delete/{bloodBankId}", method=RequestMethod.POST)
	public String deleteBloodBank(@PathVariable("bloodBankId") int bloodBankId, Model model) {
		BloodBank bloodBank = bloodBankService.findBloodBankById(bloodBankId);
		bloodBankService.deleteBloodBank(bloodBank);
		
		model.addAttribute("bloodBanks", bloodBankService.getAllBloodBanks());
		return "redirect:/";
	}
	

	@RequestMapping(value="/update-page/{bloodBankId}", method=RequestMethod.GET)
	public String updateBloodBankPage(@PathVariable("bloodBankId") int bloodBankId, @ModelAttribute BloodBank bloodBank, Model model) {
		bloodBank = bloodBankService.findBloodBankById(bloodBankId);
		model.addAttribute("bloodBank",bloodBank);
		return "UpdateBloodBank";
	}

	
	@RequestMapping(value="/update-bloodBank", method=RequestMethod.POST)
	public void updateBloodBank(@RequestBody BloodBank bloodBank) {
		bloodBankService.updateBloodBank(bloodBank);
	}
}
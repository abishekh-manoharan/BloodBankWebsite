package com.assignment;


import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BloodBankService {
	@Autowired
	private BloodBankRepository bloodBankRepository;
	
	public List<BloodBank> getAllBloodBanks(){
		List<BloodBank> allBloodBanks = new ArrayList<>();
		allBloodBanks.addAll((Collection<BloodBank>) bloodBankRepository.findAll());
		return allBloodBanks;
	}
	
	public BloodBank addBloodBank(BloodBank bloodBank) {
		return bloodBankRepository.save(bloodBank);
	}
	
	public void deleteBloodBank(BloodBank bloodBank) {
		bloodBankRepository.delete(bloodBank);
		
	}
	
	public BloodBank updateBloodBank(BloodBank bloodBank) {
		return bloodBankRepository.save(bloodBank);
	}
	
	public BloodBank findBloodBankById(int id) {
		List<BloodBank> bloodBanks = (List<BloodBank>) bloodBankRepository.findAll();
		BloodBank toReturn = new BloodBank();
		for (BloodBank bloodBank:bloodBanks) {
			if (bloodBank.getBloodBankId()==id) { toReturn = bloodBank;}
		}
		return toReturn;
	}
}

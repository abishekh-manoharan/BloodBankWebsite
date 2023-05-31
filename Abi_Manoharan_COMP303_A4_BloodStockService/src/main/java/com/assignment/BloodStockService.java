package com.assignment;


import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BloodStockService {
	@Autowired
	private BloodStockRepository bloodStockRepository;
	
	public List<BloodStock> getAllBloodStocks(){
		List<BloodStock> allBloodStocks = new ArrayList<>();
		allBloodStocks.addAll((Collection<BloodStock>) bloodStockRepository.findAll());
		return allBloodStocks;
	}
	
	public BloodStock addBloodStock(BloodStock bloodStock) {
		return bloodStockRepository.save(bloodStock);
	}
	
	public void deleteBloodStock(BloodStock bloodStock) {
		bloodStockRepository.delete(bloodStock);
		
	}
	
	public BloodStock updateBloodStock(BloodStock bloodStock) {
		return bloodStockRepository.save(bloodStock);
	}
	
	public BloodStock findBloodStockById(int id) {
		List<BloodStock> bloodStocks = (List<BloodStock>) bloodStockRepository.findAll();
		BloodStock toReturn = new BloodStock();
		for (BloodStock bloodStock:bloodStocks) {
			if (bloodStock.getBloodStockId()==id) { toReturn = bloodStock;}
		}
		return toReturn;
	}
}

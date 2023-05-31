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
public class BloodStockController {
	@Autowired
	private BloodStockService bloodStockService;

	
	@RequestMapping("/add-bloodStock-page")
	public String addBloodStockPage(Model model) 
	{
		model.addAttribute("bloodStock", new BloodStock());
		return "AddBloodStock";
	}
	
	@RequestMapping(value="/add-bloodStock", method=RequestMethod.POST)
	public String addBloodStock(@ModelAttribute BloodStock bloodStock, Model model) {
		bloodStockService.addBloodStock(bloodStock);
		
		model.addAttribute("bloodStocks", bloodStockService.getAllBloodStocks());
		return "BloodStockList";
	}
	

	
	@RequestMapping("/")
	public String getAllBloodStocks(Model model){
		model.addAttribute("bloodStocks", bloodStockService.getAllBloodStocks());
		return "BloodStockList";
	}
	
	
	@RequestMapping(value="/delete/{bloodStockId}", method=RequestMethod.POST)
	public String deleteBloodStock(@PathVariable("bloodStockId") int bloodStockId, Model model) {
		BloodStock bloodStock = bloodStockService.findBloodStockById(bloodStockId);
		bloodStockService.deleteBloodStock(bloodStock);
		
		model.addAttribute("bloodStocks", bloodStockService.getAllBloodStocks());
		return "redirect:/";
	}
	

	@RequestMapping(value="/update-page/{bloodStockId}", method=RequestMethod.GET)
	public String updateBloodStockPage(@PathVariable("bloodStockId") int bloodStockId, @ModelAttribute BloodStock bloodStock, Model model) {
		bloodStock = bloodStockService.findBloodStockById(bloodStockId);
		model.addAttribute("bloodStock",bloodStock);
		return "UpdateBloodStock";
	}

	
	@RequestMapping(value="/update-bloodStock", method=RequestMethod.POST)
	public void updateBloodStock(@RequestBody BloodStock bloodStock) {
		bloodStockService.updateBloodStock(bloodStock);
	}
}
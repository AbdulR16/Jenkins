package com.example.demo.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.BloodDonor;

@Controller
public class BankBankController {
	
	@Autowired
	private BloodDonor donor;
	
	@RequestMapping(value = "/")
	public String init(Model model) {
		
		model.addAttribute("heading","jeevan Blood Bank");
		
		return "index";
	}
	@RequestMapping(value = "/srchByGroup")
	public String initSearchForm() {
		
	
		
		return "sechByGroup";
	}
	@RequestMapping(value = "/srchByName")
	public String initNameForm() {
		
	
		
		return "srchByName";
	}
	
	@ModelAttribute(name ="groups")
	public String[] getGroup() {
		
		return new String[] {"opos","bpos","aneg","bneg","abpos"};
	}
	
	@RequestMapping(value ="/add")
	public String addDonor(Model model) {
		
		model.addAttribute("command",donor);
		
		return "addDonor";
	}
	@RequestMapping(value ="/add",method= RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") BloodDonor donor,BindingResult result) {

		if(result.hasErrors()) {
			return "addDonor";
		}else {

			return "success";
		}
		
	}
	
	@RequestMapping(value="/find")
	public String getAllDonors(Model model) {
		
		List<BloodDonor> list = new ArrayList<>();
		BloodDonor abdul = new BloodDonor(8980,"abdul","bpos",LocalDate.now());
		BloodDonor ash = new BloodDonor(8980,"ash","bpos",LocalDate.now());

		list.add(abdul);
		list.add(ash);
		
		model.addAttribute("list",list);
		
		return "showAll";
	}
	@RequestMapping(value="/findByGroup")
	public String getAllDonorsByBloodGroup(@RequestParam("group") String bloodGroup,Model model) {
		List<BloodDonor> list = new ArrayList<>();
		BloodDonor abdul = new BloodDonor(8980,"abdul","bpos",LocalDate.now());
		BloodDonor ash = new BloodDonor(8980,"ash","bpos",LocalDate.now());

		list.add(abdul);
		list.add(ash);
		List<BloodDonor> list2 =list.stream().filter(e-> e.getBloodGroup().equals(bloodGroup)).collect(Collectors.toList());
		model.addAttribute("list",list2);
		
		return "showAll";
	}
	@RequestMapping(value="/findByName")
	public String getAllDonorsByFirstName(@RequestParam("name") String firstName,Model model) {
		List<BloodDonor> list = new ArrayList<>();
		BloodDonor abdul = new BloodDonor(8980,"abdul","bpos",LocalDate.now());
		BloodDonor ash = new BloodDonor(8980,"ash","bpos",LocalDate.now());

		list.add(abdul);
		list.add(ash);
		List<BloodDonor> list3 =list.stream().filter(e-> e.getFirstName().equals(firstName)).collect(Collectors.toList());
		model.addAttribute("list",list3);
		
		return "showAll";

}
}
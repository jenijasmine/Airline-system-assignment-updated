package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Credit;
import com.example.demo.repos.CreditRepository;
import com.example.demo.service.CreditService;

@Controller
public class CreditController {
	
	
	@Autowired
	CreditService service;
	
	@PostMapping("/validate")
	public String showCredit(@Valid @ModelAttribute("command") Credit credit,BindingResult result) {
		return "credit_card";
	}
	
	@PostMapping("/validateCardDetails")
	public String onBooking(@Valid @ModelAttribute("command") Credit credit,BindingResult result) {
		//System.out.println("dasdas<"+credit.getCredit_card_number());
//	List<Integer> cvvList= new ArrayList<>();
		int val=this.service.validateCardDetails(credit.getCredit_card_number(),credit.getExpiry_date(),credit.getCvv_number());
//		System.out.println("121312 - "+val);
		if(val>0) {
				//this.service.updateAvailableSeats();
				return "valid";
		}
		else {
			return "invalid";
		}
	
//		System.out.println(this.service.validateCardDetails(credit.getCredit_card_number(),credit.getExpiry_date(),credit.getCvv_number()));
//		return "valid";
	}
}
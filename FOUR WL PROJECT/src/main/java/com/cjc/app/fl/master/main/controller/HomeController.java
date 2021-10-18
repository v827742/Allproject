package com.cjc.app.fl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.master.main.model.CustomerDetails;
import com.cjc.app.fl.master.main.model.Dealer;
import com.cjc.app.fl.master.main.model.Loan;
import com.cjc.app.fl.master.main.model.Sanction;
import com.cjc.app.fl.master.main.service.HomeService;


@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/addCustomer")
	public CustomerDetails addCust(@RequestBody CustomerDetails cust)
	{
		return hs.addcustomer(cust);
	}
	
	@PostMapping("/addDealer")
	public Dealer addDealer(@RequestBody Dealer d)
	{
		return hs.addDealer(d);
	}
	
	@PostMapping("/addLoan")
	public Loan addLoan(@RequestBody Loan loan)
	{
		return hs.loanDetails(loan);
	}
	
	@PostMapping("/addSanction")
	public Sanction addSanction(@RequestBody Sanction sanct)
	{
		return hs.sanctionDetails(sanct);
	}
	
	@GetMapping("/getSanctionById/{sanctionId}")
	public Sanction getSanction(@PathVariable int sanctionId)
	{
		return hs.getSanctionById(sanctionId);
	}
	
	@GetMapping("/getAllSanction")
	public List<Sanction> getAllSanction()
	{
		return hs.getAllSanction();
	}

	
	
    

}

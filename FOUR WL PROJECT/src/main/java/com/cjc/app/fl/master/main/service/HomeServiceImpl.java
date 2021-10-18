package com.cjc.app.fl.master.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fl.master.main.model.BankDetails;
import com.cjc.app.fl.master.main.model.CustomerDetails;
import com.cjc.app.fl.master.main.model.Dealer;
import com.cjc.app.fl.master.main.model.Disburse;
import com.cjc.app.fl.master.main.model.Ledger;
import com.cjc.app.fl.master.main.model.Loan;
import com.cjc.app.fl.master.main.model.Sanction;
import com.cjc.app.fl.master.main.model.UpdateLedger;
import com.cjc.app.fl.master.main.model.Vehicle;
import com.cjc.app.fl.master.main.repository.BankDetailsRepository;
import com.cjc.app.fl.master.main.repository.CustomerdetailsRepository;
import com.cjc.app.fl.master.main.repository.DealerRepository;
import com.cjc.app.fl.master.main.repository.DisburseRepository;
import com.cjc.app.fl.master.main.repository.LedgerRepository;
import com.cjc.app.fl.master.main.repository.LoanRepository;
import com.cjc.app.fl.master.main.repository.SanctionRepository;
import com.cjc.app.fl.master.main.repository.UpdateLedgerRepository;
import com.cjc.app.fl.master.main.repository.VehicleRepository;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	CustomerdetailsRepository custRep;
	
	@Autowired
	BankDetailsRepository bankRep;
	
	@Autowired
	LoanRepository loanRep;
	
	@Autowired
	VehicleRepository vehRep;
	
	@Autowired
	DealerRepository dealerRep;
	
	@Autowired
	SanctionRepository sanctRep;
	
	@Autowired
	DisburseRepository disRep;
	
	@Autowired
	LedgerRepository ledRep;
	
	@Autowired
	UpdateLedgerRepository upLedRep;
	

	@Override
	public CustomerDetails addcustomer(CustomerDetails cust) 
	{
		return custRep.save(cust);
	}

	@Override
	public BankDetails addBankDetails(BankDetails bd) 
	{
		return bankRep.save(bd);
	}

	@Override
	public Loan loanDetails(Loan loan) 
	{
		return loanRep.save(loan);
	}

	@Override
	public Vehicle vehicleDetails(Vehicle vehicle) 
	{
		return vehRep.save(vehicle);
	}

	@Override
	public Dealer addDealer(Dealer d) 
	{
		return dealerRep.save(d);
	}

	@Override
	public Sanction sanctionDetails(Sanction san) 
	{
		return sanctRep.save(san);
	}

	@Override
	public Disburse disburseDetails(Disburse dis) 
	{
		return disRep.save(dis);
	}

	@Override
	public Ledger ledgerDetails(Ledger ledger) 
	{
		return ledRep.save(ledger);
	}

	@Override
	public UpdateLedger updateLedger(UpdateLedger updateLedger) 
	{
		return upLedRep.save(updateLedger);
	}

	@Override
	public Sanction getSanctionById(int sanctionId) 
	{
		return sanctRep.getById(sanctionId);
	}
	
	public List<Sanction> getAllSanction()
	{
		return sanctRep.findAll();
	}
	

}

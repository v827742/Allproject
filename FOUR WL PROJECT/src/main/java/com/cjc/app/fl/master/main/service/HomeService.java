package com.cjc.app.fl.master.main.service;

import java.util.List;

import com.cjc.app.fl.master.main.model.BankDetails;
import com.cjc.app.fl.master.main.model.CustomerDetails;
import com.cjc.app.fl.master.main.model.Dealer;
import com.cjc.app.fl.master.main.model.Disburse;
import com.cjc.app.fl.master.main.model.Ledger;
import com.cjc.app.fl.master.main.model.Loan;
import com.cjc.app.fl.master.main.model.Sanction;
import com.cjc.app.fl.master.main.model.UpdateLedger;
import com.cjc.app.fl.master.main.model.Vehicle;

public interface HomeService 
{
	public CustomerDetails addcustomer(CustomerDetails cust);
	public BankDetails addBankDetails(BankDetails bd);
	public Loan loanDetails(Loan loan);
	public Vehicle vehicleDetails(Vehicle vehicle);
	public Dealer addDealer(Dealer d);
	public Sanction sanctionDetails(Sanction san);
	public Disburse disburseDetails(Disburse dis);
	public Ledger ledgerDetails(Ledger ledger);
	public UpdateLedger updateLedger(UpdateLedger updateLedger);
	public Sanction getSanctionById(int sanctionId);
	public List<Sanction> getAllSanction();

}

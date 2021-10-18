package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer> 
{

}

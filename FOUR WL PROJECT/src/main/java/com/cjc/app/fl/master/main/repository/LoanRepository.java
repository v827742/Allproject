package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> 
{

}

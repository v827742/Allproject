package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> 
{

}

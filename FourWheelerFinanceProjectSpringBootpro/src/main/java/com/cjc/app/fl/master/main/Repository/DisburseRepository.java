package com.cjc.app.fl.master.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.Model.Disburse;

@Repository
public interface DisburseRepository extends JpaRepository<Disburse, Integer>{

}

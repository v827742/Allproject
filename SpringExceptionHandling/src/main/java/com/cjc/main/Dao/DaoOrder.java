package com.cjc.main.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.MyOrder;

@Repository
public interface DaoOrder extends CrudRepository<MyOrder, Integer>{
	
	
public MyOrder findById(int Id);

}

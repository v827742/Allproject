package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	public List<Product> findByPid(int pid);
	
}

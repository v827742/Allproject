package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.main.dto.OrderResponse;
import com.cjc.main.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public List<Customer> deleteById(int id);	
	
	
	@Query("SELECT new com.cjc.main.dto.OrderResponse(c.cname,p.pname,p.price)FROM Customer c JOIN c.products p")
	public List<OrderResponse>getJoininfo();
	
//	@Query("SELECT new com.vk.main.dto.OrderResponse(c.name,p.productname)"+ "FROM Customer c RIGHT JOIN c.products p")
//	public List<OrderResponse> getJoinInformation12();
	
	@Query ("SELECT new com.cjc.main.dto.OrderResponse(c.cname,p.pname,p.price)"+"FROM Customer c RIGHT JOIN c.products p")
	public List<OrderResponse> getRightJoinInfo();
	
//	@Query("SELECT new com.vk.main.dto.OrderResponse(c.name,p.productname)"+ "FROM Customer c LEFT JOIN c.products p")
//	public List<OrderResponse> getleftjoin();
     @Query("SELECT new com.cjc.main.dto.OrderResponse(c.cname,p.pname)"+"FROM Customer c LEFT JOIN c.products p")
	public List<OrderResponse> getleftjoinInfo();
//	@Query("SELECT new com.vk.main.dto.OrderResponse (c.name,p.productname)"+ "FROM Customer c INNER JOIN c.products p")
//	public List<OrderResponse> getInnerJoin();
	@Query("SELECT new com.cjc.main.dto.OrderResponse(c.cname,p.pname,p.price)"+"FROM Customer c INNER JOIN c.products p")
	public List<OrderResponse> getInnerJoinInfo();
	
}

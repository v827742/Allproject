package com.cjc.main.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.dto.OrderRequest;
import com.cjc.main.dto.OrderResponse;
import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;
import com.cjc.main.repository.CustomerRepository;
import com.cjc.main.repository.ProductRepository;

@RestController
public class OrderController {
    @Autowired
	CustomerRepository cr;
	@Autowired
    ProductRepository pr;
	
	@PostMapping("/addAllData")
	public List<Customer> saveData(@RequestBody List<Customer> cust)
	{
		return cr.saveAll(cust);
		
	}
	
	@PostMapping("/place")
	public Customer placerder(@RequestBody OrderRequest request) {
		return cr.save(request.getCustomer());
		
	}
	@GetMapping("/findallorder")
	public List<Customer> findAllOrder()
	{
		return cr.findAll();
		
	}
	@GetMapping("/getProduct/{pid}")
	public List<Product> getProductById(@PathVariable int pid)
	{
		return pr.findByPid(pid);
		
	}
	
	@GetMapping("/findorderselect")
	public List<OrderResponse> getJoinInformation1()
	{
		return cr.getJoininfo();
		
	}
	@GetMapping("/right")
	public List<OrderResponse> getJoinInformation2()
	{
		return cr.getRightJoinInfo();
	}
	
	@GetMapping("/left")
	public List<OrderResponse> getJoinInformation()
	{
		return cr.getleftjoinInfo();
	}
	@GetMapping("/inner")
	public List<OrderResponse> getJoinInformation3()
	{
		return cr.getInnerJoinInfo();
	}
	@DeleteMapping("/deleteData/{id}")
	public List<Customer> deleteCustomerData(@PathVariable int id)
	{
		
		return cr.deleteById(id);
	}
	}
	


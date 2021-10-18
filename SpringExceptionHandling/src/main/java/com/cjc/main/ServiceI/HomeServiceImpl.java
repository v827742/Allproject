package com.cjc.main.ServiceI;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Dao.DaoOrder;
import com.cjc.main.model.MyOrder;


@Service
public class HomeServiceImpl implements HomeServiceI{
     @Autowired
	DaoOrder dorder;
	
	
	public void addorder(MyOrder order) {
		
		
		dorder.save(order);
	}


	
	public MyOrder findData(int id) {
		
		return dorder.findById(id);
	}

}

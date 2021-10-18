package com.cjc.main.ServiceI;

import com.cjc.main.model.MyOrder;

public interface HomeServiceI {

	
	public void addorder(MyOrder order);
	public MyOrder findData(int id);
}

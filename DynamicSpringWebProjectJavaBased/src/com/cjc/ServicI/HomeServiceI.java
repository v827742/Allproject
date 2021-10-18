package com.cjc.ServicI;

import com.cjc.model.OrderInfo;
import com.cjc.model.ProductInfo;

public interface HomeServiceI {

	public int saveProduct(ProductInfo pi);
	public int saveOrder(OrderInfo oi);
	
	
}

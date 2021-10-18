package com.cjc.DaoI;

import com.cjc.model.OrderInfo;
import com.cjc.model.ProductInfo;

public interface HomeDaoI {

	public int saveProduct(ProductInfo pi);
	public int saveOrder(OrderInfo oi);
	
}

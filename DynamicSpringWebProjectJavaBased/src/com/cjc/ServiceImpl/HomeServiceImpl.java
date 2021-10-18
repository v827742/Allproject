package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoI.HomeDaoI;
import com.cjc.ServicI.HomeServiceI;
import com.cjc.model.OrderInfo;
import com.cjc.model.ProductInfo;

@Service
public class HomeServiceImpl implements HomeServiceI{
   @Autowired
	HomeDaoI hd;
	@Override
	public int saveProduct(ProductInfo pi) {
		// TODO Auto-generated method stub
		return hd.saveProduct(pi);
	}

	@Override
	public int saveOrder(OrderInfo oi) {
		// TODO Auto-generated method stub
		return hd.saveOrder(oi);
	}

}

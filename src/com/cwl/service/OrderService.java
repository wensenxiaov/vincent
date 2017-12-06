package com.cwl.service;

import java.util.List;

import com.cwl.dao.OrderDao;
import com.cwl.entity.Order;
	
	public interface OrderService {
		
	boolean insertOrder(Order order );
	
	List<Order> selectAllOrder(String date);
	
	boolean updateOrder(String cname,String cmood);

	List<Order> selectOrder();
	
	Order selectOrder(int odid);

	List<Order> selectByName(String oname);
	
	boolean updateOrder(String omood,int odid);
}

package com.cwl.dao;

import java.util.List;

import com.cwl.entity.Order;

public interface OrderDao {
	
	boolean insertOrder(Order order );
	
	List<Order> selectAllOrder(String date);
	
	boolean updateOrder(String oname,String omood);
	
	List<Order> selectOrder();
	
	Order selectOrder(int odid);
	
	List<Order> selectByName(String oname);
	
	boolean updateOrder(String omood,int odid);
}

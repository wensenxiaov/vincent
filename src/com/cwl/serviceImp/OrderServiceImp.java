package com.cwl.serviceImp;

import java.util.List;

import com.cwl.dao.OrderDao;
import com.cwl.daoImp.OrderDaoImp;
import com.cwl.entity.Order;
import com.cwl.service.OrderService;

public class OrderServiceImp implements OrderService {

	OrderDao odo=new OrderDaoImp();
	
	@Override
	public boolean insertOrder(Order order) {
		return odo.insertOrder(order);
	}

	@Override
	public boolean updateOrder(String cname, String cmood) {
		return odo.updateOrder(cname, cmood);
	}

	@Override
	public List<Order> selectAllOrder(String date) {
		return odo.selectAllOrder(date);
	}

	@Override
	public List<Order> selectOrder() {
		return odo.selectOrder();
	}

	@Override
	public Order selectOrder(int odid) {
		return odo.selectOrder(odid);
	}

	@Override
	public boolean updateOrder(String omood,int odid) {
		return odo.updateOrder(omood,odid);
	}

	@Override
	public List<Order> selectByName(String oname) {
		return odo.selectByName(oname);
	}

}

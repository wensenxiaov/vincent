package com.cwl.service;

import java.util.List;

import com.cwl.entity.Cart;

public interface CartServce {
	List<Cart> getAllCart(String cname);
	
	Cart getCart(int cfid,String cname);
	
	boolean insertCart(int cfid,int ccount,String cname);

	boolean deleteCart(int cfid);
	
	boolean deleteAllCart(String cname);
	
	boolean updateCart(int cfid,int ccount,String cname);
	
}

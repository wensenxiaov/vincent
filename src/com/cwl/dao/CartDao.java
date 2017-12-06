package com.cwl.dao;

import java.util.List;

import com.cwl.entity.Cart;

public interface CartDao {
	List<Cart> getAllCart(String cname);
	
	Cart getCart(int cfid,String cname);
	
	boolean insertCart(int cfid,int ccount,String cname);
	
	boolean deleteCart(int cfid);
	
	boolean deleteAllCart(String cname);
	
	boolean updateCart(int cfid,int ccount,String cname);
}

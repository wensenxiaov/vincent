package com.cwl.service;

import java.util.List;

import com.cwl.entity.Flower;

public interface FlowerService {
	
	List<Flower> selectAllFlower();
	
	boolean insertFlower(Flower flower);
	
	boolean deleteFlower(int fid);
	
	Flower selectFlower(int fid);
	
	boolean updateFlower(Flower flower);
}

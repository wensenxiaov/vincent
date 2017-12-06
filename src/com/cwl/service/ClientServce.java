package com.cwl.service;


import java.util.List;

import com.cwl.entity.Client;

public interface ClientServce {
	
	boolean insertClient(Client client);

	boolean selectClient(Client client);
	
	Client seletctClient1(String cname);

	Client selectByMail(String cmail);
	
	Client selectByTelphone(String ctel);
	
	List<Client> selectAllClient();
	
	boolean deleteClient(int cid);
}

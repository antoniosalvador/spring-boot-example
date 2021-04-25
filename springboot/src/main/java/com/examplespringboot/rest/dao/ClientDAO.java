package com.examplespringboot.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.examplespringboot.rest.model.Client;

import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {

	private static List<Client> list = new ArrayList<>();
	
    static 
    {
        list.add(new Client(1, "Antonio Salvador", "c3p0_x@protonmail.com", "Boulevard Champlain", "Quebec","G1T 1X9","418-444-444"));   
        list.add(new Client(2, "Samuel-De Champlain", "samuel@protonmail.com", "Quartier Petit Champlain", "Quebec","G1K 4H5","418-444-444"));
        list.add(new Client(3, "Jacques Cartier", "jacquescartier@protonmail.com", "Avenue Cartier,", "Quebec","G1R 2S9","418-444-444"));
    }
    
    public List<Client> getAllClients() 
    {
        return list;
    }
    
    public Client getClient(Integer id) {
    	return list.stream().filter(client -> client.getId().equals(id)).findAny().orElse(null);
    }
}

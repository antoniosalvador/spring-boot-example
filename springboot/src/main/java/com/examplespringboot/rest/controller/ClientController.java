package com.examplespringboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.examplespringboot.rest.dao.ClientDAO;
import com.examplespringboot.rest.model.Client;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @Autowired
    private ClientDAO clientDao;
    
    @GetMapping(path="/", produces = "application/json")
    public List<Client> getClients() 
    {
         return clientDao.getAllClients();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public @ResponseBody Client getEmployee(@PathVariable Integer id) {
    	return clientDao.getClient(id);
    }
}

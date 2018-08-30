/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.dao.ClientRepository;
import com.edacy.sn.BanqueSi.entities.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahima sy
 */
@Service
public class ClientImpl implements ClientMetier{
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client c) {
       return clientRepository .save(c);
    }

    @Override
    public List<Client> listeClient() {
        return clientRepository.findAll();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.entities.Client;
import java.util.List;

/**
 *
 * @author ibrahima sy
 */
public interface ClientMetier {
    public Client saveClient(Client c);
    public List<Client> listeClient();
}

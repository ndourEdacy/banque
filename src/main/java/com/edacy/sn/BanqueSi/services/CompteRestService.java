/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.services;

import com.edacy.sn.BanqueSi.entities.Compte;
import com.edacy.sn.BanqueSi.metier.CompteMetier;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ibrahima sy
 */
@RestController
public class CompteRestService {
    @Autowired
    private CompteMetier compteMetier;
    
    @RequestMapping(value="/comptes",method = RequestMethod.POST)
    public Compte saveCompte(@RequestBody Compte c) {
        c.setDateCreation(new Date());
        return compteMetier.saveCompte(c);
    }
    @RequestMapping(value="/comptes/{codeCompte}",method = RequestMethod.GET)
    public Compte getCompte(@PathVariable("codeCompte") String codeCompte) {
        return compteMetier.getCompte(codeCompte);
    }
    
}

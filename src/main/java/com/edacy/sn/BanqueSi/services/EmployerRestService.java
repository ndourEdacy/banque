/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.services;

import com.edacy.sn.BanqueSi.entities.Employer;
import com.edacy.sn.BanqueSi.metier.EmployeMetier;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ibrahima sy
 */
@RestController
public class EmployerRestService {
    @Autowired
    private EmployeMetier employeMetier;
    
    @RequestMapping(value = "/employes",method = RequestMethod.POST)
    public Employer saveEmploye(@RequestBody Employer e) {
        return employeMetier.saveEmploye(e);
    }
    
    @RequestMapping(value = "/employes",method = RequestMethod.GET)
    public List<Employer> listeEmploye() {
        return employeMetier.listeEmploye();
    }
    
}

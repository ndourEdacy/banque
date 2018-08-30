/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.dao.EmployeRepository;
import com.edacy.sn.BanqueSi.entities.Employer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahima sy
 */
@Service
public class EmployeMetierImpl implements EmployeMetier{
     @Autowired
     private EmployeRepository employeRepository;
    @Override
    public Employer saveEmploye(Employer e) {
        return employeRepository.save(e);
    }

    @Override
    public List<Employer> listeEmploye() {
        return employeRepository.findAll();
    }
    
}

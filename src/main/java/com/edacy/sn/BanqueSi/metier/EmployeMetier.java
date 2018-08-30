/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.entities.Employer;
import java.util.List;

/**
 *
 * @author ibrahima sy
 */
public interface EmployeMetier {
    public Employer saveEmploye(Employer e);
    public List<Employer> listeEmploye();
    
}

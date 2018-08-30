/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.dao;

import com.edacy.sn.BanqueSi.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ibrahima sy
 */
public interface CompteRepository extends JpaRepository<Compte, String>{
    
}

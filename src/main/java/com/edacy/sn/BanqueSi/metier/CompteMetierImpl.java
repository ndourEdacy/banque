/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.dao.CompteRepository;
import com.edacy.sn.BanqueSi.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ibrahima sy
 */
@Service
public class CompteMetierImpl implements CompteMetier{
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public Compte saveCompte(Compte c) {
        return compteRepository.save(c);
    }

    @Override
    public Compte getCompte(String codeCompte) {
        return compteRepository.findById(codeCompte).get();
    }
}

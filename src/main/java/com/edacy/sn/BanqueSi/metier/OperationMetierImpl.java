/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.dao.CompteRepository;
import com.edacy.sn.BanqueSi.dao.EmployeRepository;
import com.edacy.sn.BanqueSi.dao.OperationRepository;
import com.edacy.sn.BanqueSi.entities.Compte;
import com.edacy.sn.BanqueSi.entities.Employer;
import com.edacy.sn.BanqueSi.entities.Operation;
import com.edacy.sn.BanqueSi.entities.Retrait;
import com.edacy.sn.BanqueSi.entities.Versement;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ibrahima sy
 */
@Service
public class OperationMetierImpl implements OperationMetier{
    @Autowired
    private OperationRepository operationRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private EmployeRepository employeRepository;
    
    @Override
    @Transactional
    public boolean verser(String code, double montant, long codeEmpl) {
        Operation o = new Versement();
        Compte cp = compteRepository.findById(code).get();
        Employer emp = employeRepository.findById(codeEmpl).get();
        o.setEmployer(emp);
        o.setMontant(montant);
        o.setCompte(cp);
        o.setDateOperation(new Date());
        cp.setSolde(montant+cp.getSolde());
        operationRepository.save(o);
        return true;
    }
    @Transactional
    public boolean retirer(String code, double montant, long codeEmpl) {
         Operation o = new Retrait();
        Compte cp = compteRepository.findById(code).get();
        if(cp.getSolde()< montant) throw new RuntimeException("solde insuffisant");
        Employer emp = employeRepository.findById(codeEmpl).get();
        o.setEmployer(emp);
        o.setMontant(montant);
        o.setCompte(cp);
        o.setDateOperation(new Date());
        cp.setSolde(cp.getSolde()-montant);
        operationRepository.save(o);
     return true;
    }

    @Override
    @Transactional
    public boolean virer(String code1, String code2, double montant, long codeEmpl) {
        retirer(code1, montant, codeEmpl);
        verser(code2, montant, codeEmpl);
     return true;
    } 

    @Override
    public PageOperation getOperations(String code, int page, int size) {
        Page<Operation> ops = operationRepository.getOperations(code, new PageRequest(page, size));
        PageOperation pOp = new PageOperation();
        pOp.setNombreOperations(ops.getNumberOfElements());
        pOp.setOperations(ops.getContent());
        pOp.setPage(ops.getNumber());
        pOp.setTotalPages(ops.getTotalPages());
        pOp.setTotalOperation((int)ops.getTotalElements());
        return pOp;
    }
    
}

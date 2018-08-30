/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.services;

import com.edacy.sn.BanqueSi.entities.Compte;
import com.edacy.sn.BanqueSi.metier.CompteMetier;
import com.edacy.sn.BanqueSi.metier.OperationMetier;
import com.edacy.sn.BanqueSi.metier.PageOperation;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ibrahima sy
 */
@Component
@WebService
public class BanqueServiceSoap {
    @Autowired
    private CompteMetier compteMetier;
    @Autowired
    private OperationMetier operationMetier;
    
    @WebMethod
    public Compte getCompte(@WebParam(name = "codeCompte")String codeCompte) {
        return compteMetier.getCompte(codeCompte);
    }
    @WebMethod
    public boolean verser(@WebParam(name = "codeCompte")String code,
            @WebParam(name = "montant") double montant,
            @WebParam(name = "codeEmpl") long codeEmpl) {
        return operationMetier.verser(code, montant, codeEmpl);
    }
    @WebMethod
    public boolean retirer(@WebParam(name = "codeCompte") String code,
                            @WebParam(name = "montant") double montant,@WebParam(name = "codeEmpl") long codeEmpl) {
        return operationMetier.retirer(code, montant, codeEmpl);
    }
    @WebMethod
    public boolean virer(@WebParam(name = "code1")String code1,@WebParam(name = "code2") String code2,
                          @WebParam(name = "montant") double montant, @WebParam(name = "codeEmpl") long codeEmpl) {
        return operationMetier.virer(code1, code2, montant, codeEmpl);
    }
     @WebMethod
    public PageOperation getOperations(@WebParam(name = "codeCompte")String code,
                                        @WebParam(name = "page")int page,@WebParam(name = "size") int size) {
        return operationMetier.getOperations(code, page, size);
    }
    
}

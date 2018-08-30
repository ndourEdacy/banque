/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.services;

import com.edacy.sn.BanqueSi.metier.OperationMetier;
import com.edacy.sn.BanqueSi.metier.PageOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ibrahima sy
 */
@RestController
public class OperationRestService {
    @Autowired
    private OperationMetier operationMetier;
    
    @RequestMapping(value = "/operations", method = RequestMethod.GET)
    public PageOperation getOperations(@RequestParam(name = "code") String code,@RequestParam(name = "page") int page,
                                       @RequestParam(name = "size") int size) {
        return operationMetier.getOperations(code, page, size);
    }
    
    @RequestMapping(value = "/versement",method = RequestMethod.PUT) 
    public boolean verser(@RequestParam(name = "code") String code,@RequestParam(name = "montant") double montant,
                          @RequestParam(name = "codeEmpl") long codeEmpl) {
        return operationMetier.verser(code, montant, codeEmpl);
    }
    
    @RequestMapping(value = "/retrait",method = RequestMethod.PUT)
    public boolean retrait(@RequestParam(name = "code") String code,@RequestParam(name = "montant") double montant, 
                           @RequestParam(name = "codeEmpl") long codeEmpl) {
        return operationMetier.retirer(code, montant, codeEmpl);
    }
  
    @RequestMapping(value = "/virement",method = RequestMethod.PUT)
    public boolean virer(@RequestParam(name = "code1") String code1,@RequestParam(name = "code2") String code2,
                         @RequestParam(name = "montant") double montant,@RequestParam(name = "codeEmpl") long codeEmpl) {
        return operationMetier.virer(code1, code2, montant, codeEmpl);
    }
    
}

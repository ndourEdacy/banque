/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

/**
 *
 * @author ibrahima sy
 */
public interface OperationMetier {
    public boolean verser(String code , double montant , long codeEmpl);
    public boolean retirer(String code , double montant , long codeEmpl);
    public boolean virer(String code1,String code2 , double montant , long codeEmpl);
    public PageOperation getOperations(String code , int page , int size);
}

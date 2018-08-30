///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.edacy.sn.BanqueSi.rmi;
//
//import com.edacy.sn.BanqueSi.entities.Compte;
//import com.edacy.sn.BanqueSi.metier.CompteMetier;
//import com.edacy.sn.BanqueSi.metier.OperationMetier;
//import javassist.tools.rmi.RemoteException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author ibrahima sy
// */
//@Component("myRmiService")
//public class BanqueRmiImpl implements BanqueRmiRemote{
//     @Autowired
//     private CompteMetier compteMetier;
//     @Autowired
//     private OperationMetier operationMetier;
//    @Override
//    public Compte saveCompte(Compte c) throws RemoteException {
//       return compteMetier.saveCompte(c);
//    }
//
//    @Override
//    public Compte getCompte(String code) throws RemoteException {
//        return compteMetier.getCompte(code);
//    }
//
//    @Override
//    public boolean verser(String code, double montant, long codeEmpl) throws RemoteException {
//        return operationMetier.verser(code, montant, codeEmpl);
//    }
//
//    @Override
//    public boolean retirer(String code, double montant, long codeEmpl) throws RemoteException {
//        return operationMetier.retirer(code, montant, codeEmpl);
//    }
//
//    @Override
//    public boolean virer(String code1, String code2, double montant, long codeEmpl) throws RemoteException {
//        return operationMetier.virer(code1, code2, montant, codeEmpl);
//    }
//    
//}

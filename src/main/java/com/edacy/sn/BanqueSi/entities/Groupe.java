/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author ibrahima sy
 */
@Entity
@Table(name = "GROUPES")
public class Groupe implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeGroupe;
    private String nomGroupe;
    @ManyToMany(mappedBy = "groupes")
    private Collection<Employer> employes;

    public Groupe() {
    }

    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public long getCodeGroupe() {
        return codeGroupe;
    }

    public void setCodeGroupe(long codeGroupe) {
        this.codeGroupe = codeGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Collection<Employer> getEmployes() {
        return employes;
    }

    public void setEmployes(Collection<Employer> employes) {
        this.employes = employes;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author ibrahima sy
 */
@Entity
public class Employer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeEmployer;
    private String nomEmployer;
    @ManyToOne
    @JoinColumn(name = "code_emp_sup")
    private Employer employerSup;
    @ManyToMany
    @JoinTable(name = "EMP_GRP")
    private Collection<Groupe> groupes;

    public Employer() {
    }

    public Employer(String nomEmployer) {
        this.nomEmployer = nomEmployer;
    }

    public long getCodeEmployer() {
        return codeEmployer;
    }

    public void setCodeEmployer(long codeEmployer) {
        this.codeEmployer = codeEmployer;
    }

    public String getNomEmployer() {
        return nomEmployer;
    }

    public void setNomEmployer(String nomEmployer) {
        this.nomEmployer = nomEmployer;
    }
     @JsonIgnore
    public Employer getEmployerSup() {
        return employerSup;
    }
    @JsonSetter
    public void setEmployerSup(Employer employerSup) {
        this.employerSup = employerSup;
    }
    
    @JsonIgnore
    public Collection<Groupe> getGroupes() {
        return groupes;
    }
    @JsonSetter
    public void setGroupes(Collection<Groupe> groupes) {
        this.groupes = groupes;
    }
    
}

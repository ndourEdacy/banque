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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ibrahima sy
 */
@Entity
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeClient;
    private String nomClient;
    @OneToMany(mappedBy = "client" , fetch = FetchType.LAZY)
    private Collection<Compte> comptes;

    public long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    
    @JsonIgnore
    @XmlTransient
    public Collection<Compte> getComptes() {
        return comptes;
    }
    @JsonSetter
    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public Client() {
    }

    public Client(String nomClient) {
        this.nomClient = nomClient;
    }
    
}

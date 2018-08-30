/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author ibrahima sy
 */
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

    public Versement() {
    }
    
}

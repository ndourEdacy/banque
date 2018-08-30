/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.metier;

import com.edacy.sn.BanqueSi.entities.Operation;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ibrahima sy
 */
public class PageOperation implements Serializable{
    private List<Operation> operations;
    private int page;
    private int nombreOperations;
    private int totalPages;
    private int totalOperation;

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNombreOperations() {
        return nombreOperations;
    }

    public void setNombreOperations(int nombreOperations) {
        this.nombreOperations = nombreOperations;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalOperation() {
        return totalOperation;
    }

    public void setTotalOperation(int totalOperation) {
        this.totalOperation = totalOperation;
    }
    
}

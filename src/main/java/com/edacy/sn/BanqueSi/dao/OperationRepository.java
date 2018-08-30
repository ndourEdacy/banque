/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy.sn.BanqueSi.dao;

import com.edacy.sn.BanqueSi.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ibrahima sy
 */
public interface OperationRepository extends JpaRepository<Operation, Long>{
    @Query("select o from Operation o where o.compte.codeCompte =:c")
    public Page<Operation> getOperations(@Param("c") String code ,Pageable pageable);
}

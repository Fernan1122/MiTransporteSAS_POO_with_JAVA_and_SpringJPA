/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unad.poo.repository;

import com.unad.poo.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FERNi
 */
@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    
        public Admin findByUsernameAndContraseña(String username, String contraseña);
}

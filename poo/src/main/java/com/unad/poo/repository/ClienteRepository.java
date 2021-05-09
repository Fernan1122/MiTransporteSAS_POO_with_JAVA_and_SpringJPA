/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unad.poo.repository;

import com.unad.poo.models.Ciudad;
import com.unad.poo.models.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FERNi
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
    Long countByCiudad(Ciudad ciudad);


    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.repository;


import com.ITicket.entity.lugar;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author lyonc
 */

@Repository
public interface lugarrepository extends CrudRepository<lugar,Long>{
    
}

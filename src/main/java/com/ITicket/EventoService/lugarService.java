/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.EventoService;

import com.ITicket.entity.lugar;
import com.ITicket.repository.lugarrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lyonc
 */


@Service
public class lugarService implements IlugarService {
    
    
        @Autowired
    private lugarrepository lugarRepository;

    /**
     *
     * @return
     */
    @Override
    public List<lugar> listCountry() {
       return (List<lugar>)lugarRepository.findAll();
    }
}
    
    

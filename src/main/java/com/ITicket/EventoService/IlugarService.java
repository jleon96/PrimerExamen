/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.EventoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.ITicket.entity.lugar;

/**
 *
 * @author lyonc
 */
public interface IlugarService {
    
    
     public List<lugar> listCountry();
}

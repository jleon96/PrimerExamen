/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.EventoService;

import com.ITicket.entity.evento;
import java.util.List;

public interface IEventoService {
    
     public List<evento> getAllEvento();
     
      public evento getEventoById(Long id);

  /*  public personas FindByNombre(String nombre);*/

    public void saveEvento(evento evento);

    public void delete(long id);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.EventoService;

import com.ITicket.entity.evento;
import com.ITicket.repository.eventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lyonc
 */


@Service
public class EventoService implements IEventoService {

    
    
     @Autowired
    private eventoRepository eventoRepository;
     
     
    @Override
    public List<evento> getAllEvento() {
          return (List<evento>)eventoRepository.findAll();
    }

    @Override
    public evento getEventoById(Long id) {
       return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEvento(evento evento) {
         eventoRepository.save(evento);
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id);
    }
    
    
    
}

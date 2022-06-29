/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.controller;

import com.ITicket.EventoService.IEventoService;
import com.ITicket.EventoService.IlugarService;
import com.ITicket.entity.evento;
import com.ITicket.entity.lugar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author lyonc
 */

@Controller
public class eventoController {
    
    
     @Autowired
    private IEventoService eventoService;

    @Autowired
    private IlugarService lugarService;
    
    
        @GetMapping("/Eventos")
    public String index(Model model) {
        List<evento> listaEvento = eventoService.getAllEvento();
        model.addAttribute("titulo", "Tabla Eventos");
        model.addAttribute("eventos", listaEvento);
        return "Eventos";

    }

    /*Metodo para crear un evento*/
    @GetMapping("/eventosN")
    public String crearPersona(Model model) {
        List<lugar> listalugares = lugarService.listCountry();
        model.addAttribute("evento", new evento());
        model.addAttribute("lugares", listalugares);
        return "crear";

    }

    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/eventos";

    }

    /*Metodo editar evento*/
    @GetMapping("/editEvento/{id}")
    public String editarEvento(@PathVariable("id") Long idEvento, Model model) {
        evento evento = eventoService.getEventoById(idEvento);
        List<lugar> listalugares = lugarService.listCountry();
        model.addAttribute("evento", evento);
        model.addAttribute("lugares", listalugares);
        return "crear";

    }

    /*Metodo borrar evento*/
    @GetMapping("/deleteEvento/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        eventoService.delete(idEvento);
        return "redirect:/eventos";

    }
}

    
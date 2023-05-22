package com.inserta.ejercicio135.centrales.controllers;

import com.inserta.ejercicio135.centrales.models.Central;
import com.inserta.ejercicio135.centrales.services.CentralService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class CentralesController {
    private final CentralService centralService;

    public CentralesController(CentralService centralService) {
        this.centralService = centralService;
    }

    @GetMapping("/listado/centrales")
    public String listaCentrales(){
        return "pages/listado-centrales";
    }

    @GetMapping("/listado/centrales/")
    public String todas(Model model){
        List<Central> centrales = centralService.todasCentrales();
        model.addAttribute("listaCentrales", centrales);
        return "pages/listado-centrales";
    }

    @GetMapping("/listado/centrales/activas")
    public String activas(Model model){
        List<Central> centrals = centralService.centralesActiva();
        model.addAttribute("listaCentrales", centrals);
        return "pages/listado-centrales";
    }

    @GetMapping("/listado/centrales/idTipo/{id}")
    public String idTipo(Model model, @PathVariable Integer id){
        List<Central> centrals = centralService.centralTipo1(id);
        model.addAttribute("listaCentrales", centrals);
        return "pages/listado-centrales";
    }

    @GetMapping("/listado/centrales/fecha/{year}")
    public String antesDe1975(Model model, @PathVariable Integer year){
        LocalDateTime fecha = LocalDateTime.of(year,1,1,0, 0);
        List<Central> centrals = centralService.inicioCentral(fecha);
        model.addAttribute("listaCentrales", centrals);
        return "pages/listado-centrales";
    }

    @ResponseBody
    @GetMapping("/listado/centrales/json")
    public List<Central> todas(){
        return centralService.todasCentrales();
    }
}

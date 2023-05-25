package com.inserta.ejercicio135.centrales.controllers;

import com.inserta.ejercicio135.centrales.models.Central;
import com.inserta.ejercicio135.centrales.services.CentralService;
import com.inserta.ejercicio135.tipos.Tipo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/listado")
public class CentralesController {
    private final CentralService centralService;

    public CentralesController(CentralService centralService) {
        this.centralService = centralService;
    }

    @GetMapping("/centrales")
    public String listaCentrales(){
        return "pages/listado-centrales";
    }

    @GetMapping("/centrales/")
    public String todas(Model model){
        model.addAttribute("listaCentrales", centralService.obtenerTodas());
        return "pages/listado-centrales";
    }

    @GetMapping("/centrales/activas")
    public String activas(Model model){
        model.addAttribute("listaCentrales", centralService.centralesActiva());
        return "pages/listado-centrales";
    }

    @GetMapping("/centrales/idTipo/{id}")
    public String idTipo(Model model, @PathVariable Integer id){
        Tipo tipo = new Tipo();
        tipo.setId(id);
        model.addAttribute("listaCentrales", centralService.centralTipo(tipo));
        return "pages/listado-centrales";
    }

    @GetMapping("/centrales/fecha/{year}")
    public String antesDe1975(Model model, @PathVariable Integer year){
        LocalDateTime fecha = LocalDateTime.of(year,1,1,0, 0);
        model.addAttribute("listaCentrales", centralService.inicioCentral(fecha));
        return "pages/listado-centrales";
    }

    @ResponseBody
    @GetMapping("/centrales/json")
    public List<Central> todas(){
        return centralService.obtenerTodas();
    }
}

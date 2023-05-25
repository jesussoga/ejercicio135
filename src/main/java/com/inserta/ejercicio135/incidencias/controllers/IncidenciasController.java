package com.inserta.ejercicio135.incidencias.controllers;

import com.inserta.ejercicio135.incidencias.models.Incidencia;
import com.inserta.ejercicio135.incidencias.services.IncidenciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/listado")
public class IncidenciasController {
    private final IncidenciaService incidenciaService;

    public IncidenciasController(IncidenciaService incidenciaService) {
        this.incidenciaService = incidenciaService;
    }

    @GetMapping("/incidencias")
    public String listaCentrales(){
        return "pages/listado-incidencias";
    }

    @GetMapping("/incidencias/")
    public String mostrarTodas(Model model){
        List<Incidencia> lista = this.incidenciaService.todasIncidencias();
        model.addAttribute("lista", lista);
        return "pages/listado-incidencias";
    }

    @GetMapping("/incidencias/resueltas")
    public String incidenciaResuelta(Model model){
        List<Incidencia> resuelta = this.incidenciaService.incidenciaResuelta();
        model.addAttribute("lista", resuelta);
        return "pages/listado-incidencias";
    }

    @GetMapping("/incidencias/actuales")
    public String yearActual(Model model){
        List<Incidencia> actuales = this.incidenciaService.incidenciaYearActual(LocalDateTime.of(2023,1,1,0,0),LocalDateTime.of(2023,12,31,0,0));
        model.addAttribute("lista", actuales);
        return "pages/listado-incidencias";
    }

    @ResponseBody
    @GetMapping("/incidencias/json")
    public List<Incidencia> mostrarTodas(){
        return this.incidenciaService.todasIncidencias();
    }
}

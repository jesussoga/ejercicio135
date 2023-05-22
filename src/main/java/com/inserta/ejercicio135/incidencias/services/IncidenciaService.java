package com.inserta.ejercicio135.incidencias.services;

import com.inserta.ejercicio135.incidencias.models.Incidencia;

import java.time.LocalDateTime;
import java.util.List;

public interface IncidenciaService {
    public List<Incidencia> todasIncidencias();
    public List<Incidencia> incidenciaResuelta();
    public List<Incidencia> incidenciaYearActual(LocalDateTime inicio, LocalDateTime fin);
}

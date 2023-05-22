package com.inserta.ejercicio135.incidencias.services;

import com.inserta.ejercicio135.incidencias.models.Incidencia;
import com.inserta.ejercicio135.incidencias.repos.IncidenciaRepos;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class IncidenciaServiceImpl implements IncidenciaService{

    private final IncidenciaRepos incidenciaRepos;

    public IncidenciaServiceImpl(IncidenciaRepos incidenciaRepos) {
        this.incidenciaRepos = incidenciaRepos;
    }

    @Override
    public List<Incidencia> todasIncidencias() {
        return this.incidenciaRepos.findAll();
    }

    @Override
    public List<Incidencia> incidenciaResuelta() {
        return this.incidenciaRepos.findByResueltaIsTrue();
    }

    @Override
    public List<Incidencia> incidenciaYearActual(LocalDateTime inicio, LocalDateTime fin) {
        return this.incidenciaRepos.findByFechaBetween(inicio, fin);
    }
}

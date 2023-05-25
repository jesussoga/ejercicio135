package com.inserta.ejercicio135.incidencias.repos;

import com.inserta.ejercicio135.incidencias.models.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RepositoryRestResource(path = "incidencias")
public interface IncidenciaRepos extends JpaRepository<Incidencia, Integer> {
    public List<Incidencia> findByResueltaIsTrue();
    public List<Incidencia> findByFechaBetween(LocalDateTime inicio, LocalDateTime fin);
}

package com.inserta.ejercicio135.centrales.repository;

import com.inserta.ejercicio135.centrales.models.Central;
import com.inserta.ejercicio135.tipos.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RepositoryRestResource(path = "centrales")
public interface CentralRepo extends JpaRepository<Central, Integer> {
    public List<Central> findByActivaTrue();
//    public List<Central> findByIdTipo(int i);
    public List<Central> findByTipo(Tipo tipo);
    public List<Central> findByInicioBefore(LocalDateTime fecha);

}

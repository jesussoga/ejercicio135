package com.inserta.ejercicio135.centrales.repository;

import com.inserta.ejercicio135.centrales.models.Central;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CentralRepo extends JpaRepository<Central, Integer> {
    public List<Central> findByActivaTrue();
    public List<Central> findByIdTipo(int i);
    public List<Central> findByInicioBefore(LocalDateTime fecha);

}

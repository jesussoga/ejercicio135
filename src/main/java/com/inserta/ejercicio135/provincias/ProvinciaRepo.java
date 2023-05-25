package com.inserta.ejercicio135.provincias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "provincias")
public interface ProvinciaRepo extends JpaRepository<Provincia, Integer> {
}

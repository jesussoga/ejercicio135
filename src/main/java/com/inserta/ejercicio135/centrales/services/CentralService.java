package com.inserta.ejercicio135.centrales.services;

import com.inserta.ejercicio135.centrales.models.Central;
import com.inserta.ejercicio135.tipos.Tipo;

import java.time.LocalDateTime;
import java.util.List;

public interface CentralService {
    /**
     * Método para mostrar todas las centrales nucleares que hay en la base de datos.
     * @return Lista de centrales nucleares.
     */
    public List<Central> obtenerTodas();
    public List<Central> centralesActiva();
//    public List<Central> centralTipo1(int i);
    public List<Central> centralTipo(Tipo tipo);
    public List<Central> inicioCentral(LocalDateTime fecha);

}

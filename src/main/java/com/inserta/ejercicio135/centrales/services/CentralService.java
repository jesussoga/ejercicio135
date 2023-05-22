package com.inserta.ejercicio135.centrales.services;

import com.inserta.ejercicio135.centrales.models.Central;

import java.time.LocalDateTime;
import java.util.List;

public interface CentralService {
    public List<Central> todasCentrales();
    public List<Central> centralesActiva();
    public List<Central> centralTipo1(int i);
    public List<Central> inicioCentral(LocalDateTime fecha);

}

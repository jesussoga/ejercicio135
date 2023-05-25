package com.inserta.ejercicio135.centrales.services;

import com.inserta.ejercicio135.centrales.models.Central;
import com.inserta.ejercicio135.centrales.repository.CentralRepo;
import com.inserta.ejercicio135.tipos.Tipo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class CentralServiceImpl implements CentralService{

    private final CentralRepo centralRepo;

    public CentralServiceImpl(CentralRepo centralRepo) {
        this.centralRepo = centralRepo;
    }

    @Override
    public List<Central> obtenerTodas() {
        return centralRepo.findAll();
    }

    @Override
    public List<Central> centralesActiva() {
        return centralRepo.findByActivaTrue();
    }

    @Override
    public List<Central> centralTipo(Tipo tipo) {
        return centralRepo.findByTipo(tipo);
    }

//    @Override
//    public List<Central> centralTipo1(int i) {
//        return centralRepo.findByIdTipo(i);
//    }

    @Override
    public List<Central> inicioCentral(LocalDateTime fecha) {
        return centralRepo.findByInicioBefore(fecha);
    }
}

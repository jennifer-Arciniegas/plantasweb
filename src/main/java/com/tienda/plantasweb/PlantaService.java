package com.tienda.plantasweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantaService {

    @Autowired
    private PlantaRepository plantaRepository;

    public Planta registrarPlanta(Planta planta) {
        return plantaRepository.save(planta);
    }

    public List<Planta> obtenerInventario() {
        return plantaRepository.findAll();
    }
}
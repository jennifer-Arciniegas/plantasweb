package com.tienda.plantasweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plantas")
public class PlantaController {

    @Autowired
    private PlantaService plantaService;

    @PostMapping
    public Planta registrarPlanta(@RequestBody Planta planta) {
        return plantaService.registrarPlanta(planta);
    }

    @GetMapping
    public List<Planta> obtenerInventario() {
        return plantaService.obtenerInventario();
    }
}
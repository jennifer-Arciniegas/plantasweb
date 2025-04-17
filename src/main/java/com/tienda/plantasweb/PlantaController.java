package com.tienda.plantasweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantaController {

    @Autowired
    private PlantaService plantaService;

    @GetMapping("/registrar")
    public String mostrarFormulario() {
        return "registrar";
    }

    @PostMapping("/registrar")
    public String registrarPlanta(
            @RequestParam("tipo") String tipo,
            @RequestParam("nombre") String nombre,
            @RequestParam("cantidad") int cantidad,
            @RequestParam("precioBase") double precioBase) {

        Planta planta = PlantaFactory.crearPlanta(tipo, nombre, cantidad, precioBase);
        plantaService.registrarPlanta(planta);
        return "redirect:/inventario";
    }

    @GetMapping("/inventario")
    public String mostrarInventario(Model model) {
        model.addAttribute("plantas", plantaService.obtenerInventario());
        return "inventario";
    }
}
package com.tienda.plantasweb;

public class PlantaFactory {

    public static Planta crearPlanta(String tipo, String nombre, int cantidad, double precioBase) {
        Planta planta;
        switch (tipo) {
            case "Cactus":
                planta = new Cactus();
                break;
            case "Orquidea":
                planta = new Orquidea();
                break;
            case "Rosa":
                planta = new Rosa();
                break;
            case "Suculenta":
                planta = new Suculenta();
                break;
            default:
                throw new IllegalArgumentException("Tipo de planta no válido: " + tipo);
        }
        planta.setNombre(nombre);
        planta.setCantidad(cantidad);
        planta.setPrecioBase(precioBase);
        return planta;
    }
}
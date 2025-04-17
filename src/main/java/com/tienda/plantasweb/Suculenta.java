/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.plantasweb;

/**
 *
 * @author Usuario
 */
public class Suculenta extends Planta {

    public Suculenta() {
    }

    public Suculenta(String nombre, int cantidad, double precioBase) {
        super(nombre, cantidad, precioBase);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Suculenta: " + nombre);
        System.out.println("Cantidad: " + cantidad);
    }

    @Override
    public double calcularPrecioVenta() {
        return precioBase * 1.5;
    }
}
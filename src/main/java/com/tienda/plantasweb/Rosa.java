/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.plantasweb;

/**
 *
 * @author Usuario
 */
public class Rosa extends Planta {

    public Rosa() {
    }

    public Rosa(String nombre, int cantidad, double precioBase) {
        super(nombre, cantidad, precioBase);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("rosa: " + nombre);
        System.out.println("Cantidad: " + cantidad);
    }

    @Override
    public double calcularPrecioVenta() {
        return precioBase * 1.0;
    }
}
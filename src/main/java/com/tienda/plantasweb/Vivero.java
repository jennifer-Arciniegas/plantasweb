/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.plantasweb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vivero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Planta> inventario = new ArrayList<>();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("**MENU***");
            System.out.println("1. Registrar plantas");
            System.out.println("2. Ver inventario");
            System.out.println("3. Salir");
            
            int opcion = teclado.nextInt();
            teclado.nextLine(); 
            
            switch (opcion) {
                case 1:
                    RegistrarPlanta(teclado, inventario);
                    break;
                case 2:
                    MostrarInventario(inventario);
                    break;
                case 3:
                    System.out.println("Gracias por ingresar!");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
        

    }

    private static void RegistrarPlanta(Scanner teclado, List<Planta> inventario) {
        System.out.println("Registro de plantas");
        System.out.println("Tipo:    1 Orquidea.      2. Cactus    3.Rosas   4. Suculenta");
        int tipo = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = teclado.nextInt();
        
        System.out.println("Precio Unitario: ");
        double precio = teclado.nextDouble();
        
        switch (tipo) {
            case 1:
                inventario.add(new Orquidea(nombre, cantidad, precio));
                break;
            case 2:
                inventario.add(new Cactus(nombre, cantidad,  precio));
                break;
            case 3:
                inventario.add(new Rosa(nombre, cantidad, precio));
                break;
            case 4:
                inventario.add(new Suculenta(nombre, cantidad, precio));
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }

    }

    private static void MostrarInventario(List<Planta> inventario) {
       
        System.out.println("**Inventario***");
        if (inventario.isEmpty()) {
            System.out.println("No hay plantas registradas.");
            return;
        }
        
        for(Planta planta : inventario){           
        planta.mostrarInfo();
            System.out.println("Precio Venta: " + planta.calcularPrecioVenta() + "\n");
        }
    }
}

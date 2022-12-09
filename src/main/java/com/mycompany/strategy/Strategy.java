/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strategy;

/**
 *
 * @author dvera
 */
public class Strategy {

    public static void main(String[] args) {
        AvionComercial avionComercial=new AvionComercial();
        AvionRapido avionRapido=new AvionRapido();
        
        System.out.println("Primero el avion comercial...");
        avionComercial.setAlgoritmo(new EnTierra());
        avionComercial.mover();
        avionComercial.setAlgoritmo(new EnAire());
        avionComercial.mover();
        System.out.println();
        System.out.println("Ahora el Avion rapido");
        avionRapido.setAlgoritmo(new EnTierra());
        avionRapido.mover();
        avionRapido.setAlgoritmo(new EnAireVeloz());
        avionRapido.mover();
        
        System.out.println("El avion comercial veloz");
        avionComercial.setAlgoritmo(new EnAireVeloz());
        avionComercial.mover();
    }
}

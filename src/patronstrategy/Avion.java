/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author dvera
 */
public abstract class Avion {
    private Algoritmo miAlgoritmo;

    public void setAlgoritmo(Algoritmo a){
        this.miAlgoritmo=a;
    }
    public void mover(){
        this.miAlgoritmo.moverse();
    }
}

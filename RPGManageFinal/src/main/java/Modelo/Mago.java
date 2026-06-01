/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Mago extends Personaje {
    
    protected int mana;
    
    public Mago(int mana, String nombre, int nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.mana = mana;
    }
    
}

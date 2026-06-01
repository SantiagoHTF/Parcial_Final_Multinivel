/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Guerrero extends Personaje {
    
  protected int fuerza;

    public Guerrero(int fuerza, String nombre, int nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.fuerza = fuerza;
    }
    

    
}

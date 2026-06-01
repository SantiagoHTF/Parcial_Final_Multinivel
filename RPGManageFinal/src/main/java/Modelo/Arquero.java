/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Arquero extends Personaje {
    
protected int precision;

    public Arquero(int precision, String nombre, int nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.precision = precision;
    }

    
}

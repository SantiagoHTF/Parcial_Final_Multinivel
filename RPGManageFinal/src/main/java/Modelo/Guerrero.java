
package Modelo;


public class Guerrero extends Personaje {
    
private double fuerza;

    public Guerrero(double fuerza, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.fuerza = fuerza;
    }
    

    public double getFuerza() {
        return fuerza;
    }
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
@Override
    public String getNombre() {
        return nombre;
    }
@Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public double getNivel() {
        return nivel;
    }
@Override
    public void setNivel(double nivel) {
        this.nivel = nivel;
    }
@Override
    public boolean isEstaVivo() {
        return estaVivo;
    }
@Override
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}

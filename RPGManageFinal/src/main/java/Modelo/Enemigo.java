
package Modelo;


public class Enemigo extends Personaje{
    
private double xp;

    public Enemigo(double xp, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.xp = xp;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
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

package Modelo;


public abstract class Personaje {
  protected String nombre;
  protected int nivel;
  protected double vida;
  protected double vidaMaxima;
  protected boolean estaVivo;
  protected int puntosAtaque;
  protected int puntosDefensa;
//constructor
    public Personaje(String nombre, int nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.estaVivo = estaVivo;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
    }
//metodos

    

//Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }   
}

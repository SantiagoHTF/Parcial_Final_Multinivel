
package Modelo;

import javax.swing.JOptionPane;


public abstract class Personaje {
  private int ID;
  String nombre;
  double nivel;
  private double vida;
  private double vidaMaxima;
  boolean estaVivo;
  private int puntosAtaque;
  private int puntosDefensa;
//constructor
    public Personaje(int ID,String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.estaVivo = estaVivo;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.ID = ID;
    }
//metodos
public void recibirDano(double cantidadano) {

//verificar si está vivo
if(!this.estaVivo){
    System.out.println("\n"+this.nombre+" Ya fue derrotado.");
        //si no se tiene puntos de defensa.
}else if(this.puntosDefensa == 0){
this.vida -=cantidadano;
//si el daño excede la defensa.
}else if(cantidadano > this.puntosDefensa){
double danosobrante = cantidadano - this.puntosDefensa;

this.puntosDefensa = 0;
this.vida -= danosobrante; 
}
//si los puntos de defensa pueden mitigar el daño.
else if (cantidadano>=this.puntosDefensa){
this.puntosDefensa -= cantidadano;
}
//verificar vida del personaje y stats.
if(this.vida<=0){
this.vida=0;
this.estaVivo=false;
    System.out.println(this.nombre+" murió en batlla.");
}else{
    System.out.println("Estado de: "+this.nombre+".\n"
            + "--Vida restante: "+this.vida+".\n"
                    +"--Defensa restante: "+this.puntosDefensa+".");
}   
}

public void Atacar(Enemigo ejemplo){
if(!ejemplo.isEstaVivo()){
    System.out.println(this.nombre+" no se puede atacar porque murió.");
}else{
    System.out.println(this.nombre+" ataca a "+ejemplo.getNombre());    
double cantidadano = this.getPuntosAtaque();
ejemplo.recibirDano(cantidadano);
}//Despues del ataque.
if(!ejemplo.isEstaVivo()){
    this.nivel += (0.20*ejemplo.getXp());
    System.out.println("Derrotaste a "+ejemplo.getNombre()+"ganaste xp: "+ejemplo.getXp()+"\n"
            + "Nivel actual: "+this.nivel);
}else{
        System.out.println("Estado del enemigo "+ejemplo.getNombre()+".\n"
            + "--Vida restante: "+ejemplo.getVida()+".\n"
                    +"--Defensa restante: "+ejemplo.getPuntosDefensa()+".");
}
}

public void Curarse(int puntosCuracion){
    puntosCuracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de curación."));
    while(puntosCuracion<=0){
    puntosCuracion = Integer.parseInt(JOptionPane.showInputDialog("Los puntos de curacion deben ser mayor a 0.\nIngrese nuevamente los puntos de curacion: "));
    }
if(!this.estaVivo){
    System.out.println("El personaje "+this.nombre+" no se puede curar por que está muerto.");
}
    System.out.println(this.nombre+" ha usado una habilidad de curación.");
    this.vida += puntosCuracion;
    
    if(this.vida>this.vidaMaxima){
    this.vida = this.vidaMaxima;
        System.out.println(this.nombre+" se ha curado completamente.");
    }
    System.out.println("Estado de: "+this.nombre+"\n"
            + "Vida actual: "+this.vida+"\n"
                    + "Vida maxima: "+this.vidaMaxima);
}

//Getters y setters
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getNivel() {
        return nivel;
    }
    public void setNivel(double nivel) {
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

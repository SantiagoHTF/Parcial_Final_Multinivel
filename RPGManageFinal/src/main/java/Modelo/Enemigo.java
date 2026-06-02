
package Modelo;


public class Enemigo extends Personaje{
    
private double xp;

    public Enemigo(double xp, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.xp = xp;
    }
    
@Override
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
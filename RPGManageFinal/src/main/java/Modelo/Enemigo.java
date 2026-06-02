
package Modelo;


public class Enemigo extends Personaje{
    
private double xp;

    public Enemigo(double xp, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.xp = xp;
    }
    
public void Atacar(Personaje ejemplo){
if(!ejemplo.isEstaVivo()){
    System.out.println(ejemplo.getNombre()+" no se puede atacar porque murió.");
}else{
    System.out.println(this.nombre+" ataca ferozmente a "+ejemplo.getNombre());    
double cantidadano = this.getPuntosAtaque();
ejemplo.recibirDano(cantidadano);
}//Despues del ataque.
if(!ejemplo.isEstaVivo()){
    System.out.println("Derrotaste a "+ejemplo.getNombre()+" el heroe murió.");
}else{
    System.out.println("El heroe "+ejemplo.getNombre()+" Aún sigue en pie.");
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
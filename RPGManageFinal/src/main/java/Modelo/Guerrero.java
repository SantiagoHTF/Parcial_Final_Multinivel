
package Modelo;


public class Guerrero extends Personaje {
    
private double fuerza;

    public Guerrero(double fuerza, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.fuerza = fuerza;
    }
    
@Override
        public void Atacar(Enemigo ejemplo){
if(!ejemplo.isEstaVivo()){
    System.out.println(ejemplo.nombre+" no se puede atacar porque murió.");
}else{
    System.out.println(this.nombre+" ataca a "+ejemplo.getNombre()+" con un espadazo."); 
    
double cantidadano = this.getPuntosAtaque()+(this.getFuerza()*0.20);
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

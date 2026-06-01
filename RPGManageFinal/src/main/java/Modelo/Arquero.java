
package Modelo;


public class Arquero extends Personaje {
    
private double precision;

    public Arquero(double precision, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.precision = precision;
    }

@Override
        public void Atacar(Enemigo ejemplo){
if(!ejemplo.isEstaVivo()){
    System.out.println(this.nombre+" no se puede atacar porque murió.");
}else{
    System.out.println(this.nombre+" ataca a "+ejemplo.getNombre()+" con un flechazo."); 
    
double cantidadano = this.getPuntosAtaque()+(this.getPrecision()*0.20);
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
 
    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
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

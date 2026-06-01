
package Modelo;

import javax.swing.JOptionPane;


public class Mago extends Personaje {
    
    private double mana;
    private double manaMax;

    public Mago(double manaMax,double mana, int ID, String nombre, double nivel, double vida, double vidaMaxima, boolean estaVivo, int puntosAtaque, int puntosDefensa) {
        super(ID, nombre, nivel, vida, vidaMaxima, estaVivo, puntosAtaque, puntosDefensa);
        this.mana = mana;
        this.manaMax = manaMax;
    }

    @Override
    //metodo atacar
 public void Atacar(Enemigo ejemplo){
if(!ejemplo.isEstaVivo()){
    System.out.println(this.nombre+" no se puede atacar porque murió.");
}else if(this.getMana()== 0){
    System.out.println(this.nombre+" no pudo atacar porque le falta maná.\nAsegurese de recargar el maná.");
}else{
double cantidadano = this.getPuntosAtaque()+(this.getMana()*0.20);
ejemplo.recibirDano(cantidadano);
    System.out.println(this.nombre+" ha atacado a "+ejemplo.getNombre()+" con bola de fuego!");
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
 //metodo recargar maná
 public void Recargarmana(double puntosMana){
    puntosMana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de curación."));
    while(puntosMana<=0){
    puntosMana = Integer.parseInt(JOptionPane.showInputDialog("Los puntos de curacion deben ser mayor a 0.\nIngrese nuevamente los puntos de curacion: "));
    }
if(!this.estaVivo){
    System.out.println("El personaje "+this.nombre+" no puede recargar maná por que está muerto.");
}
    System.out.println(this.nombre+" ha recargado maná.");
    this.mana += puntosMana;
    
    if(this.mana>this.manaMax){
    this.mana = this.manaMax;
        System.out.println(this.nombre+" ha restaurado totalmente le maná.");
    }
    System.out.println("Estado de: "+this.nombre+"\n"
            + "Maná: "+this.mana+"\n"
                    + "Maná maximo: "+this.manaMax);
}

    public double getManaMax() {
        return manaMax;
    }

    public void setManaMax(double manaMax) {
        this.manaMax = manaMax;
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
    
    public double getMana() {
        return mana;
    }
    public void setMana(double mana) {
        this.mana = mana;
    }  
}

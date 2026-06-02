
package Vista;

import java.util.Scanner;


public class VistaRPGManager {
    
    private final Scanner input;

    public VistaRPGManager() {
        this.input = new Scanner(System.in);
    }
    //Creado para mandar mensajes.
    public void Mensaje(String Mensaje){
        System.out.println(Mensaje);
    }
    
    public int MenuPrincipal(){
        System.out.println("-----RPGManager Menú-----\n"
                + "1. Iniciar Juego.\n"
                + "2. Salir\n"
                + "Opcion: ");   
    return input.nextInt();
    }
    
    public int CreacionPersonaje(){
        System.out.println("-----Personajes-----\n"
                + "1. Mago: Usa una bola de fuego para atacar.\n"
                + "2. Guerrero: Combate a meele con espada.\n"
                + "3. Arquero: Su precisión es letal.\n"
                + "Opcion: ");
    return input.nextInt();
    }
    
    public int MenuCombate(){
        System.out.println("------Menú de Combate-----\n"
                + "1. Atacar al enemigo.\n"
                + "2. Curarse.\n"
                + "3. Recuperar Maná (Solo magos).\n"
                + "Opcion: ");
        return input.nextInt();
    }
       
}

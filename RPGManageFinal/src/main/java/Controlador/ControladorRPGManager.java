
package Controlador;

import Modelo.Arquero;
import Modelo.Enemigo;
import Modelo.Guerrero;
import Modelo.Mago;
import Modelo.Personaje;
import Vista.VistaRPGManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorRPGManager {
    
    private  VistaRPGManager vista;
    private  Personaje heroe;
    private  Enemigo enemigo;

    private ArrayList<Personaje> ListaSup;
    public ControladorRPGManager(VistaRPGManager vista) {
        this.vista = vista;
        this.ListaSup = new ArrayList<>();
    }
    
    public void Jugar(){
    boolean salir = false;
    
    while(!salir){
    int MenuOP = vista.MenuPrincipal();
        if(MenuOP == 1){
         //metodos importantes   
        CrearPersonaje();
        Combate();
        }else if(MenuOP == 2){
 
            MostrarSup();
            
        }else{
               salir = true;
            vista.Mensaje("Gracias por jugar:)");
        }
    }
    vista.Mensaje("Gracias por jugar, vuelve pronto");
    }
    
 public void CrearPersonaje(){
 
 int Clase = vista.CreacionPersonaje();
 
     int Nid = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu ID: "));
     String Nom = JOptionPane.showInputDialog("Que nombre quieres ponerle?: ");
    
 switch(Clase){
 
     case 1:
            heroe = new Mago(100, 100, Nid, Nom, 5, 100, 100, true, 40, 50);
            System.out.println("Haz creado al Mago "+heroe.getNombre()+" y su id es "+heroe.getID());
            ListaSup.add(heroe);
         break;
     case 2:
            heroe = new Guerrero(100, Nid, Nom, 7, 100, 100, true, 100, 100);
            System.out.println("Haz creado al Mago "+heroe.getNombre()+" y su id es "+heroe.getID());
            ListaSup.add(heroe);
         break;
 
     case 3:
         heroe = new Arquero(70, Nid, Nom, 10, 100, 100, true, 40, 50);
        System.out.println("Haz creado al Arquero "+heroe.getNombre()+" y su id es "+heroe.getID());
        ListaSup.add(heroe);
         break;
 }
 }
 public void Combate(){
 enemigo = new Enemigo(10, 320, "Ogro", 5, 100, 100, true, 30, 20);
 
     System.out.println("\nSelecciona un personaje: ");
     
     for(int i = 0; i< ListaSup.size();i++){
         System.out.println(i+". "+ListaSup.get(i).getNombre());
     }
     
    int x = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Personaje: "));
   Personaje heroe = ListaSup.get(x);
     
  System.out.println("\nHaz entrado a la cueva del ogro, derrotalo para subir de nivel!");
  
  while(heroe.isEstaVivo() && enemigo.isEstaVivo()){
 int op = vista.MenuCombate();
 
 if(op == 1){
 heroe.Atacar(enemigo);
 }else if(op == 2){
 heroe.Curarse(0);
 }else if(op == 3){
 if(heroe instanceof Mago){
 ((Mago) heroe).Recargarmana(0);
 }else{
 vista.Mensaje("Acción solo para magos (Pierdes turno.)");
 }
 }
  if (enemigo.isEstaVivo()){
  double cantidadano = enemigo.getPuntosAtaque();
  heroe.recibirDano(cantidadano);
  }
  }
 if(heroe.isEstaVivo()){
     System.out.println("\nHas derrotado al ogro!");
 }else{
     System.out.println("\nEl heroe "+heroe.getNombre()+" ha muerto");
    ListaSup.remove(heroe);
 }
  
 }
 
 
 
 public void MostrarSup(){
     System.out.println("\n------Heroes que sobrevivieron------\n");
 
     if(ListaSup.isEmpty()){   
         System.out.println("No hay heroes que hayan sobrevivido.");
     }else{
     for(int i = 0; i<ListaSup.size(); i++){
     
     Personaje p = ListaSup.get(i);
     
         System.out.println("Numero: "+(i+1)+"\nID: "+p.getID()+"\nNombre: "+p.getNombre()+"\nNivel: "+p.getNivel());
     }
         
     }
 }
 
    }
    
    


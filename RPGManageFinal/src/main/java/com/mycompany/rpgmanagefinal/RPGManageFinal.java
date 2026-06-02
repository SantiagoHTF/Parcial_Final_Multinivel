
package com.mycompany.rpgmanagefinal;

import Controlador.ControladorRPGManager;
import Vista.VistaRPGManager;
import db.Conexion;

public class RPGManageFinal {

    public static void main(String[] args) {
        
        
        Conexion conectar = new Conexion();
  
        conectar.obtenerConexion();
        

        VistaRPGManager vista = new VistaRPGManager();                    
                
        ControladorRPGManager controlador = new ControladorRPGManager(vista);  
        controlador.Jugar();
    }
}
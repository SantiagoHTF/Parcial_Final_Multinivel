
package com.mycompany.rpgmanagefinal;

import Controlador.ControladorRPGManager;
import Vista.VistaRPGManager;

public class RPGManageFinal {

    public static void main(String[] args) {

        VistaRPGManager vista = new VistaRPGManager();                    
                
        ControladorRPGManager controlador = new ControladorRPGManager(vista);  
        controlador.Jugar();
    }
}
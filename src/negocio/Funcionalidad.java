/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author becal
 */
public class Funcionalidad {

    public static void main(ArrayList<Usuario> lista) {
        FileWriter file;
        try {
            file = new FileWriter("src/datos/Datos_Usuario.txt", true);
            BufferedWriter writer = new BufferedWriter(file);
            //for (int i = 0; i < lista.size(); i++) {
                writer.write("Pelicula: ");
                writer.write(lista.get(lista.size()-1).getNombre() + "    Celular: ");
                writer.write(lista.get(lista.size()-1).getCelular() + "\n");
            //}
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error en el archivo...");
        }
    }
}

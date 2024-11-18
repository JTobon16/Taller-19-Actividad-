/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller19.Ejercicio2;


import java.util.ArrayList;
import java.util.List;



public class AlmacenamientoNube implements Almacenamiento {
    
    private List<String> archivosNube = new ArrayList<>(); 

    @Override
    public void guardarArchivo(String archivo) {
        
        archivosNube.add("Contenido del archivo en la nube: " + archivo);
        System.out.println("Archivo en la nube guardado: " + archivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        
        for (String archivo : archivosNube) {
            if (archivo.contains(nombreArchivo)) {
                return archivo; 
            }
        }
        return "Archivo no encontrado en la nube.";     }
}

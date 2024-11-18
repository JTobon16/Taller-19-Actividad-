/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller19.Ejercicio2;


import java.util.ArrayList;
import java.util.List;


public class AlmacenamientoLocal implements Almacenamiento {
    
    // aqui cree la lista 
    private List<String> archivos = new ArrayList<>(); 

     // cree el metodo de guardar archivos  para que se guarde en la lista
    @Override
    public void guardarArchivo(String archivo) {
       
        archivos.add("Contenido del archivo local: " + archivo);
        System.out.println("Archivo local guardado: " + archivo);
    }
    
    //cree el metodo de recuperar el archivo y que lo busque en la lista que creamos
    @Override
    public String recuperarArchivo(String nombreArchivo) {
       
        for (String archivo : archivos) {
            if (archivo.contains(nombreArchivo)) {
                // Si se encuentra el archivo en la lista no debe devolver
                return archivo;
            }
        }
        // Si no se encuentra el archivo en la lista nos botara el mensaje
        return "Archivo no encontrado."; 
    }
}

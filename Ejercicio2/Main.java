/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller19.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Crear instancia de almacenamiento local
         Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);

        // Guardar y recuperar archivo local
        gestorLocal.guardarArchivo("Actividad1.txt");
        System.out.println(gestorLocal.recuperarArchivo("Actividad1.txt"));

        // Crear instancia de almacenamiento en la nube
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);

        // Guardar y recuperar archivo en la nube
        gestorNube.guardarArchivo("deporte.jpg");
        System.out.println(gestorNube.recuperarArchivo("deporte.jpg"));
    }
    
    
}

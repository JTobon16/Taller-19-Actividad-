/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller19.Ejercicio2;

/**
 *
 * @author altoc
 */
public class GestorArchivos {
    
    private Almacenamiento almacenamiento; // Este campo almacenará una referencia al almacenamiento

    // Constructor que recibe un objeto que implementa Almacenamiento
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento; // Se asigna el objeto de almacenamiento
    }

    // Método para guardar un archivo
    public void guardarArchivo(String archivo) {
        almacenamiento.guardarArchivo(archivo); // Llamamos al método de guardar del almacenamiento
    }

    // Método para recuperar un archivo
    public String recuperarArchivo(String nombreArchivo) {
        return almacenamiento.recuperarArchivo(nombreArchivo); // Llamamos al método de recuperar del almacenamiento
    }
}

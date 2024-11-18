/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller19.Ejercicio3;






public class GestorReportes {
    
      private GeneradorReporte generadorReporte;

    // Constructor que recibe una implementación de GeneradorReporte
    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    // Método para gestionar la generación de reportes
    public void generar() {
        generadorReporte.generar();
    }
}

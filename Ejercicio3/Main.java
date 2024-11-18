/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller19.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Crear un GestorReportes que usa ReportePDF
        GestorReportes gestorPDF = new GestorReportes(new ReportePDF());
        gestorPDF.generar();  // Salida: Generando reporte en formato PDF...

        // Crear un GestorReportes que usa ReporteExcel
        GestorReportes gestorExcel = new GestorReportes(new ReporteEXCEL());
        gestorExcel.generar();  // Salida: Generando reporte en formato Excel...
    }
    
    
}

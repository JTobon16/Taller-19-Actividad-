/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller19.Ejercicio1;

/**
 *
 * @author altoc
 */
public class GestorAutenticacion {
    
    public ServicioAutenticacion ServicioAutenticacion;
    
    
    public GestorAutenticacion(ServicioAutenticacion servicio){
        this.ServicioAutenticacion = servicio;
    }
    
    public void autenticarUsuario(String usuario, String clave){
        if (ServicioAutenticacion.autenticar(usuario, clave)){
            System.out.println("La autenticacion ha sido exitosa");
        }else {
            System.out.println("La autenticacion es fallida");}
        
    
    }
}

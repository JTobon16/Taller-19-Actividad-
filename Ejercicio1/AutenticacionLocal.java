/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller19.Ejercicio1;

/**
 *
 * @author altoc
 */
public class AutenticacionLocal implements ServicioAutenticacion{
    
        @Override
        public boolean autenticar(String usuario, String clave){
            return "altoce16".equals(usuario) && "123456789".equals(clave);
        }
    
}

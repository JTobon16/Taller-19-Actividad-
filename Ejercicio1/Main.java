
package Taller19.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // aqui se llamo el constructor y se hizo la autenticacion 
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);
        
        // se realiza la prueba
        gestorLocal.autenticarUsuario("altoce16", "123456789");
        
        // aqui se llamo el constructor de Autenticacion0Auth y se hizo la autenticacion
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);
        
        // se realiza prueba 
        gestorOAuth.autenticarUsuario("usASDVCAVDA", "ASCDADAVD");
    }
    
}

package appmedicioncerveza.framework;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public abstract class AbstractApp {

    
    public AbstractApp() {
    }

    public abstract void crearSistemaMedicion();

    public static void main(String args[]) {
        try {
            
            ((AbstractApp)Class.forName(args[0]).newInstance()).crearSistemaMedicion();
//            this.crearSistemaMedicion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbstractApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
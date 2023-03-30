
package Proyecto2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Ceballos, Christian Cusato, Jesús Matcha.
 */
public class Funciones {
    
    /**
     * Este procedimiento se encarga de crear un nuevo archivo txt en la ruta especificada.
     * @param ruta Este parámetro corresponde a un string que contiene la ruta en donde se va a crear el archivo txt correspondiente.
     */ 
    public void CrearArchivo(String ruta){
        try{
        FileWriter file= new FileWriter(ruta);
        file.close();
            JOptionPane.showMessageDialog(null, "Se creó el archivo exitosamente");
        }catch (IOException ex){
         Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    /**
     * Este procedimiento se encarga de escribir un archivo txt con la información proporcionada como parámetro en la ruta especificada.
     * @param informacion Este parámetro corresponde a un string que contiene toda la información que se desea escribir en el archivo txt.
     * @param ruta Este parámetro corresponde a un string que contiene la ruta del archivo txt donde se desea escribir.
     */
    public void Escribir_txt(String informacion, String ruta){
        try{
            PrintWriter pw = new PrintWriter(ruta);
            pw.print(informacion);
            pw.close();
            JOptionPane.showMessageDialog(null, "Archivo Escrito. ");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "ÉRROR!!! ");
        }
    }
       
    /**
     * Este método se encarga de verificar si el contenido que se encuentra dentro de un string corresponde a un número.
     * @param cadena Este parámetro corresponde a la información que se desea verificar para comprobar si su contenido corresponde a un número o no.
     * @return En este caso, el método retorna una variable de tipo boolean con el valor "true" o "false" dependiendo del resultado obtenido.
     */
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
}

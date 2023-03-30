
package Proyecto2;

import javax.swing.JOptionPane;



/**
 *
 * @author Juan Ceballos, Christian Cusato, Jesus Matcha.
 */
public class TablaHash {
    private Resumen investigacion;
    private int estado; //0 = Vacío, 1 = Eliminado, 2 = Ocupado (Esto corresponde al estatus de cada posición en la Tabla Hash)
    private int size= 10;
   
    /**
     * Este es el constructor de la clase TablaHash, el cual se encarga de inicializar todas las variables que el objeto va a tener.
     */
    public TablaHash() {
        this.investigacion = null;
        this.estado = 0;
        this.size=10;
        
      
    }
    /** Este método se encarga de obtener el índice de la Tabla Hash donde se insertará la investigación correspondiente a partir del título de la misma.
     * @param n.  Este parámetro corresponde a int que representa al tamaño que tiene el título de la investigación.
     * @param size. Este parámetro corresponde a un int que corresponde al tamaño de la Tabla Hash.
     * @return the ((n+1)%size). En este caso, el método retornará el índice donde se insertará la investigación en la Tabla Hash
     */
    static int funcionHash(int n, int size) {
        return ((n + 1) % size);
    }
    
    /** Este procedimiento se encarga de insertar cada investigación en la Tabla Hash.
     * @param h.  Este parámetro corresponde a un objeto de tipo TablaHash[] que corresponde a la Tabla Hash en la que se insertarán todas las investigaciones.
     * @param size. Este parámetro corresponde a un int que corresponde al tamaño de la Tabla Hash.
     * @param articulo. Este parámetro corresponde a un objeto de tipo Resumen que corresponde a la investigación que se insertará en la Tabla Hash.
     */
    static void insertaHash(TablaHash[] h, int size, Resumen articulo) {
        boolean i = false;
        int j = funcionHash(articulo.getTitulo().length(), size);
            do {
            if (h[j].getEstado() == 0 || h[j].getEstado() == 1) {
                h[j].setInvestigacion(articulo);
                h[j].setEstado(2);
                i = true;
            } else {
                j++;
            }
        } while (j < size && !i);
        if (i) {
            JOptionPane.showMessageDialog(null, "¡Investigacion insertada con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Tabla llena!");
        }
    }
    /** Este método se encarga de buscar cada investigación en la Tabla Hash.
     * @param h.  Este parámetro corresponde a un objeto de tipo TablaHash[] que corresponde a la Tabla Hash en la que se insertarán todas las investigaciones.
     * @param size. Este parámetro corresponde a un int que corresponde al tamaño de la Tabla Hash.
     * @param articulo. Este parámetro corresponde a un objeto de tipo Resumen que corresponde a la investigación que se insertará en la Tabla Hash.
     * @return j. En este caso, el método retornará un int que contendrá el índice de la investigación que se desea buscar.
     */
    static int buscaHash(TablaHash[] h, int size, Resumen articulo) {
        int j = funcionHash(articulo.getTitulo().length(), size);
        while (j < size) {
            if (h[j].getEstado() == 0) {
                return -1;
            } else if (h[j].investigacion == articulo) {
                if (h[j].getEstado() == 1) {
                    return -1;
                } else {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }
    /** Este método se encarga de verificar si una investigación se encuentra almacenada en la Tabla Hash.
     * @param h.  Este parámetro corresponde a un objeto de tipo TablaHash[] que corresponde a la Tabla Hash en la que se insertarán todas las investigaciones.
     * @param articulo. Este parámetro corresponde a un objeto de tipo Resumen que corresponde a la investigación que se insertará en la Tabla Hash.
     * @return found. En este caso, el método devuelve un boolean que, según su valor, podrá contribuir para verificar si un artículo se encuentra dentro de la Tabla Hash o no.
     */
    static boolean EstaEnTablaHash(TablaHash[] h, Resumen articulo){
        boolean found= false;
        for (int i = 0; i<h.length;i++){
            if((h[i].getInvestigacion().getTitulo() == articulo.getTitulo()) || (h[i].getInvestigacion().getAutores() == articulo.getAutores()) || (h[i].getInvestigacion().getCuerpo() == articulo.getCuerpo()) || (h[i].getInvestigacion().getPalabrasClave() == articulo.getPalabrasClave())){
                found= true;
            }
    }
        return found;
    }

    /** Este método se encarga de obtener un objeto Resumen que contendrá una investigación dentro de la Tabla Hash.
     * @return the investigacion. En este caso, el método retorna una variable de tipo Resumen que corresponde a la investigación que se quiere obtener de la Tabla Hash.
     */
    public Resumen getInvestigacion() {
        return investigacion;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable investigacion, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param investigacion the investigacion to set. Este parámetro corresponde a un objeto de tipo Resumen que contiene la investigación que será insertada en el contenido de la variable investigación.
     */
    public void setInvestigacion(Resumen investigacion) {
        this.investigacion = investigacion;
    }

    /** Este método se encarga de obtener un string que contendrá el estado en el que se encuentra una posición de la Tabla Hash.
     * @return the estado. En este caso, el método retorna una variable de tipo int que corresponde al estado en que se encuentra una posición en la Tabla Hash.
     */
    public int getEstado() {
        return estado;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable estado, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param estado the estado to set. Este parámetro corresponde a un int que contiene la información que será insertada en el contenido de la variable estado.
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /** Este método se encarga de obtener un int que contendrá el tamaño de la Tabla Hash.
     * @return the size. En este caso, el método retorna una variable de tipo int que corresponde al tamaño que tiene la Tabla Hash.
     */
    public int getSize() {
        return size;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable size, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param size the size to set. Este parámetro corresponde a un int que contiene la información que será insertada en el contenido de la variable size.
     */
    public void setSize(int size) {
        this.size = size;
    }
    
   
}



package Proyecto2;

/**
 *
 * @author Juan Ceballos, Christian Cusato, Jesús Matcha.
 */
public class Resumen {
    private String titulo;
    private String autores;
    private String cuerpo;
    private String palabrasClave;

    /**
     * Este es el constructor de la clase Resumen, el cual se encarga de inicializar todas las variables que el objeto va a tener.
     * @param titulo Este parámetro corresponde a un string que contendrá el título de una investigación.
     * @param autores Este parámetro corresponde a un string que contendrá los autores de una investigación.
     * @param cuerpo Este parámetro corresponde a un string que contendrá el cuerpo de una investigación.
     * @param palabrasClave Este parámetro corresponde a un string que contendrá las palabras clave de una investigación.
     */
    public Resumen(String titulo, String autores, String cuerpo, String palabrasClave) {
        this.titulo = "";
        this.autores = "";
        this.cuerpo = "";
        this.palabrasClave = "";
    }

    /** Este método se encarga de obtener un string que contendrá el título de la investigación.
     * @return the titulo. En este caso, el método retorna una variable de tipo string que corresponde al título de la investigación.
     */
    public String getTitulo() {
        return titulo;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable título, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param titulo Este parámetro corresponde a un string que contiene la información que será insertada en el contenido de la variable título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** Este método se encarga de obtener un string que contendrá los autores de la investigación.
     * @return the autores. En este caso, el método retorna una variable de tipo string que corresponde a los autores de la investigación.
     */
    public String getAutores() {
        return autores;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable autores, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param autores the autores to set. Este parámetro corresponde a un string que contiene la información que será insertada en el contenido de la variable autores.
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /** Este método se encarga de obtener un string que contendrá el cuerpo de la investigación.
     * @return the cuerpo. En este caso, el método retorna una variable de tipo string que corresponde al cuerpo de la investigación.
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable cuerpo, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param cuerpo the cuerpo to set. Este parámetro corresponde a un string que contiene la información que será insertada en el contenido de la variable cuerpo.
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    /** Este método se encarga de obtener un string que contendrá las palabras clave de la investigación.
     * @return the palabrasClave. En este caso, el método retorna una variable de tipo string que corresponde a las palabras clave de la investigación.
     */
    public String getPalabrasClave() {
        return palabrasClave;
    }

    /** Este procedimiento se encarga de actualizar el contenido de la variable palabrasClave, de modo que sustituye su contenido anterior por el contenido del parámetro correspondiente.
     * @param palabrasClave the palabrasClave to set. Este parámetro corresponde a un string que contiene la información que será insertada en el contenido de la variable palabrasClave.
     */
    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
    
}

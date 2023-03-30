
package Proyecto2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    Funciones f = new Funciones();
    TablaHash[] h = new TablaHash[10];
          
    //HashTable<String[], Integer> hash = new HashTable<>();
    
    
    public Interfaz() {
        initComponents(); 
        //String Investigacion1= "Complemento de software para el diseño de fundaciones.\n" + "Autores:" + "Raquel Sandoval " + "Iván Loscher " + "Christian Guillén-Drija\n" +"Resumen: "+
//"El adelanto tecnológico presente hoy en día ha traído una gran cantidad de herramientas útiles para los ingenieros, incorporando el uso de sistemas de información para la toma de decisiones en los procesos de cálculo y la visualización de materiales creados a través de los cálculos; así como avanza las tecnologías a usar, también deben actualizarse las herramientas para asegurar su durabilidad y fiabilidad en el tiempo. El siguiente trabajo presenta una herramienta que, con ayuda de métodos de cálculo existentes para fundaciones directas e indirectas, genera el diseño de las mismas en conjunto a través de valores ingresados por el usuario, estableciendo así un medio en el que pueda visualizarse de manera eficiente y sencilla los resultados del cálculo previamente establecido, pues automatiza el proceso de dibujo y cálculo en AutoCAD. Dicha herramienta se implementó como un complemento o extensión de software que permite el diseño y dibujo de las fundaciones con base en las librerías, funciones y modelos de AutoCAD. La extensión obtenida puede ser modificada en el tiempo para extender sus funcionalidades. La misma implementa diversos métodos para diseño de fundaciones, entre los que se cuenta Caquot-Kerisel y Meyerhof, aplicado en las fundaciones indirectas. En el caso de las fundaciones directas, implementa el método de Terzaghi y Vesic. Igualmente, se realizó un modelo de cálculo para el diseño de todas las fundaciones de la estructura, el cual fue implementado en el complemento obtenido en este trabajo de investigación.\n" +
//"Palabras claves: fundaciones directas, AutoCAD, complemento, C# \n";
        
        //String Investigacion2= "Arquitectura referencial para mecanismos de Internacionalización y localización en PHP.\n" +
//"Autores: " + "Christian Guillén Drija " + "Andrea Pérez" + "Carlos Maldonado\n" +
//"Resumen:" + "Los procesos de internacionalización y localización inciden directamente en la usabilidad de un sistema web al facilitar su adaptación a diferentes elementos culturales tales como la moneda, idioma, formato de fecha, sistema de medidas, entre otros. Algunos frameworks para aplicaciones web cuentan con soporte para dichos procesos. Sin embargo, en muchas ocasiones, la información sobre la arquitectura de los mecanismos utilizados en cada framework, así como su funcionamiento interno resulta insuficiente. La arquitectura de software se corresponde a visión abstracta de un sistema en la que se representan los componentes del mismo, el comportamiento de cada uno de dichos elementos y la forma en que se relacionan. Su uso adecuado conlleva a la disminución de los costos de manutención del software, mayor facilidad en la toma de decisiones de diseño, disminución de las fallas, entre otras ventajas. Por otra parte, la generación de una Arquitectura de Referencia (AR), es el producto con mayor relevancia generado en la etapa de Análisis del Dominio (AD), dentro de la denominada disciplina de Ingeniería del Dominio (ID), la cual tiene gran relevancia para el desarrollo de software basado en componentes. En este trabajo, se aplica un AD, asumiendo un enfoque ascendente (“bottom-up”) sobre una muestra de frameworks de desarrollo para PHP, específicamente centrado en los mecanismos que cada framework implementa para posibilitar la internacionalización y la localización en aplicaciones web. Para lograr lo anterior, se aplicó ingeniería inversa sobre las distintas arquitecturas y se modelaron en UML. Del análisis de las variantes e invariantes de las mismas, se obtuvo una Arquitectura de Referencia para un subsistema de internacionalización y localización. Si bien la muestra de arquitecturas analizadas en este trabajo se circunscriben a frameworks de desarrollo en PHP, la Arquitectura de Referencia obtenida puede ser considerada de carácter genérico, con el suficiente nivel de abstracción de manera que pueda ser asumida como una arquitectura base sobre la cual comenzar un desarrollo basado en componentes; sin embargo, su validación puede realizarse a través de la ampliación de la muestra inicial de frameworks seleccionados y el análisis de las posibles variantes que puedan generarse. No obstante, la Arquitectura de Referencia obtenida en este ejercicio de Análisis de Dominio puede utilizarse como referente dentro de una organización para evaluar la mejor opción al momento de seleccionar la alternativa arquitectónica más robusta al considerar un conjunto de frameworks de desarrollo.\n" +
//"Palabras Claves: análisis de dominio, ingeniería de dominio, PHP, arquitectura referencial, internacionalización y localización.\n";
        
        //String Investigacion3= "Sistema de diseño basado en Grid\n" +
//"Autores: " + "José Invernón" + "Christian Guillén-Drija\n" +
//"Resumen: " + "Los frameworks de diseño son conjuntos articulados de elementos y componentes gráficos que se rigen por patrones o guías de diseño. Estos favorecen el desarrollo rápido de aplicaciones web sobre la base de criterios de diseño consistentes. La mayoría de los frameworks de Frontend, basan su implementación en elementos que se distribuyen en una sola dimensión, es decir, hacen uso de Flexbox, lo cual limita el control estructural del contenido. El presente estudio, estuvo centrado en la realización de un sistema de diseño basado en Grid para interfaces gráficas de aplicaciones web. Para ello, se categorizaron los elementos de las guías de diseño de UX/UI del sistema planteado, los cuales componen los patrones que permiten definir el estilo de sus componentes. Posteriormente, se hizo una comparación entre los siguientes frameworks: Bootstrap, Clarity Design y Material Design, con el fin de seleccionar los componentes de interfaz que constituyesen el sistema de diseño propuesto en este trabajo de investigación. En una siguiente fase, se procedió a construir tales componentes con base en las propiedades de Grid. Además, se construyó un caso de estudio al que se le aplicó un conjunto de escenarios de pruebas que permitió validar la efectividad del sistema de diseño basado en Grid como herramienta para la construcción de los componentes de interfaz de usuario en el ámbito del desarrollo de aplicaciones Web. Posteriormente el sistema de diseño obtenido se aplicó a un caso de estudio que consistió en un catálogo de componentes y guías de estilo. Ambos productos son de dominio público, de manera que los potenciales usuarios del sistema de diseño pueden acceder de manera gratuita a la hoja de estilo que especifica las clases constituyentes, así como a una documentación detallada y extensa sobre su uso. Esta investigación permitió demostrar que es posible diseñar componentes de interfaz de usuario basados en propiedades Grid. Dichas propiedades permiten ordenar y posicionar los elementos del HTML de forma práctica y sencilla, haciendo uso de dos dimensiones; además de facilitar el desarrollo de sitios web responsivos. Aun cuando es posible crear elementos de interfaz de usuario solo con la propiedad Grid, como se demostró en este trabajo, su combinación con Flexbox, potencia la creación tanto de componentes como de aplicaciones debido a que con el primero, se define la estructura y con el segundo, se distribuye el contenido en cada sección.\n" +
//"Palabras claves: diseño, componentes, sistema de diseño, Grid, hojas de estilo, UX/UI.\n";
        
        //String Investigacion4= "GraphQL vs REST: una comparación desde la perspectiva de eficiencia de desempeño.\n" +
//"Autores: " + "Christian Guillén Drija" +"Reynaldo Quintero" +"Asher Kleiman\n" +
//"Resumen: " +
//"El estilo arquitectónico conocido como Transferencia de Estado Representacional (REST según sus siglas en inglés) ha modelado y estandarizado  la  comunicación cliente-servidor a través del protocolo de transferencia de hipertexto (HTTP). Según Roy Fielding, creador de REST,  este estilo consiste en un conjunto de restricciones arquitectónicas que enfatizan la escalabilidad de las interacciones entre los componentes, así co mo la generalidad las interfaces utilizadas, el despliegue independiente de dichos componentes, la aplicación de componentes intermediarios para la reducción de la latencia, la preponderancia de la seguridad y la encapsulación de los sistemas Legacy. Como consecuencia, REST se ha convertido en el estilo más aplicado en la comunicación con una Interfaz de Programación de Aplicaciones (API). Por otra parte, GraphQL es una tecnología basada en un lenguaje de consultas de datos para API’s que se ha constituido en una alternativa al estilo REST. En este trabajo de investigación, se realizó una comparación de REST y GraphQL como mecanismos arquitectónicos desde una perspectiva de calidad, específicamente  centrada en la  Eficiencia de Desempeño, en el marco del estándar ISO/IEC 9126 e ISO/IEC 25000. Las subcaracterísticas de Eficiencia de Desempeño evaluadas fueron: Comportamiento Temporal, Utilización de Recursos y Capacidad. Para cada una de dichas subcaracterísticas, se aplicaron métricas, a saber: para el Comportamiento Temporal se aplicaron las métricas Tiempo de Respuesta y Rendimiento; para la Utilización de Recursos, se aplicaron las métricas: Utilización de la Memoria, Utilización de Caché, Overfetching y Underfetching; y para Capacidad, se aplicaron las métricas Capacidad y Velocidad Bajo Estrés. Para el desarrollo de este trabajo se seleccionó un caso de estudio que permitiera evidenciar las características de los dos mecanismos. Asimismo, para la obtención de datos cuantitativos que permitiesen establecer comparaciones, se diseñaron dos API’s que con base en el caso de estudio escogido, respondieran fielmente a las restricciones que caracterizan a los dos mecanismos arquitectónicos. Los resultados obtenidos, una vez ejecutados los casos de prueba, permiten inferir que REST posee una mayor rapidez de respuesta que GraphQL. Debido a la naturaleza dinámica de las peticiones que pueden realizarse en las que se puede especificar con mayor granularidad la información requerida a través de consultas anidadas, GraphQL parece ser más eficiente en lo relativo al underfetching y al overfetching. En general, GraphQL debería utilizarse cuando se requiere menor utilización de la memoria, cuando los recursos que la API maneja están estrechamente relacionados y cuando no sea necesario utilizar la totalidad de la información obtenida. Por otra parte, REST debería utilizarse en caso de necesitarse mayor velocidad de respuesta y cuando se requiera utilizar la totalidad de la información de los recursos manejados. \n" +
//"Palabras Claves: REST, GraphQL, cliente-servidor, mecanismo arquitectónico, calidad de software.\n";
        //f.CrearArchivo("C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion1.txt");
        //f.Escribir_txt(Investigacion1, "C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion1.txt");
        //f.CrearArchivo("C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion2.txt");
        //f.Escribir_txt(Investigacion2, "C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion2.txt");
        //f.CrearArchivo("C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion3.txt");
        //f.Escribir_txt(Investigacion3, "C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion3.txt");
        //f.CrearArchivo("C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion4.txt");
        //f.Escribir_txt(Investigacion4, "C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion4.txt");
            for (int i = 0; i < 10; i++) {
                h[i] = new TablaHash();
                h[i].setEstado(0);
            }
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        AgregarResumen = new javax.swing.JButton();
        BuscarPorPalabraClave = new javax.swing.JButton();
        BuscarPorAutor = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Input9 = new javax.swing.JTextField();
        Input7 = new javax.swing.JTextField();
        Input6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Input5 = new javax.swing.JTextArea();
        AnalizarResumen = new javax.swing.JButton();
        PrecargarResumenes = new javax.swing.JButton();
        Input1 = new javax.swing.JTextField();
        Input2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Input3 = new javax.swing.JTextArea();
        Input4 = new javax.swing.JTextField();
        MostrarInvestigaciones = new javax.swing.JButton();
        Subtitulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Input8 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Input10 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        Titulo.setText("Hash Table Scientific Articles");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        AgregarResumen.setText("Agregar Resumen");
        AgregarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarResumenActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        BuscarPorPalabraClave.setText("Buscar por Palabra Clave");
        BuscarPorPalabraClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPorPalabraClaveActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarPorPalabraClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        BuscarPorAutor.setText("Buscar por Autor");
        BuscarPorAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPorAutorActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarPorAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));
        getContentPane().add(Input9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 330, 40));
        getContentPane().add(Input7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 330, 40));

        Input6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input6ActionPerformed(evt);
            }
        });
        getContentPane().add(Input6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 260, 40));

        Input5.setColumns(20);
        Input5.setRows(5);
        jScrollPane2.setViewportView(Input5);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 260, 100));

        AnalizarResumen.setText("Analizar Resumen");
        AnalizarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarResumenActionPerformed(evt);
            }
        });
        getContentPane().add(AnalizarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        PrecargarResumenes.setText("Precargar Resumenes");
        PrecargarResumenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecargarResumenesActionPerformed(evt);
            }
        });
        getContentPane().add(PrecargarResumenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input1ActionPerformed(evt);
            }
        });
        getContentPane().add(Input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 30));
        getContentPane().add(Input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        Input3.setColumns(20);
        Input3.setRows(5);
        jScrollPane3.setViewportView(Input3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 70));
        getContentPane().add(Input4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 190, 30));

        MostrarInvestigaciones.setText("Mostrar Investigaciones");
        MostrarInvestigaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInvestigacionesActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarInvestigaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        Subtitulo1.setText("Para ver los resumenes, seleccione el boton \"Mostrar Investigaciones\"");
        getContentPane().add(Subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        Input8.setColumns(20);
        Input8.setRows(5);
        jScrollPane1.setViewportView(Input8);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 330, 60));

        Input10.setColumns(20);
        Input10.setRows(5);
        jScrollPane4.setViewportView(Input10);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 330, 60));

        jLabel1.setText("Titulo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setText("Autores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel3.setText("Cuerpo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLabel4.setText("palabras");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel5.setText("Claves");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel6.setText("Nombre del autor a buscar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel7.setText("Clave del resumen que desea buscar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel8.setText("Titulo del resumen al que desea acceder ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarPorPalabraClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPorPalabraClaveActionPerformed
        try{
           if(Input9.getText().isEmpty() || Input9.getText().isBlank()){
               JOptionPane.showMessageDialog(null, "El area de texto no puede estar vacia. ");
           }else{
               for(int i=0; i<h.length;i++){
                   if(h[i].getInvestigacion().getPalabrasClave().contains(Input9.getText())){
                       Input10.setText("Titulo: "+ h[i].getInvestigacion().getTitulo()+ "\n"+ "Autores: "+ h[i].getInvestigacion().getAutores()+ "\n"+ "Cuerpo: "+ h[i].getInvestigacion().getCuerpo()+ "\n"+ "Palabras Clave: "+h[i].getInvestigacion().getPalabrasClave());
                   }
               }
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, por favor, intentelo de nuevo");
        }       
    }//GEN-LAST:event_BuscarPorPalabraClaveActionPerformed

    private void AgregarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarResumenActionPerformed
        String aux="";
        String texto="";
        String[] resumen;
        String titulo= Input1.getText() + "\n";
        String autores= Input2.getText()+ "\n";
        String cuerpo= Input3.getText()+ "\n";
        String palabrasClave= Input4.getText()+ "\n";
        String ruta= "C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\Investigacion5.txt";
        try{
          if((Input1.getText().isEmpty()|| Input1.getText().isBlank()) || (Input2.getText().isEmpty()|| Input2.getText().isBlank()) || (Input3.getText().isEmpty()|| Input3.getText().isBlank()) || (Input4.getText().isEmpty()|| Input4.getText().isBlank())){
             JOptionPane.showMessageDialog(null, "El área de texto no puede estar vacía. ");
            }else{
             //f.CrearArchivo(ruta);
              f.Escribir_txt(titulo, ruta);
              f.Escribir_txt(autores, ruta);
              f.Escribir_txt(cuerpo, ruta);
              f.Escribir_txt(palabrasClave, ruta);
              JFileChooser file=new JFileChooser();
            file.showOpenDialog(this);   
            File abre=file.getSelectedFile();
            if(abre!=null){     
           FileReader archivos=new FileReader(abre);
           BufferedReader lee=new BufferedReader(archivos);
           while((aux=lee.readLine())!=null)
           {
              texto+= aux+ "\n";
           }
           resumen= texto.split("\n");
              Resumen resumen_actual= new Resumen(resumen[0], resumen[1], resumen[2], resumen[3]);
              boolean found= TablaHash.EstaEnTablaHash(h, resumen_actual);
              if (found == true){
                  JOptionPane.showMessageDialog(null, "La investigacion que se quiere agregar ya se encuentra en la tabla. Por favor, introduzca otra investigacion");
              }else{
                  TablaHash.insertaHash(h, 10, resumen_actual);
              
                    lee.close();
                    JOptionPane.showMessageDialog(null, "Exito al registrar");
              }
              
            }    
          }
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, por favor, inténtelo de nuevo");
        }
  
    }//GEN-LAST:event_AgregarResumenActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        String ruta= "C:\\Users\\Juan Ceballos\\Desktop\\Unimet\\Materias 8vo Trimestre\\Estructuras de Datos\\Semana 12\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyect-2-Cusato-Ceballos-Matcha-main\\Proyecto2.JuanCeballos.ChristianCusato.JesusMatcha\\src\\test\\java\\NuevaInvestigacion.txt";
        String titulo= Input1.getText();
        String autores= Input2.getText();
        String cuerpo= Input3.getText();
        String palabrasClave= Input4.getText();
        try{
            if ((!Input1.getText().isEmpty() || !Input1.getText().isBlank()) || (!Input2.getText().isEmpty() || !Input2.getText().isBlank()) || (!Input3.getText().isEmpty() || !Input3.getText().isBlank()) || (!Input4.getText().isEmpty() || !Input4.getText().isBlank())){
                f.CrearArchivo(ruta);
                f.Escribir_txt(titulo, ruta);
                f.Escribir_txt(autores, ruta);
                f.Escribir_txt(cuerpo, ruta);
                f.Escribir_txt(palabrasClave, ruta);
                JOptionPane.showMessageDialog(null, "Listo!!! Ya se ha guardado toda la informacion necesaria. Hasta pronto!!!1");
                System.exit(0);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, por favor, inténtelo de nuevo");
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void PrecargarResumenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecargarResumenesActionPerformed
         String aux="";
         String texto="";
         String[] resumen;
     try{
         
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);   
        File abre=file.getSelectedFile();
        if(abre!=null){     
           FileReader archivos=new FileReader(abre);
           BufferedReader lee=new BufferedReader(archivos);
           while((aux=lee.readLine())!=null)
           {
              texto+= aux+ "\n";
           }
           resumen= texto.split("\n");
           Resumen resumen_actual= new Resumen(resumen[0], resumen[1], resumen[2], resumen[3]);
           TablaHash.insertaHash(h, 10, resumen_actual);
           lee.close();
           JOptionPane.showMessageDialog(null, "Exito al leer");
         }    
        }
        catch(IOException ex)
        {
          JOptionPane.showMessageDialog(null,ex+"" + "\nNo se ha encontrado el archivo","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
     
        
        
   }   
    }//GEN-LAST:event_PrecargarResumenesActionPerformed

    private void AnalizarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarResumenActionPerformed
           
        try{
            if(Input6.getText().isEmpty()|| Input6.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "El área de texto no puede estar vacía.  ");
            }else{
                for (int i= 0; i<h.length; i++){
                    if (Input6.getText() == h[i].getInvestigacion().getTitulo()){
                         Input5.setText("Titulo del Articulo: "+h[i].getInvestigacion().getTitulo() + "\n"+ "Autores: "+h[i].getInvestigacion().getAutores()+ "\n"+ "Cuerpo: "+h[i].getInvestigacion().getCuerpo()+ "\n"+ "Palabras Clave: "+h[i].getInvestigacion().getPalabrasClave());
                    }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, por favor, intentelo de nuevo");
        }
    }//GEN-LAST:event_AnalizarResumenActionPerformed

    private void MostrarInvestigacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInvestigacionesActionPerformed
        try{
            for (int i = 0; i<10;i++){
                Input5.setText(h[i].getInvestigacion().getTitulo() + "\n" +h[i].getInvestigacion().getAutores() + "\n"+ h[i].getInvestigacion().getCuerpo()+ "\n"+ h[i].getInvestigacion().getPalabrasClave());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, por favor, intentelo de nuevo");
        }
    }//GEN-LAST:event_MostrarInvestigacionesActionPerformed

    private void BuscarPorAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPorAutorActionPerformed
        try{
           if(Input7.getText().isEmpty() || Input7.getText().isBlank()){
               JOptionPane.showMessageDialog(null, "El area de texto no puede estar vacia. ");
           }else{
               for(int i=0; i<h.length;i++){
                   if(h[i].getInvestigacion().getAutores().contains(Input7.getText())){
                       Input8.setText("Titulo: "+ h[i].getInvestigacion().getTitulo()+ "\n"+ "Autores: "+ h[i].getInvestigacion().getAutores()+ "\n"+ "Cuerpo: "+ h[i].getInvestigacion().getCuerpo()+ "\n"+ "Palabras Clave: "+h[i].getInvestigacion().getPalabrasClave());
                   }
               }
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, por favor, intentelo de nuevo");
        }
    }//GEN-LAST:event_BuscarPorAutorActionPerformed

    private void Input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input1ActionPerformed

    private void Input6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarResumen;
    private javax.swing.JButton AnalizarResumen;
    private javax.swing.JButton BuscarPorAutor;
    private javax.swing.JButton BuscarPorPalabraClave;
    private javax.swing.JTextField Input1;
    private javax.swing.JTextArea Input10;
    private javax.swing.JTextField Input2;
    private javax.swing.JTextArea Input3;
    private javax.swing.JTextField Input4;
    private javax.swing.JTextArea Input5;
    private javax.swing.JTextField Input6;
    private javax.swing.JTextField Input7;
    private javax.swing.JTextArea Input8;
    private javax.swing.JTextField Input9;
    private javax.swing.JButton MostrarInvestigaciones;
    private javax.swing.JButton PrecargarResumenes;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

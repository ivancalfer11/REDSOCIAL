import java.util.ArrayList;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.io.File;
import java.awt.Desktop;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{

    private ArrayList<Entrada> entradas;

    /**
     * Constructor for objects of class Muro
     */
    public Muro  ()
    {

        entradas = new ArrayList<>();
    }

    public void addEntradas(Entrada entradasNuevas){
        entradas.add(entradasNuevas);              
    }

    public String toString()
    {
        String cadenaADevolver = "";

        for (Entrada entrada : entradas)
        {
            cadenaADevolver += entrada + "\n ";
        }

        return cadenaADevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    /*
     * Metodo que devuelve el total de los datos asociados a Entrada 
     * de las clases texto foto y grupo
     */
   

    public void mostrarDatosExclusivosEntradasFiltradas(String entradasFiltradas, String autor ){

        for(Entrada entrada : entradas){
            String textoAComparar = entrada.getClass().getSimpleName();
            String autorAComparar = autor.getClass().getSimpleName();

            if(entradasFiltradas == textoAComparar || autor == autorAComparar || entradasFiltradas == null){
                //Hacemos las comprobaciones necesarias para imprimir 
                if(entrada instanceof  EntradaTexto){
                    ((EntradaTexto)entrada).mostrarDatosExclusivos();

                }
            }

            if(entradasFiltradas == textoAComparar || autor == autorAComparar || entradasFiltradas == null){

                if(entrada instanceof EntradaFoto){
                    ((EntradaFoto)entrada).mostrarDatosExclusivos();
                }
            }

            if(entradasFiltradas == textoAComparar || autor == autorAComparar || entradasFiltradas == null){
                if(entrada instanceof EntradaUnionAGrupo){
                    ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                }
            }
        }
    }

    public void mostrarMuroEnNavegador(){
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            Path rutaArchivo = Paths.get("output.html");



            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            File archivoHtml = new File("output2.html");
            

            archivo.write("<html>");
            archivo.write("<head>");
            archivo.write("<link rel= \"stylesheet\" type=\"text/css\" href=\"diseniocss.css\" media=\"screen\"/>");
            archivo.write("<h1 color= green align=center>"+"<b>"+"Mi red social"+"</b>"+"</h1>");
            archivo.write("<img src=facebook.png>");
            archivo.write("</head>");
            archivo.write("<body bgcolor=red background=sfondo.gif>");
            archivo.write("<p align=center>"+toString()+"</p>");
            
            
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
         try 
         {  
         File objetofile = new File ("output.html");
         Desktop.getDesktop().open(objetofile);
        }
        catch (IOException ex)
        {

            System.out.println(ex);

        }
    }

}
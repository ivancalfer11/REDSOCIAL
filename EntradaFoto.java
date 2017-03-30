import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


public class EntradaFoto extends EntradaConComentarios
{
    private String urlImagen;
    private String titulo; 
    private String tipoEntrada;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
        tipoEntrada = "EntradaFoto";
    }
    
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }    
   
    
    public String toString()
    {
        String cadenaADevolver = "";

        cadenaADevolver += super.toString();
        
        cadenaADevolver += "<b>" + titulo + "</b>" + "\n";
        cadenaADevolver +="<b>" + urlImagen + "</b>" + "\n";
       
        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    public int getCantidadDatosAsociados()
    {
        return 6;
    }
       
    public void mostrarDatosExclusivos()
    {
        System.out.println(urlImagen + titulo);
    }
    public String getTipoEntrada()
    {
        return tipoEntrada;
    }
    
    

}
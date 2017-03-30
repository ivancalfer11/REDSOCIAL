import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


public class EntradaTexto extends EntradaConComentarios
{
    private String mensaje;
    private String tipoEntrada;


    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
        tipoEntrada = "EntradaTexto";
        
    }

    public String getMensaje()
    {
        return mensaje;
    }
   
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver = super.toString();  
        
        cadenaADevolver += "<p>"+"Mensaje"+":"+" "+"<b>"+mensaje+"</b>"+"<p>" + "\n"; 
        
        return cadenaADevolver;
    }
    
 
    public void mostrar()
    {
        System.out.println(this);
    }
    public int getCantidadDeDatosAsociados()
    {
        return 5;
    }
     public void mostrarDatosExclusivos()
    {
        System.out.println(mensaje);
    }
    public String getTipoEntrada()
    {
        return tipoEntrada;
    }

}

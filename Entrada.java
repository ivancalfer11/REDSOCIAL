import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;


    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;     
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }    
    
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
        
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver+= "<html>" + "<br/>" + "<head>" + "<br/>" + "<h1>" + "<br/>" + "<br/>" + "</h1>" + "<br/>" + "</head>";
        cadenaADevolver += "<b>"+"Usuario"+"</b>"+ ":" + getUsuario() + "<br/>";
        cadenaADevolver += "<b>"+getCantidadMeGusta()+"</b>" + " me gusta" + "<br/>";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += "<b>"+minutosQueHanPasadoDesdeCreacion+"<b/>" + " minutos ";
        }
        cadenaADevolver += "<b>"+segundosResiduales + "</b>" + " segundos"+"<br/>";                
        
        return cadenaADevolver;
    }
    
    public String getUsuario()
    {
        return usuario;
    }

    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;
    }
    
    public void mostrar()
    {
    }
    

}


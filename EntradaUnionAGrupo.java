import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAgrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;
    private String tipoEntrada;
    
    /**
     * Constructor for objects of class EntradaUnionAgrupo
     */
    public EntradaUnionAGrupo(String usuario, String grupo)
    {
        super(usuario);
        this.grupo = grupo;
        tipoEntrada = "EntradaUnionAGrupo";
    }


    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        
        cadenaADevolver += "Se ha unido al grupo " + grupo + "\n";   
        
            
        return cadenaADevolver;        
    }
    
    
    public void mostrar()
    {
        System.out.println(this);
    }
    public int getCantidadDedatosAsociados()
    {
        return 5;
    }
    public void mostrarDatosExclusivos()
    {
        System.out.println(grupo);
    }
    public String getTipoEntrada()
    {
        return tipoEntrada;
    }
        
}
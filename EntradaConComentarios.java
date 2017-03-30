import java.util.ArrayList;
/**
 * Write a description of class EntradaConComentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentarios extends Entrada
{
    private ArrayList<String> comentarios;
    

    /**
     * Constructor for objects of class EntradaConComentarios
     */
    public EntradaConComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<>();   
    }
    

    public void addComentario(String texto)
    {
        comentarios.add(texto);        
    } 
    
    
    public ArrayList<String> getComentarios() 
    {
        return comentarios;
    }    
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        
        if (getComentarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.\n";
        }
        else {
            //Se recopilan los comentarios
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario + "\n";
            }
        }          
        
        return cadenaADevolver;
    }
    public void mostrarDatosExclusivos()
    {
        
    }

}


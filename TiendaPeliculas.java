import java.util.ArrayList;
/**
 * Write a description of class TiendaPeliculas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TiendaPeliculas
{
    //Una coleccion de peliculas
    private ArrayList<Peliculas> listaDePeliculas;
    /**
     * Constructor for objects of class TiendaPeliculas
     */
    public TiendaPeliculas()
    {
        listaDePeliculas = new ArrayList<>();   
    }
    
    
    /**
     * Metodo para agregar peliculas a la coleccion
     */
    public void addPelicula(int year, String title, String director,String gender)
    {
        int identificator = listaDePeliculas.size();
        // El propio metodo le indica un identificador
        Peliculas nuevaPelicula = new Peliculas(year,title,director,gender,identificator);
        listaDePeliculas.add(nuevaPelicula);
    }
}

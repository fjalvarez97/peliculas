import java.util.ArrayList;
import java.util.Collections;
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
        int identificador = listaDePeliculas.size();
        // El propio metodo le indica un identificador
        Peliculas nuevaPelicula = new Peliculas(year,title,director,gender,identificador);
        listaDePeliculas.add(nuevaPelicula);
    }
    
    /**
     * Metodo para obtener todas las informaciones de las peliculas 
     * que haya en la lista
     */
    public void infoColection()
    {
        int index = 0;
        while(listaDePeliculas.size() > index)
        {
            System.out.println(listaDePeliculas.get(index).getInfo());
            index++;
        }
    }
    
    /**
     * Metodo para obtener las peliculas ordenadas por el year
     */

    /**
     * Metodo para cambiar una de las caracteristicas del objeto mediante el numero 
     * identificativo (En este caso cambia el year de publicacion de la pelicula.
     */
    
    public void changeYear(int identificator,int year)
    {
        if (listaDePeliculas.size()>0)
        {
            // Coge de la lista la pelicula que este en la posicion del identificador
            // (ya que el identificador empieza en 0 y cambia el year mediante el metodo 
            // setYear
            listaDePeliculas.get(identificator).setYear(year);
        }
    }
    
    /**
     * Metodo para cambiar una de las caracteristicas del objeto mediante el numero 
     * identificativo (En este caso cambia el director de la pelicula.
     */
    public void changeDirector(int identificator,String director)
    {
        if (listaDePeliculas.size()>0)
        {
            listaDePeliculas.get(identificator).setDirector(director);
        }
    }
    
}


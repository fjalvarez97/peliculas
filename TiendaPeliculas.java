import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    
    public void orderYear()
    {
        ArrayList<Peliculas> copiaColeccion = listaDePeliculas;
        for (int i = 0; i < copiaColeccion.size(); i=0)
        {
            int primerYear = copiaColeccion.get(i).getYear();
            for (int j = 0; j < copiaColeccion.size(); j++)
            {
                int yearActual = copiaColeccion.get(i).getYear();
                
            }
        }
    }

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
    
    /**
     * Metodo que permite eliminar los objetos cuyo year sea igual
     * al que le pasamos por pantalla mediante un iterador
     */
    public void removeYear(int year)
    {
        Iterator<Peliculas> iterator = listaDePeliculas.iterator();
        while (iterator.hasNext())
        {
            Peliculas peliActual = iterator.next();
            if(peliActual.getYear() == year)
            {
                iterator.remove();
            }
        }   
    }
    
    /**
     * Metodo que permite eliminar los objetos cuyo director sea el mismo
     * al que le pasamos por pantalla mediante un iterador
     */
    public void removeDirector(String director)
    {
        Iterator<Peliculas> iterator = listaDePeliculas.iterator();
        while (iterator.hasNext())
        {
            Peliculas peliActual = iterator.next();
            if(peliActual.getDirector().toLowerCase().equals(director.toLowerCase()))
            {
                iterator.remove();
            }
        }   
    }
}


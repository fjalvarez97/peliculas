import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
    public TiendaPeliculas(String  nombreArchivo)
    {
        listaDePeliculas = new ArrayList<>(); 
        try 
        {
            File archivo = new File(nombreArchivo);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) 
            {
                String a = sc.nextLine();
                String[] partes = (a.split(" # "));
                addPelicula(Integer.parseInt(partes[0]),partes[1],partes[2],partes[3]);
            }
            sc.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }

    /**
     * Metodo para agregar peliculas a la coleccion
     */
    public void addPelicula(int year, String title, String director,String gender)
    {
        int identificador = listaDePeliculas.size();
        // El propio metodo le indica un identificador
        if (year > 0)
        {
            Peliculas nuevaPelicula = new Peliculas(year,title,director,gender,identificador);
            listaDePeliculas.add(nuevaPelicula);
        }
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
     * Metodo para obtener las peliculas ordenadas por el year de mayor a menor
     */
    public void orderYear() 
    {
        ArrayList<Peliculas> copiaColeccion = (ArrayList<Peliculas>) listaDePeliculas.clone();
        for(int i = 0; i < copiaColeccion.size(); i = 0) 
        {
            Peliculas primerElemento = copiaColeccion.get(i);
            for(int j = 0; j < copiaColeccion.size(); j++) 
            {
                Peliculas elementoActual = copiaColeccion.get(j);
                if (elementoActual.getYear() > primerElemento.getYear()) 
                {
                    primerElemento = elementoActual;
                }
            }
            copiaColeccion.remove(primerElemento);
            System.out.println(primerElemento.getInfo());
        }

    }

    /**
     * Metodo para obtener las peliculas ordenadas alfabeticamente
     * por el nombre del director
     */
    public void orderDirector() 
    {
        ArrayList<Peliculas> copiaColeccion = (ArrayList<Peliculas>) listaDePeliculas.clone();
        for(int i = 0; i < copiaColeccion.size(); i = 0) 
        {
            Peliculas primerElemento = copiaColeccion.get(i);
            for(int j = 0; j < copiaColeccion.size(); j++) 
            {
                Peliculas elementoActual = copiaColeccion.get(j);
                if (elementoActual.getDirector().compareTo(primerElemento.getDirector())<=0) 
                {
                    primerElemento = elementoActual;
                }
            }
            copiaColeccion.remove(primerElemento);
            System.out.println(primerElemento.getInfo());
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


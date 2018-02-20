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
    private ArrayList<Pelicula> listaDePeliculas;

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
            Pelicula nuevaPelicula = new Pelicula(year,title,director,gender,identificador);
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
            System.out.println(listaDePeliculas.get(index));
            index++;
        }
    }

    /**
     * Metodo para obtener las peliculas ordenadas por el year de mayor a menor
     */
    public void orderYear() 
    {
        ArrayList<Pelicula> copiaColeccion = (ArrayList<Pelicula>) listaDePeliculas.clone();
        for(int i = 0; i < copiaColeccion.size(); i = 0) 
        {
            Pelicula primerElemento = copiaColeccion.get(i);
            for(int j = 0; j < copiaColeccion.size(); j++) 
            {
                Pelicula elementoActual = copiaColeccion.get(j);
                if (elementoActual.getYear() > primerElemento.getYear()) 
                {
                    primerElemento = elementoActual;
                }
            }
            copiaColeccion.remove(primerElemento);
            System.out.println(primerElemento);
        }

    }

    /**
     * Metodo para obtener las peliculas ordenadas alfabeticamente
     * por el nombre del director
     */
    public void orderDirector() 
    {
        ArrayList<Pelicula> copiaColeccion = (ArrayList<Pelicula>) listaDePeliculas.clone();
        for(int i = 0; i < copiaColeccion.size(); i = 0) 
        {
            Pelicula primerElemento = copiaColeccion.get(i);
            for(int j = 0; j < copiaColeccion.size(); j++) 
            {
                Pelicula elementoActual = copiaColeccion.get(j);
                if (elementoActual.getDirector().compareTo(primerElemento.getDirector())<=0) 
                {
                    primerElemento = elementoActual;
                }
            }
            copiaColeccion.remove(primerElemento);
            System.out.println(primerElemento);
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
        Iterator<Pelicula> iterator = listaDePeliculas.iterator();
        while (iterator.hasNext())
        {
            Pelicula peliActual = iterator.next();
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
        Iterator<Pelicula> iterator = listaDePeliculas.iterator();
        while (iterator.hasNext())
        {
            Pelicula peliActual = iterator.next();
            if(peliActual.getDirector().toLowerCase().equals(director.toLowerCase()))
            {
                iterator.remove();
            }
        }   
    }

    /**
     * Muestra los objetos de la coleccion divididos por su genero.
     */

    public void showByGender()
    {
        ArrayList<String> generosObtenidos = new ArrayList<>();
        for(int i = 0; i < listaDePeliculas.size(); i++) 
        {
            Pelicula primeraPelicula = listaDePeliculas.get(i);
            ArrayList <Pelicula> pelisPorGenero = new ArrayList<>();
            if(!generosObtenidos.contains(primeraPelicula.getGender()))
            {
                System.out.println(primeraPelicula.getGender() + ":");
                for(int j = 0; j < listaDePeliculas.size(); j++) 
                {
                    generosObtenidos.add(primeraPelicula.getGender());
                    Pelicula peliActual = listaDePeliculas.get(j);
                    if (peliActual.getGender().equals(primeraPelicula.getGender())) 
                    {
                        pelisPorGenero.add(peliActual);
                    }
                }
                for(int j = 0; j < pelisPorGenero.size(); j=0) 
                {
                    Pelicula primeraPeliAlfabet = pelisPorGenero.get(0);
                    for(int k = 0; k < pelisPorGenero.size(); k++) 
                    {
                        Pelicula peliAOrdenar = pelisPorGenero.get(k);
                        if (peliAOrdenar.getTitle().compareToIgnoreCase(primeraPeliAlfabet.getTitle())<=0)
                        { 
                            primeraPeliAlfabet = peliAOrdenar;
                        }  
                    }
                    System.out.println(primeraPeliAlfabet);
                    pelisPorGenero.remove(primeraPeliAlfabet);
                }
            }
            System.out.println();
        }
    }

    /**
     * Ordena un ArrayList de peliculas por su titulo alfabeticamente
     */
    public void orderByTitle()
    {
        for(int i = 0; i < listaDePeliculas.size(); i++) 
        {

            for(int j = 0; j < listaDePeliculas.size(); j++) 
            {
            }
        }
    }
}


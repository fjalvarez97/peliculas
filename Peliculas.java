
/**
 * Write a description of class Peliculas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Peliculas
{
    //Indica el year de salida de la pelicula
    private int year;
    //Indica el titulo de la pelicula
    private String title;
    //Indica el nombre del director de la pelicula
    private String director;
    /**
     * Constructor for objects of class Peliculas
     */
    public Peliculas(int year, String title, String director)
    {
        this.year = year;
        this.title = title;
        this.director = director;
    }

    /**
     * Metodo setter del campo year para
     * indicar el year de salida de la pelicula.
     */
    public void setYear(int year)
    {
        this.year = year;
    }
    
    /**
     * Metodo getter del campo year.
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * Metodo setter del campo title para
     * indicar el titulo de la pelicula.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Metodo getter del campo title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Metodo setter del campo director para
     * indicar el director de la pelicula.
     */
    public void setDirector(String director)
    {
        this.director = director;
    }
    
    /**
     * Metodo getter del campo title.
     */
    public String getDirector()
    {
        return director;
    }
}

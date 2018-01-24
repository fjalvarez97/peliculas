
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
    //Indica el genero de la pelicula
    private String gender;
    //Numero que identifica a la pelicula
    private int identificator;
    /**
     * Constructor for objects of class Peliculas
     */
    public Peliculas(int year, String title, String director, String gender, int identificator)
    {
        this.year = year;
        this.title = title;
        this.director = director;
        this.gender = gender;
        this.identificator = identificator;
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
    
    /**
     * Metodo setter del campo gender para
     * indicar el genero de la pelicula.
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    /**
     * Metodo getter del campo gender.
     */
    public String getGender()
    {
        return gender;
    }
    
    /**
     * Metodo setter del campo identificator para
     * indicar el numero que identifica a la pelicula.
     */
    public void setIdentificator(int identificator)
    {
        this.identificator = identificator;
    }
    
    /**
     * Metodo getter del campo identificator.
     */
    public int getIdentificator()
    {
        return identificator;
    }
    
    /**
     * Metodo para obterner toda la informacion
     * de la pelicula.
     */
    public String getInfo()
    {
        String info = "";
        info ="Identificador: " + identificator +  " Titulo: " + title + " Director " + director + " Genero: " + gender +  " Anio de salida: " + year;
        return info;
    }
}

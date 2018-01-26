
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public void test()
    {
        TiendaPeliculas listaDePelis = new TiendaPeliculas();
        listaDePelis.addPelicula(1920,"El señor de los anillos","Pepe Alvarez","Accion");
        listaDePelis.addPelicula(1200,"Pepa Pig","Cristopher Nollan","Comedia");
        listaDePelis.addPelicula(1835,"Matrix","Luis Perez","Accion");
        listaDePelis.addPelicula(2000,"Juego de Tronos","Jose Bono","Drama");
        listaDePelis.addPelicula(2000,"Juego de Tronos2","Jose Bono2","Drama");
        listaDePelis.addPelicula(1952,"Torrente","Martin Martin","Drama");
        listaDePelis.addPelicula(2015,"Los Mosqueteros","Miki Fernandez","Thriller");
        System.out.println("Coleccion: ");
        listaDePelis.infoColection();
        System.out.println("-------------------------------");
        System.out.println("Coleccion ordenada por el year: ");
        listaDePelis.orderYear();
        System.out.println("-------------------------------");
        System.out.println("Coleccion ordenada por el nombre del director: ");
        listaDePelis.orderDirector();
        System.out.println("-------------------------------");
        System.out.println("Coleccion con Modificacion de Year/Director: ");
        listaDePelis.changeYear(4,2000);
        listaDePelis.changeDirector(2,"Nuevo Director");
        listaDePelis.infoColection(); 
        System.out.println("-------------------------------");
        System.out.println("Coleccion con Borrados: ");
        listaDePelis.removeYear(2000);
        listaDePelis.removeYear(1952);
        listaDePelis.removeDirector("Jose Bono");
        listaDePelis.infoColection(); 
    }
}

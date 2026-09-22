public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien Años de Soledad","Gabriel Garcia Marquez");
        Libro libro2 = new Libro("El Amor en Tiempos de Colera","Gabriel Garcia Marquez");
        Libro libro3 = new Libro("El principito","Antoine de Saint-Exupéry");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Angel Arango");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel Garcia Marquez");
        System.out.println();
        biblioteca.buscarPorAutor("Jorge Luis Borges");       
    }
}
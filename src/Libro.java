public class Libro {
    
    //Atributos
    private String titulo;
    private String autor;
    private Boolean disponible;

    //* Constructor
    Libro() {
        this("", "");
        this.disponible = true;
    }

    //* 2do Constructor
    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    //* 3ro Constructor
    Libro(String titulo, String autor, Boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }


    //?Getters

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public Boolean isDisponible() {
        return disponible;
    }

    //? Setters
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: el titulo no puede estar vacio.");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //* Metodos

    //Imprime los datos del libro en consola
    public void mostrarInfo() {
        System.out.println("---- Libro ----");
        System.out.println("Titulo  : " + titulo);
        System.out.println("Autor   : " + autor);
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
    }

    //Marca el libro como prestado
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\"fue prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" ya esta prestado");
            return false;
        }
    }

    //Marca el libro como devuelto
    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto");
    }
}
package org.example;

public class Obra {
    private String titulo;
    private String autor;

    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor;
    }

    public boolean equals(Obra obra) {
        return this.titulo == obra.titulo && this.autor == obra.autor;
    }
}

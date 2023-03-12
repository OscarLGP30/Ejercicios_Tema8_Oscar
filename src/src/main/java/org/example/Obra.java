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

public static void main(String[] args) {
    Obra obra1 = new Obra("El principito", "Antoine de Saint-Exupéry");
    Obra obra2 = new Obra("Perçy jackson", "Rick Riordan");
    Obra obra3 = new Obra("La vida es bella", "Roberto Benigni");
    Obra obra4 = new Obra("El niño con el pijama de rayas", "John Boyne");
    Obra obra5 = new Obra("El fotografo de mauthausen", "Mar Targarona");


    obra1.mostrar();
    obra2.mostrar();
    obra3.mostrar();
    obra4.mostrar();
    obra5.mostrar();

    System.out.println(obra1);
    System.out.println(obra2);
    System.out.println(obra3);
    System.out.println(obra4);
    System.out.println(obra5);

    System.out.println(obra1.equals(obra2));
    System.out.println(obra1.equals(obra3));
    System.out.println(obra1.equals(obra4));
    System.out.println(obra1.equals(obra5));
    System.out.println(obra2.equals(obra3));
    System.out.println(obra2.equals(obra4));
    System.out.println(obra2.equals(obra5));
    System.out.println(obra3.equals(obra4));
    System.out.println(obra3.equals(obra5));
    System.out.println(obra4.equals(obra5));
    }
}

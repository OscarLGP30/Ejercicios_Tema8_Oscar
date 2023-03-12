package org.example;

public class JugadorGuerra {
    // Dos jugadores se enfrentan en una guerra de dados: (cada jugador tiene un dado de seis caras y diez fichas).

    //Cree una clase JugadorGuerra, que tenga como atributos de instancia el número de fichas, un dado (una instancia de la clase Dado) y el nombre del jugador.

    // Agregue dentro de esta clase el resto de elementos necesarios.

    // Cree un algoritmo principal usando esta clase.


    private int fichas;
    private Dado dado;
    private String nombre;

    public JugadorGuerra(int fichas, Dado dado, String nombre) {
        this.fichas = fichas;
        this.dado = dado;
        this.nombre = nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int tirarDado() {
        return dado.tirar();
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fichas: " + fichas);
        System.out.println("Dado: " + dado);
    }

    public void jugar(JugadorGuerra jugador) {
        int dado1 = this.tirarDado();
        int dado2 = jugador.tirarDado();

        if (dado1 > dado2) {
            this.fichas++;
            jugador.fichas--;
        } else if (dado1 < dado2) {
            this.fichas--;
            jugador.fichas++;
        }
    }

    public boolean quedanFichas() {
        return fichas > 0;
    }

    public static void main(String[] args) {
        JugadorGuerra jugador1 = new JugadorGuerra(10, new Dado(6), "Jugador 1");
        JugadorGuerra jugador2 = new JugadorGuerra(10, new Dado(6), "Jugador 2");

        while (jugador1.quedanFichas() && jugador2.quedanFichas()) {
            jugador1.jugar(jugador2);
        }

        if (jugador1.quedanFichas()) {
            System.out.println("Ganó " + jugador1.getNombre());
        } else {
            System.out.println("Ganó " + jugador2.getNombre());
        }

        // llama al metodo mostrar() de cada jugador para mostrar sus datos por pantalla.
        jugador1.mostrar();
        jugador2.mostrar();
        
    }

}

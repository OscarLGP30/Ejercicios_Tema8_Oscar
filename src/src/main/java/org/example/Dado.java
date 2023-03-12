package org.example;

public class Dado  {
    private int caras;
    private int valor;

    public Dado(int caras) {
        this.caras = caras;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int tirar() {
        valor = (int) (Math.random() * caras + 1);
        return valor;
    }

    public void mostrar() {
        System.out.println("Caras: " + caras);
        System.out.println("Valor: " + valor);
    }

    public String toString() {
        return "Caras: " + caras + " Valor: " + valor;
    }

    public boolean equals(Dado dado) {
        return this.caras == dado.caras && this.valor == dado.valor;
    }

    public static void main(String[] args) {
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(6);

        dado1.tirar();
        dado2.tirar();

        dado1.mostrar();
        dado2.mostrar();

        System.out.println(dado1);
        System.out.println(dado2);

        System.out.println(dado1.equals(dado2));
    }


}

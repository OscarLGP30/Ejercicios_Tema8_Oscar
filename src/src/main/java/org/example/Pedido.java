package org.example;

public class Pedido {
    private Clientes cliente;
    private Obra obra;
    private int cantidad;

    public Pedido(Clientes cliente, Obra obra, int cantidad) {
        this.cliente = cliente;
        this.obra = obra;
        this.cantidad = cantidad;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void mostrar() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Obra: " + obra);
        System.out.println("Cantidad: " + cantidad);
    }

    public String toString() {
        return "Cliente: " + cliente + " Obra: " + obra + " Cantidad: " + cantidad;
    }

    public boolean equals(Pedido pedido) {
        return this.cliente == pedido.cliente && this.obra == pedido.obra && this.cantidad == pedido.cantidad;
    }






    // mostrar los clientes y obras de los pedidos realizados.



    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Juan", "Perez", "12345678");
        Clientes cliente2 = new Clientes("Maria", "Gomez", "87654321");
        Clientes cliente3 = new Clientes("Pedro", "Rodriguez", "12345678");
        Clientes cliente4 = new Clientes("Jose", "Gonzalez", "87654321");
        Clientes cliente5 = new Clientes("Luis", "Fernandez", "12345678");

        Obra obra1 = new Obra("El principito", "Antoine de Saint-Exupéry");
        Obra obra2 = new Obra("Perçy jackson", "Rick Riordan");
        Obra obra3 = new Obra("La vida es bella", "Roberto Benigni");
        Obra obra4 = new Obra("El niño con el pijama de rayas", "John Boyne");
        Obra obra5 = new Obra("El fotografo de mauthausen", "Mar Targarona");

        Pedido pedido1 = new Pedido(cliente1, obra1, 1);
        Pedido pedido2 = new Pedido(cliente2, obra2, 2);
        Pedido pedido3 = new Pedido(cliente3, obra3, 3);
        Pedido pedido4 = new Pedido(cliente4, obra4, 4);
        Pedido pedido5 = new Pedido(cliente5, obra5, 5);

        pedido1.mostrar();
        pedido2.mostrar();
        pedido3.mostrar();
        pedido4.mostrar();
        pedido5.mostrar();

        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(pedido3);
        System.out.println(pedido4);
        System.out.println(pedido5);

        System.out.println(pedido1.equals(pedido2));
        System.out.println(pedido1.equals(pedido1));
    }
}

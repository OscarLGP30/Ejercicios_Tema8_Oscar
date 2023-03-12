package org.example;


import java.util.Scanner;

public class Clientes {

    //Los clientes creados en el capítulo anterior, pueden comprar libros y vídeos a nuestro editor.
    //Todos los libros y vídeos tienen un título y un autor.
    //Un libro tiene varias páginas, mientras que un vídeo tiene una duración.
    //Crear una clase Obra, agrupando los elementos comunes a libros y vídeos y dos clases Libros y Video, herederas de esta, con los elementos específicos para cada una.
    //Luego cree una clase Pedido, asociando a un cliente un conjunto de obras compradas.

    private String nombre;
    private String apellido;
    private String dni;

    public Clientes(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
    }

    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " DNI: " + dni;
    }

    public boolean equals(Clientes cliente) {
        return this.nombre == cliente.nombre && this.apellido == cliente.apellido && this.dni == cliente.dni;
    }

    //Crear un menu que permita: 1. Crear un cliente 2. Crear una obra 3. Crear un pedido 4. Mostrar los clientes y obras de los pedidos realizados.
    //5. Salir
    //El menu debe repetirse hasta que el usuario ingrese la opcion 5.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Clientes cliente = null;
        Obra obra = null;
        Pedido pedido = null;
        do {
            System.out.println("1. Crear un cliente");
            System.out.println("2. Crear una obra");
            System.out.println("3. Crear un pedido");
            System.out.println("4. Mostrar los clientes y obras de los pedidos realizados.");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre = sc.next();
                    System.out.println("Ingrese el apellido del cliente");
                    String apellido = sc.next();
                    System.out.println("Ingrese el DNI del cliente");
                    String dni = sc.next();
                    cliente = new Clientes(nombre, apellido, dni);
                    break;
                case 2:
                    System.out.println("Ingrese el titulo de la obra");
                    String titulo = sc.next();
                    System.out.println("Ingrese el autor de la obra");
                    String autor = sc.next();
                    System.out.println("Ingrese el tipo de obra (1. Libro 2. Video)");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        System.out.println("Ingrese la cantidad de paginas");
                        int paginas = sc.nextInt();
                        obra = new Obra(titulo, autor);
                    } else {
                        System.out.println("Ingrese la duracion del video");
                        int duracion = sc.nextInt();
                        obra = new Obra(titulo, autor);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de obras");
                    int cantidad = sc.nextInt();
                    pedido = new Pedido(cliente, obra, cantidad);
                    break;
                case 4:
                    pedido.mostrar();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 5);
    }

}

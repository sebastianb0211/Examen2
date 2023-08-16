package org.example;

import java.util.Scanner;

public class Parte1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionMenu;
         String nombrePeluche="";
         int precioUnitario=0;
         double costoIva;
         double totalIva=0;
         int nuevoPrecio;

        System.out.println("Bienvenidos a la tienda peluche");

        System.out.println("1--- Agregar el nombre y el precio unitario de un nuevo peluche");
        System.out.println("2--- calcular costo con el iva");
        System.out.println("3--- mostrar informacion del peluche");
        System.out.println("4--- editar el precio unitario");
        System.out.println("5--- Salir");
        System.out.print("por favor ingrese una opcion: ");
        opcionMenu = teclado.nextInt();

     if (opcionMenu!=1) {
         System.out.println("por favor ingrese primero un precio y un peluche");

     }else {
         while (opcionMenu!=5){
             switch (opcionMenu){
                 case 1:
                     System.out.print("por favor ingrese un nombre para el peluche: ");
                     nombrePeluche= teclado.next();
                     System.out.print("por favor ingrese precio unitario: ");
                     precioUnitario=teclado.nextInt();
                     break;
                 case 2:
                     costoIva=precioUnitario*0.19;
                     totalIva=costoIva+precioUnitario;
                     System.out.println("El costo de venta mas el iva es: "+totalIva);
                     break;
                 case 3:
                     System.out.println("el nombre del peluche es: "+nombrePeluche);
                     System.out.println("el precio del peluche es: "+precioUnitario);
                     System.out.println("y su precio de venta es: "+totalIva);
                     break;
                 case 4:
                     System.out.println("edite el precio unitario del peluche");
                     nuevoPrecio=teclado.nextInt();
                     precioUnitario=nuevoPrecio;
                     System.out.println("el nuevo precio uninitario del peluche "+nombrePeluche+" es: "+precioUnitario);
                     break;
                 default:
                     System.out.println("por favor ingrese un numero correcto");
                     break;

             }
             System.out.println("1--- Agregar el nombre y el precio unitario de un nuevo peluche");
             System.out.println("2--- calcular costo con el iva");
             System.out.println("3--- mostrar informacion del peluche");
             System.out.println("4--- editar el precio unitario");
             System.out.println("5--- Salir");
             System.out.print("por favor ingrese una opcion: ");
             opcionMenu = teclado.nextInt();
         }
     }



    }
}
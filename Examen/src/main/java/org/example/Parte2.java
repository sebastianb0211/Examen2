package org.example;

import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcionUsuario=0;
        int horasTrabajadas=0;
        int tarifaHora;
         int totalTrabajo=0;
         String nombreUsuario;
         double salarioSuma;
         double totalSalario;
         int salario;


        while (opcionUsuario!=3){
            System.out.println("Bienvenidos");
            System.out.println("1--- calcular salario");
            System.out.println("2--- pagar nomina");
            System.out.println("3--- salir");
            System.out.print("por favor ingrese una opcion: ");
            opcionUsuario=teclado.nextInt();

            switch (opcionUsuario){
                case 1:
                    System.out.print("por favor ingrese el numero de horas trabajadas: ");
                    horasTrabajadas= teclado.nextInt();

                    System.out.println("y por favor ingrese la tarifa por hora: ");
                    tarifaHora= teclado.nextInt();
                    totalTrabajo=horasTrabajadas*tarifaHora;
                    System.out.println("su salario total es: "+ totalTrabajo);
                    break;
                case 2:
                    System.out.print("por favor ingrese un nombre: ");
                    nombreUsuario= teclado.next();

                    System.out.print("por favor ingrese el salario a pagar: ");
                    salario=teclado.nextInt();

                    salarioSuma=salario*0.08;
                    totalSalario=salario-salarioSuma;
                    System.out.println("querido usuario "+nombreUsuario+" su pago total con la deduccion es: "+totalSalario);
                    break;
                default:
                    System.out.println("por favor ingrese un numero correcto");
                    break;

            }
        }


    }
}

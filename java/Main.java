import java.util.Scanner;

import com.packages.operations.*;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        String option;
        do {
            System.out.println("Menú de opciones");
            System.out.println("0. Salir");
            System.out.println("1. Operaciones básicas");
            System.out.println("2. Vectores");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuOperations();
                    break;
                case "2":
                    // System.out.println("Hasta pronto");
                    break;
                case "3":
                    // System.out.println("Hasta pronto");
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuOperations()
    {
        String option;
        int n;
        Operation oper = new Operation();
        do {
            System.out.println("Menú de operaciones");
            System.out.println("0. Regresar");
            System.out.println("1. Suma naturales");
            System.out.println("2. ");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese n: ");
                    n = input.nextInt();
                    input.nextLine();
                    if (n > 0) {
                        System.out.println("Suma de 1 a " + n + ": " + oper.sumNaturals(n));
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "2":
                    // System.out.println("Hasta pronto");
                    break;
                case "3":
                    // System.out.println("Hasta pronto");
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}
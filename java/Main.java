import java.util.Scanner;

import com.packages.operations.*;
import com.packages.arrays.*;
import com.packages.linked_list.*;

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
            System.out.println("2. Personas");
            System.out.println("3. Vectores");
            System.out.println("4. Listas Simplemente Ligadas");
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
                    menuPersons();
                    break;
                case "3":
                    menuVectors();
                    break;
                case "4":
                    menuLSL();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuOperations()
    {
        String option;
        long n;
        Operation oper = new Operation();
        do {
            System.out.println("Menú de operaciones");
            System.out.println("0. Regresar");
            System.out.println("1. Suma naturales");
            System.out.println("2. Suma naturales Gauss");
            System.out.println("3. Pares e impares");
            System.out.println("4. Tablas de multiplicar");
            System.out.println("5. Reloj");
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
                    System.out.print("Ingrese n: ");
                    n = input.nextInt();
                    input.nextLine();
                    if (n > 0) {
                        System.out.println("Suma de 1 a " + n + ": " + oper.sumNaturalsGauss(n));
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese n: ");
                    n = input.nextInt();
                    input.nextLine();
                    if (n >= 0) {
                        oper.numberEvenOdd(n);
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "4":
                    System.out.print("Ingrese n: ");
                    n = input.nextLong();
                    if (n > 0) {
                        oper.multiplicationTables(n);
                    } else {
                        System.out.println("Valor de n no válido");
                    }
                    break;
                case "5":
                    oper.clock();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }


    public static void menuPersons()
    {
        String option;
        Person per = new Person();
        do {
            System.out.println("Menú Personas");
            System.out.println("0. Regresar");
            System.out.println("1. Grupo más longevo");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    per.oldGroupPerson();
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
    
    
    public static void menuVectors()
    {
        String option;
        int datum, position;
        Vector v = new Vector();
        do {
            System.out.println("\nMenú Vectores");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar");
            System.out.println("2. Tamaño");
            System.out.println("3. Mostrar");
            System.out.println("4. Buscar");
            System.out.println("5. Suma");
            System.out.println("6. Promedio");
            System.out.println("7. Mayor");
            System.out.println("8. Menor");
            System.out.println("9. Ordenación por intercambio directo (burbuja)");
            System.out.println("10. Búsqueda binaria");
            System.out.println("11. Llenar vector aleatoriamente");
            System.out.println("12. Ordenación por fusión (merge sort)");
            System.out.println("13. Ordenación por selección directa");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    if (v.getN() < v.getT()) {
                        System.out.print("Dato a agregar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        v.addVector(datum);
                    } else {
                        System.out.println("Vector lleno");
                    }
                    break;
                case "2":
                    System.out.println("Tamaño vector: " + v.getN());
                    break;
                case "3":
                    if (v.getN() > 0) {
                        v.showVector();
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "4":
                    if (v.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.findVector(datum);
                        if (position > -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println("El dato " + datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "5":
                    if (v.getN() > 0) {
                        System.out.println("Suma vector: " + v.sumVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "6":
                    if (v.getN() > 0) {
                        System.out.println("Promedio vector: " + v.avgVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "7":
                    if (v.getN() > 0) {
                        System.out.println("Mayor dato vector: " + v.maxVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "8":
                    if (v.getN() > 0) {
                        System.out.println("Menor dato vector: " + v.minVector());
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "9":
                    if (v.getN() > 0) {
                        v.sortBubble();
                        System.out.println("Vector ordenado ascendentemente por burbuja");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "10":
                    if (v.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.binarySearch(datum);
                        if (position > -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println("El dato " + datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "11":
                    v = new Vector(1000000);
                    v.setN(v.getT());
                    System.out.println("Vector creado");
                    break;
                case "12":
                    v.sort(v.getVec(), 0 , v.getT() - 1);
                    System.out.println("Vector ordenado ascendentemente (fusión)");
                    break;
                case "13":
                    v.sortSelection();
                    System.out.println("Vector ordenado ascendentemente (selección)");
                    break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuLSL()
    {
        String option;
        int datum;
        SimpleLinkedList lsl = new SimpleLinkedList();
        do {
            System.out.println("\nMenú Lista Simplemente Ligada");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar");
            System.out.println("2. Tamaño");
            System.out.println("3. Mostrar");
            System.out.println("4. Buscar");
            System.out.println("5. Modificar");
            System.out.println("6. Eliminar");
            System.out.println("7. Insertar después de referencia");
            // System.out.println("6. Suma");
            // System.out.println("7. Promedio");
            // System.out.println("8. Mayor");
            // System.out.println("9. Menor");
            // System.out.println("10. Ordenación por intercambio directo (burbuja)");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato a agregar: ");
                    datum = input.nextInt();
                    input.nextLine();
                    lsl.createBegin(datum);
                    System.out.println("Nodo agregado correctamente");
                    break;
                case "2":
                    System.out.println("Tamaño LSL: " + lsl.getN());
                    break;
                case "3":
                    if (lsl.head != null) {
                        lsl.showLSL();
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "4":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        Node dir = lsl.findLSL(datum);
                        if (dir != null) {
                            System.out.println("Dato encontrado en dirección " + dir);
                        } else {
                            System.out.println("El dato " + datum + " no se encuentra en la LSL");
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "5":
                    if (lsl.head != null) {
                        System.out.print("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        Node dir = lsl.findLSL(datum);
                        if (dir != null) {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            lsl.updateLSL(dir, datum);
                            System.out.println("Dato actualizado correctamente");
                        } else {
                            System.out.println("El dato " + datum + " no se encuentra en la LSL");
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "6":
                    if (lsl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        lsl.deleteNodeLSL(datum);
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "7":
                    if (lsl.head != null) {
                        System.out.print("Dato de referencia: ");
                        datum = input.nextInt();
                        input.nextLine();
                        Node dir = lsl.findLSL(datum);
                        if (dir != null) {
                            System.out.print("Dato a insertar: ");
                            datum = input.nextInt();
                            input.nextLine();
                            lsl.insertAfterLSL(dir, datum);
                            System.out.println("Dato insertado correctamente después de referencia");
                        } else {
                            System.out.println("El dato de referencia " + datum + " no se encuentra en la LSL");
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                // case "5":
                //     if (v.getN() > 0) {
                //         System.out.println("Suma vector: " + v.sumVector());
                //     } else {
                //         System.out.println("Vector vacío");
                //     }
                //     break;
                // case "6":
                //     if (v.getN() > 0) {
                //         System.out.println("Promedio vector: " + v.avgVector());
                //     } else {
                //         System.out.println("Vector vacío");
                //     }
                //     break;
                // case "7":
                //     if (v.getN() > 0) {
                //         System.out.println("Mayor dato vector: " + v.maxVector());
                //     } else {
                //         System.out.println("Vector vacío");
                //     }
                //     break;
                // case "8":
                //     if (v.getN() > 0) {
                //         System.out.println("Menor dato vector: " + v.minVector());
                //     } else {
                //         System.out.println("Vector vacío");
                //     }
                //     break;
                // case "9":
                //     if (v.getN() > 0) {
                //         v.sortBubble();
                //         System.out.println("Vector ordenado ascendentemente por burbuja");
                //     } else {
                //         System.out.println("Vector vacío");
                //     }
                //     break;
                // case "10":
                //     if (v.getN() > 0) {
                //         System.out.print("Dato a buscar: ");
                //         datum = input.nextInt();
                //         input.nextLine();
                //         position = v.binarySearch(datum);
                //         if (position > -1) {
                //             System.out.println("Dato encontrado en posición " + position);
                //         } else {
                //             System.out.println("El dato " + datum + " no se encuentra en el vector");
                //         }
                //     } else {
                //         System.out.println("Vector vacío");
                //     }
                //     break;
                default: 
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}
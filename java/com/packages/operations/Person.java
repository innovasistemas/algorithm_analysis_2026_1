package com.packages.operations;

import java.util.Scanner;


public class Person 
{
    private String name;
    private int age;
    private double height;
    public static Scanner input = new Scanner(System.in);

    public Person()
    {
        name = "";
        age = 0;
        height = 0;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public void oldGroupPerson()
    {
        int m, n, i, sumAge;                    // 1
        double avgW, avgM;                      // 1
        System.out.print("Número mujeres: "); // 1 
        m = input.nextInt();                    // 1
        System.out.print("Número hombres: "); // 1
        n = input.nextInt();                    // 1
        i = 1;                                  // 1
        sumAge = 0;                             // 1
        while (i <= m) {                                // m + 1
            System.out.print("Edad mujer " + i + ": "); // m
            this.age = input.nextInt();                 // m
            sumAge += this.age;                         // m
            i++;                                        // m
        }                                               // m
        avgW = sumAge / m;                      // 1
        
        i = 1;                                  // 1
        sumAge = 0;                             // 1
        while (i <= n) {                        // n + 1
            System.out.print("Edad hombre " + i + ": "); // n
            this.age = input.nextInt();                  // n
            sumAge += this.age;                          // n
            i++;                                         // n
        }                                                // n
        avgM = sumAge / m;                               // 1
        if (avgW > avgM) {                               // 1
            System.out.println("Grupo más longevo: mujeres");
        } else if (avgW < avgM) {
            System.out.println("Grupo más longevo: hombres");
        } else {
            System.out.println("Grupo más longevo: coinciden en longevidad");
        }
        System.out.println("Promedio general: " + (avgW + avgM) / 2); // 1
        
    }

    // Contador de frecuencias: CF = 6m + 6n + 16
    // Orden de magnitud : O(m + n)
    
}

package com.packages.operations;

public class Operation 
{
    public long sumNaturals(long n)
    {
        long i, s;
        s = 0;
        for (i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public long sumNaturalsGauss(long n)
    {
        return n * (n + 1) / 2;
    }

    public void numberEvenOdd(long n)
    {
        long k, calc;
        k = 0;
        boolean sw = false;
        calc = 2 * k + 1; 
        while (calc <= n && !sw) {
            if (calc == n) {
                sw = true;
            } else {
                k++;
            }
            calc = 2 * k + 1; 
        }
        if (sw) {
            System.out.println(n + " es impar");
        } else {
            System.out.println(n + " es par");
        }
    }

    public void multiplicationTables(long n)
    {
        int i, j; // 1
        i = 1; // 1
        while (i <= n) { // n + 1
            j = 1; // n
            while (j <= n) { // n * n + n
                System.out.println(i + " * " + j + " = " + i * j); // n * n
                j++; // n * n
            } // n * n
            i++; // n
            System.out.println(""); // n
        } // n
    }
    // Contador de frecuencias: CF = 4n ^ 2 + 6n + 3
    // Orden de magnitud Big O: O(n ^ 2) (Cuadrático)

    public void clock()
    {
        int m, n, i, j, k; // 1
        m = 24; // 1
        n = 60; // 1
        i = 0; // 1
        while (i < m) { // m + 1
            j = 0;
            while (j < n) { // m * n + m 
                k = 0; // m * n
                while (k < n) { // n * n * m + (m * n)
                    System.out.println(i + ":" + j + ":" + k); // n * n * m
                    k++; // n * n * m
                } // n * n * m
                j++; // m * n
            } // m * n
            i++; // m
        } // m
         
        // CF = 4 mn^2 + 5mn + 4m + 5
        // O(mn^2).  
        // Si m = n, entonces nn^2 = n^3, por tanto: O(n^3)
    }
}

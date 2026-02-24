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
}

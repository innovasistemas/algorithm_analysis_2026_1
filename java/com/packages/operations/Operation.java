package com.packages.operations;

public class Operation 
{
    public int sumNaturals(int n)
    {
        int i, s;
        s = 0;
        for (i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
}

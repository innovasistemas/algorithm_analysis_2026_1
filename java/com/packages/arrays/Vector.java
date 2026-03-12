package com.packages.arrays;

public class Vector 
{
    private final int T = 100;
    private int n;
    private int vec[] = new int[T];

    public Vector()
    {
        n = 0;
        
    }

    public int getT() 
    {
        return T;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public void addVector(int datum)
    {
        vec[n] = datum;
        n++;
    }

    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }

    public int findVector(int datum) 
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public int sumVector()
    {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += vec[i];
        }
        return s;
    }

    public double avgVector()
    {
        return sumVector() / n;
    }

    public int maxVector()
    {
        int m = vec[0];
        for (int i = 1; i < n; i++) {
            if (vec[i] > m) {
                m = vec[i];
            }
        }
        return m;
    }

    public int minVector()
    {
        int m = vec[0];
        for (int i = 1; i < n; i++) {
            if (vec[i] < m) {
                m = vec[i];
            }
        }
        return m;
    }

    public int totalOddPositionEven()
    {
        int c = 0;
        for (int i = 0; i < n; i += 2) {
            if (vec[i] % 2 == 1) {
                c++;
            }
        }
        return c;
    }

    public double sumSquare()
    {
        double s = 0;
        int i = 3;
        while (i < n) {
            s = s + Math.pow(vec[i], 2);
            i  = i + 3;
        }
        return s;
    }

    public void functionX()
    {
        for (int i = 0; i < n; i++) {
            int p = 1;
            for (int j = 0; j < n; j *= 2) {
                p = p * vec[i] * vec[j];
            }
            System.out.println("Valor de p " + i + ": " + p);
        }
    }

    public void functionY()
    {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.println("Operación " + (vec[i] - vec[j]));
            }
        }
    }

    public void sortBubble()
    {
        int i, j, aux;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }


}

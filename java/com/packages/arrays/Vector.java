package com.packages.arrays;

public class Vector 
{
    private final int T = 1000000;
    private int n;
    private int vec[] = new int[T];

    public Vector()
    {
        n = 0;
    }

    public Vector(int m)
    {
        for (int i = 0; i < m; i++) {
            vec[i] = (int)(Math.random() * 1000000);
        }
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

    public int binarySearch(int datum)
    {
        int lowerLimit = 0;
        int upperLimit = n - 1;
        int centralPos;
        int pos = -1;
        while (lowerLimit < upperLimit && pos == -1) {
            centralPos = (lowerLimit + upperLimit) / 2;
            if (vec[centralPos] == datum) {
                pos = centralPos;
            } else if (vec[centralPos] > datum) {
                upperLimit = centralPos - 1;
            } else {
                lowerLimit = centralPos + 1;
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


    // Métodos de ordenación

    // Ordenación por intercambio directo (Burbuja)
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

    // Ordenación por selección directa
    public void sortSelection()
    {
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            int min = vec[i];
            for (int j = i + 1; j < n; j++) {
                if (vec[j] < min) {
                    k = j;
                    min = vec[j];
                }
            }
            vec[k] = vec[i];
            vec[i] = min;
        }
    }

    // Ordenación por fusión (merge sort)
    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

}

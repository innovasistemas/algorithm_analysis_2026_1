package com.packages.arrays;
import com.packages.linked_list.*;

public class AdjacencyList 
{
    private final int T = 50;
    private Node vecNode[] = new Node[T];
    private int n;

    public AdjacencyList()
    {
        n = 0;
    }

    public int getT() 
    {
        return T;
    }

    public int getDatumVecNode(int pos)
    {
        return vecNode[pos].info;
    }

    public Node[] getVecNode() 
    {
        return vecNode;
    }

    public void setVecNode(Node[] vecNode) 
    {
        this.vecNode = vecNode;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public void addNode(int datum)
    {
        if (findNode(datum) == -1) {
            vecNode[n] = new Node();
            vecNode[n].info = datum;
            vecNode[n].link = null;
            n++;
             System.out.println("Dato agregado al grafo correctamente");
        } else {
            System.out.println(datum + " ya se encuentra en el grafo");
        }
    }

    public void showNodes()
    {
        for (int i = 0; i < n; i++) {
            System.out.println("Nodo " + (i + 1) + ": " + vecNode[i].info);
        }
    }

    public int findNode(int datum) 
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < n && pos == -1) {
            if (vecNode[i].info == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
}

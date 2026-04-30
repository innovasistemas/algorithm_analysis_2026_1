package com.packages.linked_list;

public class SimpleLinkedList 
{
    public Node head;
    private int n;

    public SimpleLinkedList()
    {
        head = null;
        n = 0;
    }  

    public Node getHead() 
    {
        return head;
    }

    public void setHead(Node head) 
    {
        this.head = head;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void createBegin(int datum)
    {
        Node newNode = new Node();
        newNode.info = datum;
        newNode.link = head;
        head = newNode;
        this.n++;
    }

    public void showLSL()
    {
        Node p = head;
        while (p != null) {
            System.out.println("Información: " + p.info);
            System.out.println("Liga: " + p.link);
            System.out.println("Dirección nodo: " + p);
            System.out.println("------------------------");
            p = p.link;
        }
    }

    public Node findLSL(int datum)
    {
        Node p = head;
        boolean sw = false;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.link;
            }
        }
        return p;
    }

    public void updateLSL(Node p, int datum)
    {
        p.info = datum;
    }

    public void deleteNodeLSL(int datum)
    {
        if (head.info == datum) {
            head = head.link;
            n--;
            System.out.println(datum + " eliminado correctamente de la LSL");
        } else {
            boolean sw = false;
            Node prev = head;
            Node p = head.link;
            while (p != null && !sw) {
                if (p.info == datum) {
                    sw = true;
                } else {
                    p = p.link;
                    prev = prev.link;
                }
            }
            if (sw) {
                prev.link = p.link;
                n--;
                System.out.println(datum + " eliminado correctamente de la LSL");
            } else {
                System.out.println(datum + " no se encuentra en la LSL");
            }
        }
    }

    public void insertAfterLSL(Node dir, int datum)
    {
        Node mem = new Node();
        mem.info = datum;
        mem.link = dir.link;
        dir.link = mem;
    }
}

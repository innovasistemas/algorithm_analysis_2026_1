package com.packages.linked_list;

public class SimpleLinkedList 
{
    public Node head;

    public SimpleLinkedList()
    {
        head = null;
    }

    public void createBegin(int datum)
    {
        Node n = new Node();
        n.info = datum;
        n.link = head;
        head = n;
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
}

package Talleres.src.Taller5;

class Node 
{
    int data;
    Node prev, next;

    Node(int data) 
    {
        this.data = data;
        prev = null;
        next = null;
    }
}

class ListaDoble 
{
    Node head;

    void deleteNode(Node del) 
    {
        if (head == null || del == null) 
        {
            return;
        }

        if (head == del) 
        {
            head = del.next;
        }

        if (del.next != null) 
        {
            del.next.prev = del.prev;
        }

        if (del.prev != null) 
        {
            del.prev.next = del.next;
        }
    }

    void traverseBackward() 
    {
        if (head == null) return;
    
        Node last = head;
        while (last.next != null) 
        {
            last = last.next;
        }
    
        while (last != null) 
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    
}


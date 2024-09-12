package Talleres.src.Taller5;

class Circular 
{
    Node head;

    void insertarEnPosicion(int data, int position) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            newNode.next = newNode.prev = head;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position && temp.next != head; i++) 
        {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void eliminarNodo(Node del) 
    {
        if (head == null || del == null) 
        return;
    
        if (head == del && head.next == head) 
        {
            head = null;
            return;
        }
    
        if (head == del) 
        {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        } else 
        {
            del.prev.next = del.next;
            del.next.prev = del.prev;
        }
    }
    void traverseMultipleTimes(int times) 
    {
        if (head == null || times <= 0) 
        return;
    
        Node temp = head;
        int count = 0;
    
        do 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
    
            if (temp == head && count < times * size()) 
            {
                System.out.println();  
            }
        } while (count < times * size());
    }
    
    int size() 
    {
        if (head == null) return 0;
    
        Node temp = head;
        int count = 0;
    
        do 
        {
            count++;
            temp = temp.next;
        } while (temp != head);
    
        return count;
    }
    
    
}



// Delete element from a list without head

import java.util.*;

public class Main
{

    public static void main(String[] args) {
        LL l = new LL();
        l.delete();
    }
}

class LL{
    public class Node
    {
        int data;
        Node next;
    
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public void delete(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        Node n5 = new Node(5);
        n4.next = n5;
        n5.next = null;
        
        printList(n1); // 1->2->3->4->5
        deleteNode(n3);
        printList(n1); // 1->2->4->5
    }
    
    public void deleteNode(Node n){
        int temp = n.next.data;
        n.data = temp;
        n.next = n.next.next;
    }
    
    public void printList(Node n1){
        Node temp = n1;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

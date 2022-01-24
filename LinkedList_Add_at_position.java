
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.*;

public class Main
{


    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        LinkedList l = new LinkedList();
        //Node head = new Node(0);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(7);
        l.printList(); //prints 7->6->5->2->1
        l.addNodeAtPos(l.getHead(), 10, 2); //prints 7->6->10->5->2->1
        l.printList();
        
    }
}

class LinkedList{
  
  Node head;  

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
    
    //adds new node at the start
    public void add(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        this.head = newNode;
    }
    
    //returns the head node
    public Node getHead(){
        return this.head;
    }
    
    //Add new element at the given position
    public void addNodeAtPos(Node head, int val,int pos){
        Node toAdd = new Node(val);
        Node cur = head;
        if(pos == 0){
            toAdd.next = head;
            head = toAdd;
            return;
        }
        else{
            for(int i=0; i<pos-1; i++){
                cur = cur.next;
            }
            toAdd.next = cur.next;
            cur.next = toAdd;
        }
        return;
    }
    
    public void printList(){
        Node temp =head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

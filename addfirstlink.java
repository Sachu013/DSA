package DSA;

import java.util.Scanner;

public class addfirstlink
{
    private Node head;

    private static class Node
    {
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data)
    {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    public void display()
    {
         Node current = head;
         while(current!=null)
         {
            System.out.print(current.data + " -> ");
            current=current.next;
         }
         System.out.println("NULL");
    }
    public static void main(String[] args) 
    {
        addfirstlink add = new addfirstlink();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            add.insert(sc.nextInt());
        }
        add.display();
    }

}

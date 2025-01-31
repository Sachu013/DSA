package DSA;

import java.util.Scanner;

public class deletefirstlink
{
    private Node head;

    private static class Node 
    {
        private int data;
        private Node next;
        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data)
    {
        Node n = new Node(data);
        if(head == null)
        {
            head =n;
            return;
        }
        Node cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        cur.next = n;
    }

    public void delete()
    {
        if(head==null)
        {
            return;
        }
        Node n = head;
        head = head.next;
        n.next=null;
        
    }

    public void display()
    {
        Node cur =head;
        while(cur!=null)
        {
            System.out.print(cur.data + " -> ");
            cur=cur.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) 
    {
        deletefirstlink he = new deletefirstlink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++)
        {
            he.insert(sc.nextInt());
        }
        System.out.println("Before deleting value: ");
        he.display();

        he.delete();

        System.out.println("After deleting value");
        he.display();
    }
}

package DSA;

import java.util.Scanner;

public class deletelastlink 
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
        Node n = new Node(data);
        if(head == null)
        {
            head=n;
            return;
        }
        Node cur = head;
        while(cur.next!=null)
        {
            cur = cur.next;
        }
        cur.next=n;
    }

    public void display()
    {
        Node cur = head;
        while(cur!=null)
        {
            System.out.print(cur.data + " -> ");
            cur=cur.next;
        }
        System.out.println("NULL");
    }

    public void deletelast()
    {
        if(head == null)
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node prev=null;
        Node cur = head;
        while(cur.next!=null)
        {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) 
    {
        deletelastlink he = new deletelastlink();
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

        he.deletelast();

        System.out.println("After deleting value");
        he.display();
    }
    
}

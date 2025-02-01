package DSA;

import java.util.Scanner;

public class searchlist 
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

    public boolean search(int val)
    {
        Node cur=head;
        while(cur!=null)
        {
            if(cur.data==val)
            {
                return true;
            }
            cur=cur.next;

        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        searchlist sp = new searchlist();
        System.out.print("Enter no of elements: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sp.insert(sc.nextInt());
        }
        System.out.println("LIST: ");
        sp.display();
        System.out.println();
        System.out.print("Enter value to search: ");
        int val = sc.nextInt();
        boolean ans= sp.search(val);
        if(ans==true)
        {
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not found!!");
        }
    }
    
}

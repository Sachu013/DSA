package DSA;

import java.util.Scanner;

public class reverselist 
{
    private node head;

    private static class node
    {
        private int data;
        private node next;

        public node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data)
    {
        node n= new node(data);
        if(head==null)
        {
            head = n;
            return;
        }
        node cur = head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        cur.next=n;
    }

    public void display()
    {
        node n = head;
        while(n!=null)
        {
            System.out.print(n.data + " --> ");
            n=n.next;
        }
        System.out.println("NULL");
    }
    
    public void reverse()
    {
        node cur = head;
        node prev = null;
        node next = null;

        while(cur!=null)
        {
            next= cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head = prev;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        reverselist sp = new reverselist();
        System.out.print("Enter no of elements: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sp.insert(sc.nextInt());
        }
        System.out.println("List before reversing: ");
        sp.display();
        System.out.println();
        System.out.println("List after reversing: ");
        sp.reverse();
        sp.display();
        System.out.println();
    }

}

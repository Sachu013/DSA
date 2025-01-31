package DSA;
import java.util.Scanner;

public class insertlink 
{
    private Node head;

    private static class Node
    {
        private int data;
        private Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void insert(int data)
    {
        Node hy = new Node(data);
        Node current = head;
        if(head == null)
        {
            head= hy;
            return;
        }
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next= hy;
    }

    public void insertatposition(int data, int pos)
    {
        Node n = new Node(data);
        if(pos==1)
        {
            n.next=head;
            head=n;
        }
        else
        {
            Node prev = head;
            int count=1;
            while(count<pos-1)
            {
                prev=prev.next;
                count++;
            }
            Node cur=prev.next;
            n.next=cur;
            prev.next=n;
        }
    }  
    
    public void display()
    {
        Node current = head;
        while (current!=null) 
        {
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) 
    {
        insertlink in = new insertlink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            in.insert(sc.nextInt());
        }
        System.out.println("Before inserting: ");
        in.display();
        System.out.println();
        System.out.println("Enter position to insert: ");
        int pos = sc.nextInt();
        System.out.println("Enter value to Insert: ");
        in.insertatposition(sc.nextInt(), pos);
        System.out.println("After inserting: ");
        in.display();
        
    }
    
}

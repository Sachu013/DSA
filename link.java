package DSA;
import java.util.Scanner;

public class link 
{
    private node head;

    private static class node
    {
        private int data;
        private node next;

        public node(int data)
        {
            this.data= data;
            this.next= null;
        }
    }

    public void insert(int data)
    {
        node hy = new node(data);
        node current = head;
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

    public void display()
    {
        node current = head;
        while (current!=null) 
        {
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) 
    {
        link l =new link();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.insert(sc.nextInt());
        }
        l.display();

        
    }
    
}

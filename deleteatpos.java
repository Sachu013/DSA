package DSA;
import java.util.Scanner;

public class deleteatpos 
{
    private node head;

    private static class node
    {
        private int data;
        private node next;

        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void insert(int data)
    {
        node n = new node(data);
        if(head==null)
        {
            head=n;
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
        node cur = head;
        while(cur!=null)
        {
            System.out.print(cur.data + " --> ");
            cur=cur.next;
        }
        System.out.println("NULL");
    }

    public void delete(int pos)
    {
        if(head==null || pos<=0)
        {
            return;
        }
        if(pos==1)
        {
            head=head.next;
            return;
        }
        node a = head;
        int count=1;
        while(count<pos-1 && a!=null)
        {
            a=a.next;
            count++;
        }
        if(a==null || a.next==null)
        {
            return;
        }
        node b= a.next;
        a.next=b.next;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        deleteatpos dp = new deleteatpos();
        System.out.print("Enter no of elements: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            dp.insert(sc.nextInt());
        }
        System.out.println("Before deleting: ");
        dp.display();
        System.out.println();
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        dp.delete(pos);
        System.out.println("After deleting: ");
        dp.display();
    }
    
}

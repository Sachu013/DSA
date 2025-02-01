package DSA;

import java.util.Scanner;

public class findfromlast 
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

    private void insert(int data)
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

    public node find(int val)
    {
        node ref = head;
        node cur = head;
        int count =0;
        while(count<val)
        {
            count++;
            ref = ref.next;
        }
        while(ref!=null)
        {
            ref=ref.next;
            cur=cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findfromlast ff = new findfromlast();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ff.insert(sc.nextInt());
        }
        ff.display();
        int pos =sc.nextInt();
        node val = ff.find(pos);
        System.out.println(val.data);
    }

}

package DSA;


public class linkedlist 
{
    private node head;

    private static class node
    {
        private int data;
        private node next;

        public node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    
    

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.head = new node(10);
        node second = new node(20);
        node third = new node(30);
        node fourth = new node(40);

        l.head.next = second;
        second.next = third;
        third.next = fourth;

        node current = l.head;

        while (current!=null) 
        {
           System.out.print(current.data + "--> ");
           current = current.next;
        }
        System.out.println("NUll");
    }
}

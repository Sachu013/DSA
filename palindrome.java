package DSA;
import java.util.Scanner;

public class palindrome 

{
    public boolean check(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        String str = sb.reverse().toString();
        if(str.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args)
    {
        palindrome p =new palindrome();
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        boolean c= p.check(s);
        if(c)
        {
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
    
}

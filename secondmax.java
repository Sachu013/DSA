package DSA;
import java.util.Scanner;
public class secondmax 
{
    static int sec(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        return smax;


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans = sec(arr);
        System.out.println(ans);

    }
    
}

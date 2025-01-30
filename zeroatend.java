package DSA;

import java.util.Scanner;

public class zeroatend 
{
    static int[] zero(int[] arr,int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0)
            {
                j++;
            }
        }
        return arr;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        arr = zero(arr,n);
        System.out.println();;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}

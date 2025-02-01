package DSA;

import java.util.Scanner;
public class reversearray 
{
    static int[] rev(int arr[],int n)
    {
        int start=0,end=n-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a = rev(arr,n);
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}

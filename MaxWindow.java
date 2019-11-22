package dailyquestions;

import java.util.Scanner;

public class MaxWindow
{
    public static void maxWin(int arr[],int k)
    {
        int n=arr.length;
        for(int i=0;i<=n-k;i++)
		{
			int max=-999;
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the subarray: ");
        int k=sc.nextInt();
        maxWin(arr,k);
    }
}

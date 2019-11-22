package dailyquestions;

import java.util.Scanner;

public class MaxElementSubArray
{
 public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=scan.nextInt();
        System.out.println("Enter the Elements: ");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k=scan.nextInt();
        int c=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {int max=0;
                for(int l=i;l<=j;l++)
                {
                    if(max<a[l])
                    {
                        max=a[l];
                    }
                    if(max>k)
                    {
                        c++;
                    }
                }
            }
        }System.out.println("Output:"+c);

    }
}

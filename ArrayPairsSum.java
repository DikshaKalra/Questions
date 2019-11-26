package dailyquestions;

import java.util.Scanner;

public class ArrayPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array 1: ");
        int n=sc.nextInt();
        int arr1[]=new int [n];
        System.out.println("Enter the size of Array 2: ");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter the sum: ");
        int x=sc.nextInt();
        System.out.println("Enter the Array 1 elements: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Array 2 elements: ");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Pairs having sum equal to "+x+" are: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
             if(arr1[i]+arr2[j]==x)
             {
                 System.out.println(arr1[i]+" "+arr2[j]);
             }
            }
        }
    }
}

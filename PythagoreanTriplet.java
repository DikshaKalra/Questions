package dailyquestions;

import java.util.Scanner;

public class PythagorasTriplet {
static void CheckTriplet(int [] arr, int num)
{
    int count=0;
    for(int i=0;i<num;i++)
    {
        for(int j=i+1;j<num;j++)
        {
            for(int k=j+1;k<num;k++)
            {
            int a=arr[i]*arr[i];
            int b=arr[j]*arr[j];
           int c=a+b;
            if(arr[k]*arr[k]==c)
            {
               count++; 
            }
            }
        }
    }
    if(count>=1)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
    
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        CheckTriplet(arr,num);
    }
    
}

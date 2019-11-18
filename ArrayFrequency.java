package dailyquestions;

import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    if(count>1)
                    {
                        arr[j]=0;
                    }
                }
            }if(count>=1 && arr[i]!=0)
            {
                System.out.println(arr[i]+"  "+count);
            }
        }
    }
}

package dailyquestions;

import java.util.Scanner;

public class LeaderInArray {
    static void FindLeader(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int leader=arr[i];
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(leader<arr[j])
                {
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(leader+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        FindLeader(arr,n);
    }
    
}

package dailyquestions;

import java.util.Scanner;

public class StringPermutation {
    static void permute(String s,int start,int end)
    {
        if(start==end)
        {
            System.out.println(s);
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                s=swap(s,start,i);
                permute(s,start+1,end);
                s=swap(s,start,i);
            }
        }
    }
    static String swap(String s,int i,int j)
    {
        char temp;
        char[] ch=s.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        permute(s,0,l-1);
        
    }
}

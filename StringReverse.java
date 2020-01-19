package dailyquestions;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        String[] s=str.split("\\.");
        for(int i=s.length-1;i>=0;i--)
        {
            if(i==0)
            {
                System.out.println(s[i]);
            }
            else
            {
             System.out.print(s[i]+".");
            }
        }
       
    }
}

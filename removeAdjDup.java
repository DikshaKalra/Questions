package dailyquestions;

import java.util.Scanner;

public class removeAdjDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        String str="";
        for(int i=0;i<s.length()-1;i++)
        {
            if (i==0)
            {
                if (s.charAt(i) != s.charAt(i + 1))
                {
                    str = str + s.charAt(i);
                }
            }
            else if (i>0)
            {
                if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1))
                {
                    str = str + s.charAt(i);
                }
            }
        }
        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2))
        {
            str=str+s.charAt(s.length()-1);
        }
        System.out.println("After removing adjacent duplicate characters: "+str);
    }
}

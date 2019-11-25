package dailyquestions;

import java.util.Scanner;
import java.util.Stack;

public class PreToPost {
     public static String postfix(String pre)
    {
        Stack<String> str=new Stack<String>();
		String pos="";
		int n=pre.length();
		for(int i=n-1;i>=0;i--){
			char ch=pre.charAt(i);
			if(Character.isLetter(ch)){
				str.push(ch+"");
			}
			else{
				String s1=str.pop();
				String s2=str.pop();
				pos=s1+s2+ch;
				str.push(pos);
			}
		}
		return pos;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a prefix Expression:");
		String pre=sc.next();
		System.out.println("PostFix Expression is:");
		System.out.println(postfix(pre));
    }
}

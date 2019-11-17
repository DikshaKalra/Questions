package dailyquestions;

import java.util.Scanner;
public class LongestPalindrome
{
    public static int Pal(String s){
		int l=0;
		int i=0;
		int n=s.length();
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
				break;
		}
		if(i==n)
		return i;
		else return l;
    }

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String [] st=new String[200];
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String str=s.substring(i,j);
				count1=Pal(str);
				if(count1!=0)
				{
					st[count]=str;
					count++;
				}
			}
		}
		int m=0;
		String p="";
		for(int i=0;i<count;i++)
		{
			if(st[i].length()>m)
				{
				m=st[i].length();
				p=st[i];
				}
		}
		System.out.println("Longest palindrome is "+p);
    }
}

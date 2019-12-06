package dailyquestions;

import java.util.Scanner;

public class HighestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
       int n =sc.nextInt();
		int count = 0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			if(count>1) {
				if(n%2==0)
					n=n/2;
				else
					n=n/2-1;
				i=2;
				count=0;
			}
			if(count==1 && i==n) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}

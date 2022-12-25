package CodingNinja1;

import java.util.Scanner;
public class Binary_to_decimal {
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int sum=0;
		int x=1;
		while(n>0) {
			int r=n%10;
			int q=n/10;
			n=q;
			if(r!=0) {
				 sum=sum+x;
				 x=x*2;
				 continue;
			}
			else {
				x=x*2;
				continue;
			}
		}
		System.out.println(sum);
	
//	end	
		s.close();
	}
}

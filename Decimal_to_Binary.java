package CodingNinja1;

import java.util.Scanner;
public class Decimal_to_Binary {

		public static void main (String[] args) {
			Scanner s= new Scanner(System.in);
			long n= s.nextInt();
			long sum=0;
			long x=1;
			while(n>0) {
				long r=n%2;
				long q=n/2;
				n=q;
				long p=r*x;
				sum=sum+p;
				x=x*10;
			
				
			}
			System.out.print(sum);
//		end	
			s.close();
		}
	}

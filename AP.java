package CodingNinja1;
import java.util.Scanner;
public class AP {
		public static void main (String[] args) {
			Scanner s= new Scanner(System.in);
			int n= s.nextInt();
			
			for(int i=1;i<=n;i++) {
				
				int sum=3*i+2;
				if(sum%4==0) {
	                n=n+1;
					continue;
				}
				else {
					System.out.print(sum+" ");
				}
				
			}
//		end	
			s.close();
		}
	}
/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
*/
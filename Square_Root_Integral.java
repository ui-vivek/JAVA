package CodingNinja1;
import java.util.Scanner;

public class Square_Root_Integral {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int input=s.nextInt();
				if(input==0) {
					System.out.println(0);
					return;
				}
				int i;

		        for(i=0;i<input;i++){
		        	if(i*i<input) {
		        		continue;
		        	}
		        	else if(i*i==input) {
		        		System.out.println(i);
		        		break;
		        	}
		        	else {
		        		System.out.println(i-1);
		        		break;
		        	}
		        }

				
		s.close();
//		end	
		}
	}
/*
Given a number N, find its square root. 
You need to find and print only the integral part of square root of N.
 
For eg. if number given is 18, answer is 4.

Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2

*/
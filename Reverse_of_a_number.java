package CodingNinja1;

import java.util.Scanner;
public class Reverse_of_a_number {
		public static void main (String[] args) {
			Scanner s= new Scanner(System.in);
			int n= s.nextInt();
			
			int rem;
			int que;
				if(n==0) {
				System.out.println(0);
				return ;
			}
			int update=n;
			while(update>0) {
				rem=n%10;
				que=n/10;
				n=que;
				if(rem==0) {
					update=que;
					continue;
				}
				else {
					break;
				}
			}
			int i=update;
			while(i>0) {
				
				rem=update%10;
				que=update/10;
				update=que;
				System.out.print(rem);
				i=que;
				continue;
				
			}
		
//		end	
			s.close();
		}
	}
/*
 Write a program to generate the reverse of a given number N. 
 Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. 
For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
 */
 
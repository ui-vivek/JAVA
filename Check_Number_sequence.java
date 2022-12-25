package CodingNinja1;

import java.util.Scanner;
public class Check_Number_sequence {
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int n=s.nextInt();
				int F=s.nextInt();
				boolean isDec=true;
			
				for(int i=1;i<=n-1;i++) {
					
					int S=s.nextInt();
					
					if(F==S) {
						System.out.println("false");
			return;
					}
					 if(F<S) {
						isDec=false;
						F=S;
						continue;
					}
						 if(F>S){
						if(isDec==false) {
							System.out.println("false");
							return;
						}
						F=S;
						continue;
					}
					
				}
					
					System.out.println("true");
			}
	
}
/*
Output Format :
"true" or "false" (without quotes)
Constraints :
1 <= n <= 10^7
Sample Input 1 :
5
9
8
4
5
6
Sample Output 1 :
true
Sample Input 2 :
3
1
2
3
Sample Output 2 :
true
Sample Input 3 :
3
8
7
7
Sample Output 3 :
false
Explanation for Sample Format 3 :
8 7 7 is not strictly decreasing, so output is false.
Sample Input 4 :
6
8
7
6
5
8
2
Sample Output 4 :
false
Explanation for Sample Input 4 :
The series is :
8 7 6 5 8 2
It is strictly decreasing first (8 7 6 5). 
Then it's strictly increasing (5 8). 
But then it starts strictly decreasing again (8 2).
Therefore, the output for this test case is 'false'

*/
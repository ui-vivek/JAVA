package CodingNinja1;
import java.util.Scanner;

public class Sum_of_Odd_Even {

	public static void main(String[] args) {
		// start
		
		Scanner s= new Scanner(System.in);
		int input = s.nextInt();
		int sume=0;
		int sumo=0;
		
		
		while(input>0) {
			int q=input/10;
			int rem=input%10;
			
			if(rem%2==0) {
				sume=sume+rem;
			}
			if(rem%2!=0) {
				sumo=sumo+rem;
			}
			
			input=q;
		}
		System.out.println(sume +" "+sumo);
		s.close();
//end	
}
}

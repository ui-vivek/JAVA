package CodingNinja1;
import java.util.Scanner;
public class Pelondrom_number {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		int input=s.nextInt();
		int rev=0;
		int i=input;
		while(i>0) {
			int rem =i%10;
			int que= i/10;
			rev=rev*10+rem;
			i=que;
			
		}
		if(rev==input) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}

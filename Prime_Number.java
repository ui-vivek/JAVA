package CodingNinja1;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// start
		Scanner s =new Scanner(System.in);
	
		int a=s.nextInt();
		int i=2;
		while(i<a) {
			if(a%i==0) {
				System.out.println("Not prime");
				return;
			}
			i+=1;
		}
		System.out.println("prime");
//end	
	
		s.close();
}
}

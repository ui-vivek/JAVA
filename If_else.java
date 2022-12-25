package CodingNinja1;
import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		char ch=s.next().charAt(0);
		
		
		if(Character.isUpperCase(ch)) {
			System.out.println(1);
		}
		else if(Character.isLowerCase(ch)) {
			System.out.println(0);
		}
		else {
			System.out.println(-1);
		}
		s.close();
	}

}

package CodingNinja1;
import java.util.Scanner;
public class AP_Test {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		if(num<3) {
			System.out.println("false");
			return;
		}
		boolean isTrue=true;
		int f_num=s.nextInt();
		int s_num=s.nextInt();
		int diff=s_num-f_num;
		int step=num-2;
		for( int i=step;i>0;i--) {
			int t_num=s.nextInt();
			int diff2=t_num-s_num;
			if(diff==diff2) {
				s_num=t_num;
				isTrue=true;
				continue;
			}
			else if(diff!=diff2) {
				isTrue=false;
				break;
			}
			
		}
		if(isTrue) {
			System.out.println("treu");
		}
		else {
			System.out.println("false");
		}

	}

}

package CodingNinja1;
import java.util.Scanner;
public class All_N_Prime {
		public static void main (String[] args) {
			Scanner s= new Scanner(System.in);
			int n=s.nextInt();
			for(int i=2;i<=n;i++) {
				boolean re=true; 
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						re=false;
						break;
					}
					}
				if(re) {
					System.out.println(i);
				}
			}
//		end	
			s.close();
		}
	}

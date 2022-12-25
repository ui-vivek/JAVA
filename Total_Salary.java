package CodingNinja1;
import java.util.Scanner;

public class Total_Salary {

		public static void main(String[] args) {
			// start
			
			Scanner s= new Scanner(System.in);
			double salary = s.nextInt();
			char grade = s.next().charAt(0);
			double totalSalary;
			double hra= (salary*20)/100;
			double da= (salary*50)/100;
			double pf= (salary*11)/100;
			
//			   totalSalary = basic + hra + da + allow – pf
			
			if(grade=='a'||grade=='A') {
				int allow = 1700;
				totalSalary=salary+hra+da+allow-pf;
				System.out.println(Math.round(totalSalary));		
				}
			else if(grade=='b'||grade=='B') {
				int allow =1500;
				totalSalary=salary+hra+da+allow-pf;
				System.out.println(Math.round(totalSalary));
			}
			else {
				int allow =1300;
				totalSalary=salary+hra+da+allow-pf;
				System.out.println(Math.round(totalSalary));
				}
			
			
			s.close();
			
	//end	

	}
	}

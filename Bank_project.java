package CodingNinja1;

import java.util.Scanner;

public class Bank_project {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String arr[] = new String[3];
		arr[0] = "Check Balance";
		arr[1] = "Case Deposit";
		arr[2] = "Exit";
		int balance = 100;
		boolean tf = true;
		while (tf) {
			System.out.println(
					"Choose One Option : \n Prese : 0 To Check Balance \n Prese : 1 To Deposit balance \n Prese : 2 To Exit");
			try {

				try {
					int num = s.nextInt();
					System.out.println(arr[num]);
					if (num == 2) {
						System.out.println("Thank You For Using...");
						tf = false;
					} else if (num == 0) {
						System.out.println("Your Balance is :" + balance);
					} else {
						System.out.println("Enter The Amount To Deposit : ");
						int am = s.nextInt();
						if (am <= 0) {
							throw new ArithmeticException("Plese enter valid amount");
						}
						balance = balance + am;
						System.out.println("Your Balance Is Updated .");
					}
				} catch (Exception e) {
					System.out.println("Plese Enter Valid Option");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
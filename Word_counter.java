package CodingNinja1;

import java.util.Scanner;

class Word_counter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}
		int count = 1;
		if (str.length() == 0) {
			System.out.println(0);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);

	}
}
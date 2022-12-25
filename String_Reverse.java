package CodingNinja1;

class String_Reverse {

	public static void main(String[] args) {
//Start=================================================
		String str = "This code is done by vivek singh";
		String strr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strr = strr + str.charAt(i);
		}
//		System.out.println(strr);

		String rev = "";
		int start = 0;
		for (int i = 0; i < strr.length(); i++) {
			if (strr.charAt(i) == ' ') {
				String ans = "";
				int end = i;
				for (int j = start; j < end; j++) {
					ans = strr.charAt(j) + ans;
				}
				rev = rev + ans + " ";
				start = i + 1;
			}
		}
		String lrev = "";
		for (int k = strr.length() - 1; k > 0; k--) {
			lrev = lrev + strr.charAt(k);
			if (strr.charAt(k) == ' ') {
				break;
			}
		}
		rev = rev + lrev;
		System.out.println(rev);
//end==================
	}
}
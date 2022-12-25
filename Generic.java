package CodingNinja1;

class gen<V> { // generic -- Insted of data type we can use any word like A, n, ff, pk ,etc.
	void fun(V x) { // V can be string can be Integer or can be Double
		System.out.println("Hello Mr. " + x);
	}
}

class gen1<T, S> { // two types are passed
	void fun1(T a, S b) {
		System.out.println("This can be Integer = " + a + " and This can be string = " + b);
	}
}

public class Generic {
	public static <T> void print(T arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// Class First called --> gen_______________________________
		gen<String> ob = new gen<String>();
		ob.fun("vivek singh");
		gen<Integer> ob2 = new gen<Integer>(); // dont use 'int' // use Integer
		ob2.fun(420);
		// Class second called --> gen1 _______________________________
		gen1<Integer, String> obj = new gen1<Integer, String>(); // specifing the diff. data types
		obj.fun1(420, "Coding...");

		// function call-- _____________________________________________
		String arr[] = new String[5]; // same arr is used for String
		arr[0] = "abc";
		arr[1] = "def";
		arr[2] = "ghi";
		arr[3] = "jkl";
		arr[4] = "mno";
		System.out.println("For String : ");
		print(arr);
		Integer arr1[] = { 7, 4, 1, 0, 9 }; // Integer arr1[] = new Integer[5]
		System.out.println(" \nFor Integer : "); // same arr is used for Integer as well
		print(arr1);

	}

}

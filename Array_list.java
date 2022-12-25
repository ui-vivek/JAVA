package CodingNinja1;

import java.util.ArrayList;

public class Array_list {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(10);
		arr.add(44);
		arr.add(20);
		arr.add(24);
		arr.set(0, 37); // it will remove the element at 0, add 37 there.
		arr.add(1, 9); // it will add '9' at index 1, and all elements get sifted 1 element in right.
		System.out.println(arr); // will print all element like an Array.
		System.out.println("Size of arr is " + arr.size());
		System.out.println(arr.get(1));
		System.out.println(arr.indexOf(24));
		System.out.println("for loop");
		for (int i = 0; i < 5; i++) {
			arr.add(i);
		}
//		for (int i : arr) {      //This is "for each loop" // to travel all the elements of the array.
//			System.out.println(i);
//		}
		System.out.println(arr.clone()); // will print all element like an Array.
		System.out.println(arr.remove(2)); // will remove element form that index.
		System.out.println(arr);

//		ArrayList<Character> sarr = new ArrayList<>();
		ArrayList<String> sarr = new ArrayList<>();
		sarr.add("vivek");
		sarr.add("kumar");
		sarr.add("Singh");
		System.out.println(sarr);
		System.out.println(sarr.size());

		for (int i = 0; i < sarr.size(); i++) {
			System.out.println(sarr.get(i));
		}
		System.out.println(sarr);
	}

}

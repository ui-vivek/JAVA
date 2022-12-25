package CodingNinja1;

import java.util.ArrayList;

public class Array_list_2 {

	public static ArrayList<Integer> removedupli(int arr[]) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 5, 6, 6, 7, 8, 8, 9, 9 };
		ArrayList<Integer> print = removedupli(arr);  // Store it in ArrayList.
		System.out.println(print);

	}

}

package CodingNinja1;
import java.util.*;
public class Linear_Search {
	public static void linear_search(int arr[]) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter The Number to Find :-");
		int number =s.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				System.out.println("The number Present at "+(i+1));
				return ;
			}
		}
		System.out.println("Number not fond :(");
		
	}
	public static int [] createArr(int Arr_size) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[Arr_size];
		System.out.println("Enetr the "+Arr_size+" elment in Array :- ");
		for(int i=0;i<Arr_size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array :-");
		int Arr_size=s.nextInt();
		
		int arr[]=createArr(Arr_size);
		linear_search(arr);

	}

}

package CodingNinja1;
import java.util.*;
public class Selection_Shorting {

	public static void Selection_short(int arr[]) {
		int temp=0;
	
		for(int i=0;i<arr.length;i++) {
			int j=i+1;
			while(j<arr.length) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
				
			}
				System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
	int arr[]= {5,7,3,8,1,0};
	Selection_short(arr);
	}

}

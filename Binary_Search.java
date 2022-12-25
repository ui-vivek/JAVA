package CodingNinja1;
public class Binary_Search {

	public static int BS(int arr[]) {
		int x=12; //search element -----------------------------

		int start=0,end=arr.length-1,mid;
		for(int i=0;i<arr.length;i++) {
	
			mid=(start+end)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(x>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1 ,3, 7, 9, 11, 12, 45};
		
		BS(arr);
		int result=BS(arr);
		System.out.println("Element is present at Array index : "+ result);
}}

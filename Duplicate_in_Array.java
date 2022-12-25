package CodingNinja1;
public class Duplicate_in_Array {
	public static void pair(int arr[]){
		  int value=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            int j=0;
	            while(j<arr.length)
	            {
	                if(i==j)
	                {
	                    j++;
	                    continue;
	                }
	                if(arr[i]==arr[j])
	                {
	                    value=arr[i];
	                    System.out.println("The First duplicate value in the array : "+value);
	                   return ;
	                }
	                value =arr[i];
	                j++;
	            }
	            
	        }
	    }
		public static void main(String args[]){
		    int arr[] = {4, 2, 3 ,3,1 ,0};
		    pair(arr);
		}
		
	}



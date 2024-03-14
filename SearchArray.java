package arraypprogram;
import java.util.*;
public class SearchArray {
	
	public static int searchArray(int arr[], int num)
	{
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==num)
		   {
			   return i;
		   }
	   }
	   
	   return -1;
	
	}
	
	
	public static void main(String[] args) {
		int a[]= {12,33,44,55,66,55,78,89,90};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elemnet");
		int num=sc.nextInt();
		
		System.out.println(num+":is found at index="+searchArray(a, num));
		
		
		
		
	}
	

}

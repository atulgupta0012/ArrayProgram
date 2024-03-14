package arraypprogram;

public class ArrayElementAddRemove {
	public static void main(String[] args) {
		int arr[]= {12,33,45,56,67,78};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==45)
			{
				arr[i]=100;
			}
			
			System.out.print(arr[i]+" ");
		}
	}

}




package arraypprogram;

public class SecondLargestElement {
	public static void main(String[] args) {
		
		int arr[]= {12,33,44,55,66,77,77,89};
		int temp;
		
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Second largest element of an array is:"+arr[size-2]);
	}

}

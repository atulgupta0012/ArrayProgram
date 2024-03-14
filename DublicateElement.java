package arraypprogram;

public class DublicateElement {
	
	public static void main(String[] args) {
		int arr[]= {12,33,45,56,67,78,89,12,45,89};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+": is the dublicate numbers");
				}
			}
		}
	
		
	}

}

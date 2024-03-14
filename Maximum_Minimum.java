package arraypprogram;

public class Maximum_Minimum {
	public static void main(String[] args) {
		int arr[]= {12,44,55,67,78,89,90,44};
		
		int size=arr.length;
		
		int maxvalue=arr[0];
		int minvalue=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>maxvalue)
			{
				maxvalue=arr[i];
			}
			
			if(arr[i]<minvalue)
			{
				
				minvalue=arr[i];
			}
		}
		
		System.out.println("Maximu value is:"+maxvalue+" And Minumum value is:"+minvalue);
		
		
	}

}

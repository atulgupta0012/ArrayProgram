package arraypprogram;

public class ArrayPositiveNegativeSequence {
public static void main(String[] args) {
	int arr[]= {-12,-34,-56,-11,0,45,56,-67,-78,89,90};
	int size=arr.length;
	
	for(int i=0;i<size;i++)
	{
		if(arr[i]<0)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
    for(int j=0;j<size;j++)
    {
    	if(arr[j]>=0)
    	{
    		System.out.print(arr[j]+" ");
    	}
    }
}
}

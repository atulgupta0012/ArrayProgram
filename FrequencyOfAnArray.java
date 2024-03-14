package arraypprogram;

public class FrequencyOfAnArray {
	
	public static void main(String[] args) {
		int arr1[]= {12,34,56,66,77,88,21};
		int arr2[]= {45,67,78,89,12,34,56};
		int size1=arr1.length;
		int size2=arr2.length;
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("Common element in both array is:"+arr2[j]);
				}
			}
		}
	}

}

/*Descending order*/
package arraypprogram;

public class SortingProgram1 {
	public static void main(String[] args) {
		int arr[]= {12,44,55,66,77,88,99,30,1,5};
		int size=arr.length;
		int temp;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

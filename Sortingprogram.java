
/*Ascending oreder
*/
package arraypprogram;

public class Sortingprogram {
	
	public static void main(String[] args) {
		int arr[]= {12,64,66,8,90,89,78,67,63,1,4,5,3};
		int size=arr.length;
		int temp;
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
		
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

import java.util.*;
class Selection_Sort
{
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter the element:");
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<N-1;i++)
		{
			int small=arr[i];
			int index=i;
			for(int j=i+1;j<N;j++)
			{
				if(arr[j]<small)
				{
					small=arr[j];
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
}
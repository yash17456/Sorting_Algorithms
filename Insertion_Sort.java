import java.util.*;
class Insertion_Sort
{
	public static void main(String...args)
	{
		int k=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter the element in array:");
			arr[i]=scan.nextInt();
		}
		sorting(arr,N,k);
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sorting(int arr[], int N ,int k)
	{
		int p=k;
		for(int i=p-1;i>=0;i--)
		{
			if(arr[i]>arr[p])
			{
				int temp=arr[p];
				arr[p]=arr[i];
				arr[i]=temp;
				p=p-1;
			}
			else
			{
				break;
			}
		}
		if(k<N-1)
		{
			k=k+1;
			sorting(arr,N,k);
		}
	}
}
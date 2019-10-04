import java.util.*;
class Quick_Sort
{
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter Element:");
			arr[i]=scan.nextInt();
		}
		Quick(arr,0,N-1);
		
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Quick(int arr[], int first, int last)
	{
		if(first<last)
		{
			int q=Division(arr,first,last);
			Quick(arr,first,q-1);
			Quick(arr,q+1,last);
		}
	}
	
	public static int Division(int arr[], int first, int last)
	{
		int pivot=last;
		int p=first;
		int q=last-1;
		while(p<q)
		{
			if(arr[p]<=arr[pivot] && arr[q]>=arr[pivot])
			{
				p=p+1;
				q=q-1;
			}
			
			else if(arr[p]>arr[pivot] && arr[q]<arr[pivot])
			{
				int temp=arr[p];
				arr[p]=arr[q];
				arr[q]=temp;
				p=p+1;
				q=q-1;
			}
			
			else if(arr[p]<=arr[pivot] && arr[q]<arr[pivot])
			{
				p=p+1;
			}
			
			else if(arr[p]>arr[pivot] && arr[q]>=arr[pivot])
			{
				q=q-1;
			}
		}
		
		if(p==q && arr[p]>arr[pivot])
		{
			int temp=arr[pivot];
			arr[pivot]=arr[p];
			arr[p]=temp;
		}
		
		if(p>q)
		{
			int temp=arr[pivot];
			arr[pivot]=arr[p];
			arr[p]=temp;
		}
		
		
		return p;
	}
	
	
}
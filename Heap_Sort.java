import java.util.*;
class Heap_Sort
{
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int N=scan.nextInt();
		int arr[]=new int[N];
		int heap_size=arr.length-1;
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter element:");
			arr[i]=scan.nextInt();
		}
		Build_Max_Heap(arr,heap_size);
		for(int i=arr.length-1;i>0;i--)
		{
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heap_size=heap_size-1;
			Max_Heapify(arr,0,heap_size);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Build_Max_Heap(int arr[], int heap_size)
	{
		for(int i=heap_size/2;i>=0;i--)
		{
			Max_Heapify(arr,i,heap_size);
		}
	}
	
	public static void Max_Heapify(int arr[], int i, int heap_size)
	{
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		if(left<=heap_size && arr[left]>arr[largest])
		{
			largest=left;
		}
		if(right<=heap_size && arr[right]>arr[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			Max_Heapify(arr,largest,heap_size);
		}
		
	}
}
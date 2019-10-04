import java.util.*;
class Merge_Sort
{
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter element:");
			arr[i]=scan.nextInt();
		}	
		Division(arr,0,N-1);
	}
	
	public static void Division(int arr[], int l, int r)
	{
		if(l<r)
		{
			int mid=((l+r)/2);
			Division(arr,l,mid);
			Division(arr,mid+1,r);	
			Merge(arr,l,mid,r);
		}		
	}	
	
	public static void Merge(int arr[],int l,int mid, int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++)
			{
				left[i]=arr[l+i];
			}
			
		for(int i=0;i<n2;i++)
			{
				right[i]=arr[i+mid+1];
			}

        int i=0,j=0,k=l;	

		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i=i+1;
				k=k+1;
			}
			
			else
			{
				arr[k]=right[j];
				j=j+1;
				k=k+1;
			}
		}
		
		while(i<n1)
		{
			arr[k]=left[i];
			i=i+1;
			k=k+1;
		}
		
		while(j<n2)
		{
			arr[k]=right[j];
			j=j+1;
			k=k+1;
		}
		
		//System.out.println("The sorted array is ");
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}
}
import java.util.*;
class Bubble_Sort
{
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter element:");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
}
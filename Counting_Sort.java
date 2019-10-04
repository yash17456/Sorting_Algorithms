import java.util.*;
class Counting_Sort
{
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int N=scan.nextInt();
		int orgn[]=new int[N];
		System.out.println("Enter the range from 0:");
		int R=scan.nextInt();
		int count[]=new int[R+1];
		Arrays.fill(count,0);
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter element:");
			orgn[i]=scan.nextInt();
		}
		
		Sort(orgn,count,R);
	}
	
	public static void Sort(int orgn[], int count[], int R)
	{
		for(int i=0;i<orgn.length;i++)
		{
			count[orgn[i]]=count[orgn[i]]+1;
		}
		
		for(int i=1;i<R+1;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		System.out.println("The count array is:");
		for(int i=0;i<R+1;i++)
		{
			System.out.print(count[i]+" ");
		}
		for(int i=R;i>0;i--)
		{
			count[i]=count[i-1];
		}
		count[0]=0;
		int fin[]=new int[orgn.length]; 
		
		for(int i=0;i<fin.length;i++)
		{
			fin[count[orgn[i]]]=orgn[i];
			count[orgn[i]]=count[orgn[i]]+1;
		}
		
		System.out.println("The final sorted array is:");
		
		for(int i=0;i<fin.length;i++)
		{
			System.out.print(fin[i]+" ");
		}
	}
}
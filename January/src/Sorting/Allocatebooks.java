package Sorting;

public class Allocatebooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {30,10,50,20};
int k=2;
System.out.println(fun(arr,k));
	}

	private static int fun(int[] arr, int k) {
		// TODO Auto-generated method stub
		int min=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			min=Math.max(min, arr[i]);
		}
		System.out.println(sum+" "+min);
		int start=min;
		System.out.println(start);
		int res=Integer.MAX_VALUE;
		while(start<=sum)
		{
			int mid=(start+sum)/2;
			if(check(arr,k,mid))
			{
				res=mid;
				sum=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return res;
		//System.out.println(binearysearch(arr,min,sum,k));
	}

	public static boolean check(int arr[],int k,int x)
	{
		int sum=0;
		int counter=1;
		for(int i=0;i<arr.length;i++)
		{
			
			sum+=arr[i];
			if(sum>x)
			{
				counter++;
				sum=arr[i];
			}
			if(counter>k)
			{
				return false;
			}
		}
		if(counter<k)
		{
			return false;
		}
		return true;
	}

}

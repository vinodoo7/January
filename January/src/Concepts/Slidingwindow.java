package Concepts;
import java.util.*;


public class Slidingwindow {
	public static void main(String[] args)
	{
		int arr[]= {2,5,1,8,2,9,6};
		int k=3;
		//System.out.println(Bruteforce(arr,k));
		SlidingApproach(arr,k);
	}


	private static int Bruteforce(int[] arr, int k) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum+=arr[j];
				if(sum>max)
				{
					max=sum;
				}
				//System.out.println(i+" "+j+" sum "+ sum);
			}
		}
		return max;
	}
	
	private static void SlidingApproach(int[] arr, int k) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int max=0;
		int sum=0;
		while(i<k)
		{
			sum+=arr[i];
			i++;
		}
		System.out.println(sum);
		
	}
	
	
	
	
}

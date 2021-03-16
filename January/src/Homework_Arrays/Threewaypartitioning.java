package Homework_Arrays;
import java.util.*;
public class Threewaypartitioning {

	public static void main(String[] args) {
		int arr[]= {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		int low=14;
		int high=20;
		for(int i=0;i<arr.length;)
		{
			i++;
			System.out.print(i+" ");
		}
		
		//DutchNationalFlag(arr);
		// TODO Auto-generated method stub
		//Threewaypartitioning(arr,low,high);
		
	}

	private static void Threewaypartitioning(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int l=0;
		int h=arr.length-1;
		for(int i=0;i<=h;)
		{
			if(low>arr[i])
			{
				int temp=arr[l];
				arr[l]=arr[i];
				arr[i]=temp;
				l++;
				i++;
				
			}
			else if(arr[i]>high)
			{
				int temp=arr[h];
				arr[h]=arr[i];
				arr[i]=temp;
				h--;
				
			}
			else
			{
				i++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		
	}

	private static void DutchNationalFlag(int[] arr) {
		// TODO Auto-generated method stub
		int hi=arr.length-1;
		int lo=0;
		int mid=0;
		while(mid<=hi)
		{
			if(arr[mid]==0)
			{
				int temp=arr[lo];
				arr[lo]=arr[mid];
				arr[mid]=temp;
				lo++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else if(arr[mid]==2)
			{
				int temp=arr[hi];
				arr[hi]=arr[mid];
				arr[mid]=temp;
				hi--;
			}	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
	

}

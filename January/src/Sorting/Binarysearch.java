package Sorting;
import java.util.*;
public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,7,8,11,22,32,65,88,98};
		int target=99;
		System.out.println(binearysearch(arr,target,0,arr.length-1));
		binearysearchNoRecursion(arr,target);

	}

	private static boolean binearysearchNoRecursion(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(arr[mid]==target)
			{
				return true;
			}
			else if(arr[mid]<target)
			{
				lo=mid+1;
			}
			else
			{
				hi=mid-1;
			}
		}
		return false;
		
	}

	private static boolean binearysearch(int[] arr, int target,int lo,int hi) {
		// TODO Auto-generated method stub
		if(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(arr[mid]==target)
			{
				return true;
			}
			else if(arr[mid]<target)
			{
				return binearysearch(arr,target,mid+1,hi);
			}
			else
			{
				return binearysearch(arr,target,lo,mid-1);
			}
		}
		return false;
		
	}

}

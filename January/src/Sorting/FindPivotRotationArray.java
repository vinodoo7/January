package Sorting;
import java.util.*;
public class FindPivotRotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {13,14,15,16,17,1,2,3,11,12};
		int pos=findpivot(arr);
		System.out.println(pos);
		int target=17;
		System.out.println(binearysearch(arr,arr.length-1,target,pos));
	
	}

	private static int binearysearch(int[] arr, int length, int target, int pos) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		if(arr[pos]==target)
		{
			return pos;
		}
		else if(arr[pos]<target && target<arr[length])
		{
			return bineary(arr,target,pos,hi);
		}
		else
		{
			return bineary(arr,target,lo,pos-1);
		}
	}

	private static int bineary(int[] arr, int target, int pos, int hi) {
		// TODO Auto-generated method stub
		int lo=pos;
		
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(arr[mid]==target)
			{
				return mid;
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
		return -1;
	}

	private static int findpivot(int[] arr) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;		
		while(lo<hi)
		{
			int mid=(lo+hi)/2;
			if(arr[mid]<arr[hi])
			{
				hi=mid;  
			}
			else if(arr[mid]>arr[0])
			{
				lo=mid+1;
			}
			else
			{
				return arr[lo];
			}
			
		}
		return hi;
	}
	
}

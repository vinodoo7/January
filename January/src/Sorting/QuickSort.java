package Sorting;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,11,2,5,10,6,3,-2,90};
		quick(arr,0,arr.length-1);
		for(int f:arr)
		{
			System.out.print(f+" ");
		}
	}

	private static int partition(int[] arr,int lo,int hi) {
		// TODO Auto-generated method stub
		int i=lo-1;
		int pivot=arr[hi];
		for(int j=lo;j<hi;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,hi);
		return i+1;
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void quick(int[] arr,int lo,int hi) {
		// TODO Auto-generated method stub
        if(lo<hi)
        {
        	int pi=partition(arr,lo,hi);
        	quick(arr,lo,pi-1);
        	quick(arr,pi+1,hi);
        }
		
	}

}

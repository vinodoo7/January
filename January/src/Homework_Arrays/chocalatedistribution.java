package Homework_Arrays;

import java.util.Arrays;

public class chocalatedistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12} ; 
				int m = 5;
			chocalate(arr,m);

	}
static int count=Integer.MAX_VALUE;
	private static void chocalate(int[] arr, int m) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i=0;i<arr.length-m+1;i++)
		{
			int diff=arr[i+m-1]-arr[i];
			count=Math.min(count, diff);
		}
		System.out.println(count);
		
	}

}

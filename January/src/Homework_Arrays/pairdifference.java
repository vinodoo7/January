package Homework_Arrays;
import java.util.*;
public class pairdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,3,4,2};
		int n=3;
		pair(arr,n);

	}

	private static void pair(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int res=arr[j]-arr[i];
				if(res==n)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
	}

}

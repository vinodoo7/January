package Homework_Arrays;
import java.util.*;
public class MinPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910,  1120, 1130,1200, 1900, 2000 };
        int n=arr.length;
        
        platforms(arr,dep,n);
	}

	private static void platforms(int[] arr, int[] dep, int n) {
		// TODO Auto-generated method stub
		int maxstations=1;
		int curstation=1;
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i=1;
		int j=0;
		while(j<n &&i<n)
		{
			if(arr[i]<=dep[j])
			{
				curstation++;
				i++;
				
			}
			else if(arr[i]>dep[j])
			{
				curstation--;
				j++;
			}
			if(curstation>maxstations)
			{
				maxstations=curstation;
			}
		}
		System.out.println(maxstations);
		
	}

}

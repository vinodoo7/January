package Homework_Arrays;

import java.util.*;

public class Sorted_Pair_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,2,5,1,-7,13,6};
		int target=7;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				//System.out.println(i+" "+j);
//				int s=arr[i]+arr[j];
//				if(target==s)
//				{
//					System.out.println(arr[i]+" "+arr[j]);
//				}
//			}
//		}
		Pairnlogn(arr,target);

	}

	private static void Pairnlogn(int[] arr,int target) {
		// TODO Auto-generated method stub
	HashSet<Integer> hm=new HashSet<>();
	for(int i=0;i<arr.length;i++)
	{
		int x=target-arr[i];
		if(hm.contains(x))
		{
			System.out.println(arr[i]+" "+x);
		}
		hm.add(arr[i]);
	}
	
	}
}

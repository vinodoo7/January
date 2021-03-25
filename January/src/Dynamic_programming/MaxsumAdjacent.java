package Dynamic_programming;
import java.util.*;
public class MaxsumAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,10,100,10,5};
		maxsumAdjacent(arr);
	}

	private static void maxsumAdjacent(int[] arr) {
		// TODO Auto-generated method stub
		int include=0;
		int exclude=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			int temp=Math.max(exclude, include);
			include=exclude+arr[i];
			exclude=temp;
		}
		System.out.println(Math.max(include,exclude));
		
	}

}

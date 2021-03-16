package Stack;
import java.util.*;
public class LargestAreaofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargesrArea();

	}

	private static void LargesrArea(int arr[]) {
		// TODO Auto-generated method stub
		int lb[]=new int[arr.length];
		int ub[]=new int[arr.length];
		//calculating lower boundary
		
		//calculating Upper Boundary
		
		int maxArea=0;
		for(int i=0;i<arr.length;i++)
		{
			int l=arr[i];
			int b=ub[i]-lb[i]-1;
			int area=l*b;
			maxArea=Math.max(area, maxArea);
		}
	}

}

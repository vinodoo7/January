package Homework_Arrays;
import java.util.*;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		volume(height);
	}

	private static void volume(int[] height) {
		// TODO Auto-generated method stub
		int left[]=new int[height.length];
		
		int max=0;
		int right[]=new int[height.length];
		for(int i=0;i<height.length;i++)
		{
			max=Math.max(height[i],max);
			left[i]=max;
		}
		max=0;
		for(int i=height.length-1;i>=0;i--)
		{

			max=Math.max(height[i],max);
			right[i]=max;
		}
		int count=0;
		for(int d:left)
		{
			//System.out.print(d+" ");
		}
		System.out.println(" ");
		for(int d:right)
		{
			//System.out.print(d+" ");
		}
		System.out.println(" ");
		for(int i=0;i<height.length;i++)
		{
			int s=Math.min(left[i], right[i]);
			//System.out.println(s);
			count+=s-height[i];
			
		}
		System.out.println(count);
		
	}

}

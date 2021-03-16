package Homework_Arrays;
import java.util.*;
public class rotation_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12},{13,14,15,16} 
                 };
		//Clockwise
		// Step-1 : Transpose
		// Step-2 : change rows
		
		//ANTI Clockwise
			// Step-1 : Transpose
			// Step-2 : change col
		//clockwise(arr);
		Anticlockwise(arr);
		 
//		1 2 3   00 01 02   	1 4 7  00 10 20  20 10 00
//		4 5 6   10 11 12	2 5 8  01 11 21  21 11 01
//		7 8 9   20 21 22	3 6 9  02 12 22  22 12 02
//		
//		
		
	}
	
	

	private static void Anticlockwise(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[i].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int k=arr.length-1;
			for(int j=0;j<arr.length/2;j++)
			{
				int temp=arr[j][i];
				arr[j][i]=arr[k][i];
				arr[k][i]=temp;
				k--;
			}
		}
		
//		for(int i=0;i<arr.length;i++)
//		{
//			int l=0;
//			int r=arr[i].length-1;
//			
//				while(l<r)
//				{
//						int temp=arr[i][r];
//						arr[i][r]=arr[i][l];
//						arr[i][l]=temp;
//						l++;
//						r--;
//						
//					}
//					
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		

	
		
	}

	private static void clockwise(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[i].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
//		int l=0;
//		int r=arr[0].length-1;
//		
//			while(l<r)
//			{
//				for(int i=0;i<arr.length;i++)
//				{
//					int temp=arr[i][r];
//					arr[i][r]=arr[i][l];
//					arr[i][l]=temp;
//					
//					
//				}
//				l++;
//				r--;
//			}
		
		for(int i=0;i<arr.length;i++)
		{
			int l=0;
			int r=arr[i].length-1;
			
				while(l<r)
				{
						int temp=arr[i][r];
						arr[i][r]=arr[i][l];
						arr[i][l]=temp;
						l++;
						r--;
						
					}
					
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}
		
	}



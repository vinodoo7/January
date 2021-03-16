package Backtracking;
import java.util.*;
public class Nqueen {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		for (int[] row : arr) 
            Arrays.fill(row, 0);
		
		Nqueen_problem(arr,0,"");
		// TODO Auto-generated method stub

	}

	private static void Nqueen_problem(int[][] arr,int row,String res) {
		// TODO Auto-generated method stub
		if(row==arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println(res+" ");
			return;
		}
		for(int i=0;i<arr[0].length;i++)
		{
			if(issafe(arr,row,i))
			{
				arr[row][i]=1;
				Nqueen_problem(arr,row+1,res + "[" + row + "-" + i + "]");
				arr[row][i]=0;	
			}
		}
	}

	private static boolean issafe(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		//Diagonal 1
		int r=row-1;
		int c=col-1;
		while(r>=0 && c>=0)
		{
			if(arr[r][c]==1)
			{
				return false;
			}
			r--;
			c--;
		}
		//Diagonal 2
		
		r=row-1;
		c=col+1;
		while(r>=0 && c<arr[0].length)
		{
			if(arr[r][c]==1)
			{
				return false;
			}
			r--;
			c++;
		}
		//Column
		
		for(int i=row-1;i>=0;i--)
		{
			if(arr[i][col]==1)
			{
				return false;
			}
		}
			
		return true;
	}

}

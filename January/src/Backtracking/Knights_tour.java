package Backtracking;
import java.util.*;
public class Knights_tour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int arr[][]=new int[n][n];
		int r=2;
		int c=0;
		knights(arr,n,r,c,1);

	}

	private static void knights(int[][] arr, int n,int row,int col,int move) {
		// TODO Auto-generated method stub
		if(row<0 ||col<0 || row >= arr.length ||col >= arr.length|| arr[row][col]>0 )
		{
			return;
		}
		else if(move==arr.length*arr.length)
		{
			arr[row][col]=move;
			display(arr);
			System.out.println();
			arr[row][col]=0;
			return;
		}
		arr[row][col]=move;
		knights(arr,n,row-2,col+1,move+1);
		knights(arr,n,row-1,col+2,move+1);
		knights(arr,n,row+1,col+2,move+1);
		knights(arr,n,row+2,col+1,move+1);
		
		knights(arr,n,row+2,col-1,move+1);
		knights(arr,n,row+1,col-2,move+1);
		knights(arr,n,row-1,col-2,move+1);
		knights(arr,n,row-2,col-1,move+1);
		arr[row][col]=0;
		
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
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

package Backtracking;
import java.util.*;
public class printAllPathsRect {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat =
	        {
	            { 1, 2, 3 },
	            { 4, 5, 6 },
	            { 7, 8, 9 }
	        };
		Stack<Integer> st=new Stack<>();
		printpaths(mat,st,0,0);

	}

	private static void printpaths(int[][] mat,Stack<Integer> st,int row,int col) {
		// TODO Auto-generated method stub
		if(row<0 || col<0 ||col>=mat.length || row>=mat.length)
		{
			return;
		}
		st.push(mat[row][col]);
		if(row==mat.length-1 && col==mat.length-1)
		{
//			st.push(mat[row][col]);
			System.out.println(st);
			st.pop();
			return;
		}
		
		
			printpaths(mat,st,row,col+1);
			printpaths(mat,st,row+1,col);
		
		
		
		st.pop();
		
	}

}

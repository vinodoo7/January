package Backtracking;
import java.util.*;
public class Rat_in_a_maze {

	public static void main(String[] args) {
		int maze[][] = {{1, 1, 1, 1}, 
                {1, 0, 1, 1}, 
                {0, 1, 1, 1}, 
                {1, 1, 1, 1}}; 
		    int[][] path = new int[maze.length][maze[0].length];
		    solveMaze(maze, path, 0, 0);

	}

	private static void solveMaze(int[][] maze, int[][] path, int row, int col) {
		// TODO Auto-generated method stub
		if(row==maze.length-1 && col==maze[0].length-1)
		{
			if(maze[row][col]==1)
			{
				path[row][col]=1;
			}
			printsolution(path);
			return;
		}
		
		    if(issafe(maze,row,col))
		    {
		    	 if (maze[row][col] == 0) {
				        return;
				    }

				    path[row][col] = 1;
				    solveMaze(maze, path, col, row + 1);
			        solveMaze(maze, path, col + 1, row);
			        path[row][col] = 0;
		    }	
	}
	private static boolean issafe(int[][] maze, int row, int col) {
		// TODO Auto-generated method stub
		if((row>=0 && row<maze.length) && (col>=0 && col<maze[0].length) && maze[row][col]!=0)
		{
			return true;
		}
		return false;
	}

	private static void printsolution(int[][] path) {
		// TODO Auto-generated method stub
		for(int i=0;i<path.length;i++)
		{
			for(int j=0;j<path[0].length;j++)
			{
				System.out.print(path[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
	}


	
	
	/*private static void countMazepaths(int[][] maze) {
		// TODO Auto-generated method stub
		int sol[][]=new int[maze.length][maze[0].length];

		if(solveAllways(maze,sol,0,0)==true)
		{
			for(int i=0;i<sol.length;i++)
			{
				for(int j=0;j<sol[0].length;j++)
				{
					System.out.print(sol[i][j]);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("not possible");
		}
		
	}

	private static boolean solveAllways(int[][] maze, int[][] sol, int row, int col) {
		// TODO Auto-generated method stub
		//Base case reaches
		if(row==maze.length-1 && col==maze[0].length-1)
		{
			if(maze[row][col]==1)
			{
				sol[row][col]=1;
			}
			
			
			return true;
		}
		//condition 1 issafe
		if(issafe(maze,row,col)==true)
		{
			sol[row][col]=1;
			
			if(solveAllways(maze,sol,row+1,col))
			{
				return true;
			}
			if(solveAllways(maze,sol,row,col+1))
			{
				return true;
			}
			sol[row][col]=0;
			return false;
			
		}
		else
		{
			return false;
		}
	}

	private static boolean issafe(int[][] maze, int row, int col) {
		// TODO Auto-generated method stub
		if((row>=0 && row<maze.length) && (col>=0 && col<maze[0].length) && maze[row][col]!=0)
		{
			return true;
		}
		return false;
	}*/

}

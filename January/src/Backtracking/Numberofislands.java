package Backtracking;
import java.util.*;
public class Numberofislands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
             { 0, 1, 0, 0, 1 }, 
             { 1, 0, 0, 1, 1 }, 
             { 0, 0, 0, 0, 0 }, 
             { 1, 0, 1, 0, 1 } }; 
             Islands(arr);
	}

	private static void Islands(int[][] arr) {
		// TODO Auto-generated method stub
		boolean[][] visited=new boolean[arr.length][arr[0].length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				ArrayList<Integer> al=new ArrayList<>();
				if(arr[i][j]==1 && visited[i][j]==false)
				{
					
					NumberofIslands(arr,visited,i,j,al);
					for(int g: al)
					{
						System.out.print(g+" ");
					}
					System.out.println();
					if(al.size()>0)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static void NumberofIslands(int[][] arr, boolean[][] visited, int i, int j,ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		if(i<0||j<0||i>=arr.length||j>=arr[0].length|| visited[i][j]==true|| arr[i][j]==0)
		{
			return;
		}
		al.add(arr[i][j]);
		visited[i][j]=true;
		NumberofIslands(arr,visited,i-1,j,al);
		NumberofIslands(arr,visited,i,j-1,al);
		NumberofIslands(arr,visited,i,j+1,al);
		NumberofIslands(arr,visited,i+1,j,al);
		NumberofIslands(arr,visited,i-1,j-1,al);
		NumberofIslands(arr,visited,i+1,j-1,al);
		
		
	}

}

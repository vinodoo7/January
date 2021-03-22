package Backtracking;
import java.util.*;
public class goldmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[][]= {{1,0,3},{1,0,3},{1,0,3},{1,0,3}};
		int arr[][]= {{10,0,100,200,0,8,0},{20,0,0,0,0,6,0},{30,0,0,9,12,3,4},
				{40,0,2,5,8,3,11},{0,0,0,0,0,9,0},{5,6,7,0,7,4,2},{8,9,10,0,1,10,8}};
		findmax(arr);
	}

	private static void findmax(int[][] arr) {
		// TODO Auto-generated method stub
		boolean[][] visited=new boolean[arr.length][arr[0].length];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				ArrayList<Integer> al=new ArrayList<>();

				if(arr[i][j]!=0 && visited[i][j]==false)
				{
					int sum=0;
					findbagofele(arr,i,j,visited,al);
					for(int g:al)
					{
						System.out.print(g+"  ");
						sum+=g;
					}
					System.out.println();
					max=Math.max(max, sum);
					
				}
			}
		}
		System.out.println(max);
		
	}

	private static void findbagofele(int[][] arr,int row,int col, boolean[][] visited, ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		if(row<0 || col<0 || row>=arr.length || col>=arr[0].length || visited[row][col]==true || arr[row][col]==0 )
		{
			return;
		}
		visited[row][col]=true;
		al.add(arr[row][col]);
		findbagofele(arr,row-1,col,visited,al);
		findbagofele(arr,row-1,col-1,visited,al);
		findbagofele(arr,row,col+1,visited,al);
		findbagofele(arr,row+1,col,visited,al);
		
	}

}

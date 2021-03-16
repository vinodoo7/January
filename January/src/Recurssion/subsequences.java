package Recurssion;
import java.util.*;
public class subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int arr[]= {1,2,3};
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
//		subsequences(s,0,"");
		ArrayList<Integer> values=new ArrayList<>();
		subsequencearray(arr,res,0,values);
		System.out.println(res);

	}
//  BACK TRAKING 
	private static void subsequencearray(int arr[],ArrayList<ArrayList<Integer>> res, int vidx, ArrayList<Integer> values) {
		// TODO Auto-generated method stub
		if(vidx==arr.length)
		{
			res.add(new ArrayList<>(values));
			return;
		}
		
		values.add(arr[vidx]);
		subsequencearray(arr, res, vidx+1, values);
		values.remove(values.size()-1);
		subsequencearray(arr, res, vidx+1, values);
			
	}
//::::::::::::::::::::::   Recursion  :::::::::
	private static void subsequences(String s, int vidx, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0)
		{
			System.out.println(ans);
			return;
		}	
			char c = s.charAt(0);
			String x=s.substring(1);	
			subsequences(x,vidx+1,ans);
			subsequences(x,vidx+1,ans+c);

	}

}

package Backtracking;
import java.util.*;
public class partitionpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Lakshyareddy";
		partition(s,"");

	}

	private static void partition(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0)
		{
			System.out.println(ans);
		}
		for(int i=0;i<s.length();i++)
		{
			String prefix=s.substring(0,i+1);
			if(ispalindrome(prefix))
			{
				String remaining=s.substring(i+1);
				partition(remaining,ans+prefix+" ");
				
			}
		}
	}

	private static boolean ispalindrome(String prefix) {
		// TODO Auto-generated method stub
		int l=0;
		int r=prefix.length()-1;
		while(l<=r)
		{
			if(prefix.charAt(l)!=prefix.charAt(r))
			{
				return false;
			}
			l++;r--;
			
		}
		return true;
	}

}

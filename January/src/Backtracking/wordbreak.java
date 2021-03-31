package Backtracking;
import java.util.*;
public class wordbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("micro");
		hs.add("soft");
		hs.add("hi");
		hs.add("hiring");
		hs.add("ring");
		hs.add("microsoft");
		String s="microsofthiring";
		wordbreak(s,"",hs);

	}
 
	private static void wordbreak(String s,String ans, HashSet<String> hs) {
		// TODO Auto-generated method stub
		if(s.length()==0)
		{
			System.out.println(ans);
		}
		for(int i=0;i<s.length();i++)
		{
			String left=s.substring(0,i+1);
			if(hs.contains(left))
			{
				String right=s.substring(i+1);
				wordbreak(right,ans+left+" ",hs);
			}
		}
	}

}

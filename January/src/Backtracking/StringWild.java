package Backtracking;
import java.util.*;
public class StringWild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1?1";
		Stack<Character> st=new Stack<>();
//		binarystring(s,0,"",st);
		//StringBuilder sb=new StringBuilder();
		binarystring(s,0,"",st);

	}

	private static void binarystring(String s, int vidx,String ans,Stack<Character> st) {
		// TODO Auto-generated method stub
		
		if(s.length()==vidx)
		{
			System.out.println(st+" "+ans);
			return;
		}

		char c=s.charAt(vidx);
		if(c !='?')
		{
		
			st.push(c);
			binarystring(s,vidx+1,ans+c,st);
			st.pop();
		}
		else
		{
		
			st.push('0');
			binarystring(s,vidx+1,ans+'0',st);
			st.pop();
			st.push('1');
			binarystring(s,vidx+1,ans+'1',st);
			st.pop();
		}
	}
	
	public static void binaryStrings(String ques, StringBuilder ans, int vidx) {
		if (vidx == ques.length()) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(vidx);
		if (ch != '?') {
			ans.append(ch);
			binaryStrings(ques, ans, vidx + 1);
			ans.deleteCharAt(ans.length() - 1);
		} else {
			ans.append("0");
			binaryStrings(ques, ans, vidx + 1);
			ans.deleteCharAt(ans.length() - 1);
			ans.append("1");
			binaryStrings(ques, ans, vidx + 1);
			ans.deleteCharAt(ans.length() - 1);
		}
	}

}

package Stack;
import java.util.*;
public class commandprompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a/b/../c";
		resolvedirectory(s);

	}

	private static void resolvedirectory(String s) {
		// TODO Auto-generated method stub
		String[] res=s.split("/");
		Stack<String> st=new Stack<>();
		for(int i=0;i<res.length;i++)
		{
			if(res[i].equals(".."))
			{
				st.pop();
			}
			else if(res[i].equals(""))
			{
				continue;
			}
			else
			{
				st.push(res[i]);
			}
		}
		StringBuffer sb=new StringBuffer();
		while(!st.isEmpty())
		{
			sb.append(st.pop()).append("/");
		}
		
		System.out.println(sb.reverse().toString());
		
	}

}

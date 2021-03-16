package TASession;
import java.util.*;
public class LongestPalindromesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(fun(s));
	}
	static int fun(String s)
	{
//		if(s.length()%2==0)
//		{
//			
//		
//			int max=1;
//			for(int i=0;i<s.length();i++)
//			{
//				int l=i-1;
//				int r=i+1;
//				while(l>=0 && r<s.length())
//				{
//					if(s.charAt(l)!=s.charAt(r))
//					{
//						break;
//					}
//					max=Math.max(max, r-l+1);
//					
//					l--;
//					r++;
//				}
//			}
//			return max;
//		}
//		else
//		{
			int mm=1;
			for(int i=0;i<s.length();i++)
			{
				int l=i-1;
				int r=i;
				while(l>=0 && r<s.length())
				{
					if(s.charAt(l)!=s.charAt(r))
					{
						break;
					}
					mm=Math.max(mm, r-l+1);
					
					l--;
					r++;
				}
			}
			return mm;
		}
//	}

}

package Dynamic_programming;
import java.util.*;
public class Longestcommonsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String a = "AbcdB";
		    String b = "aaAbcdefs";
		    int maxLcs = lcs(a.toCharArray(), b.toCharArray(), a.length(), b.length(), 0);
		    System.out.println(maxLcs);
		}
	public static int LCSubStrM1(char[] X, char[] Y, int m, int n, int lcsCount) {
		if (m <= 0 || n <= 0)
			return lcsCount;
		
		int lcsCount1=lcsCount;
		if (X[m - 1] == Y[n - 1])
			lcsCount1 = LCSubStrM1(X, Y, m - 1, n - 1, lcsCount + 1);

		int lcsCount2 = LCSubStrM1(X, Y, m, n - 1, 0);
		int lcsCount3 = LCSubStrM1(X, Y, m - 1, n, 0);

		return Math.max(lcsCount1, Math.max(lcsCount2, lcsCount3));
	}
		private static int lcs(char[] a, char[] b, int i, int j, int count) {
		    if (i == 0 || j == 0)
		        return count;
		    if (a[i - 1] == b[j - 1]) {
		        count = lcs(a, b, i - 1, j - 1, count + 1);
		    }
		    count = Math.max(count, Math.max(lcs(a, b, i, j - 1, 0), lcs(a, b, i - 1, j, 0)));
		    return count;
		}
//		String s1="abcq";
//		String s2="abdq";
//		int r=perform(s1,s2,0);
//		System.out.println(r);
//
//	}
//
//	private static int perform(String s1, String s2, int count) {
//		// TODO Auto-generated method stub
//		if(s1.length()<=0 ||s2.length()<=0)
//		{
//			return count;
//		}
//		int res1=count;
//		if(s1.charAt(0)==s2.charAt(0))
//		{
//			int res=perform(s1.substring(1),s2.substring(1),count+1);
//		}
//		
//			int a1=perform(s1.substring(0),s2.substring(1),count+1);
//			int a2=perform(s1.substring(1),s2.substring(0),count+1);
//			int total=Math.max(a1, a2);
//			return Math.max(res1, total);
//		
//		
//	}

}

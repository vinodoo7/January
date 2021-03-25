package Dynamic_programming;
import java.util.*;
public class longestcommonsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABC";
		String s2="AB";
		LCS(s1,s2);
	}

	private static void LCS(String s1, String s2) {
		// TODO Auto-generated method stub
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				if(i==0)
				{
					dp[i][j]=0;
				}
				else if(j==0)
				{
					dp[i][j]=0;
				}
				else
				{
					if(s1.charAt(i-1)==s2.charAt(j-1))
					{
						dp[i][j]=dp[i-1][j-1]+1;
					}
					else
					{
						dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
					}
				}
			}
		}
		System.out.println(dp[s1.length()][s2.length()]);
	}

}

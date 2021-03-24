package Dynamic_programming;
import java.util.*;
public class knap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight[]= {1,2,3,5};
		int values[]= {15,10,20,100};
		int target=8;
		int dp[][]=new int[weight.length+1][target+1];
		int r=unboundedknapsack(weight,values,target,weight.length,dp);
	//	int r=knapsack2(weight,values,target);
		System.out.println(r);

	}
	private static int unboundedknapsack(int[] weight, int[] values, int target, int n,int dp[][]) {
		// TODO Auto-generated method stub
		if(n==0 || target==0)
		{
			return 0;
		}
		if(dp[n][target]!=0)
		{
			return dp[n][target];
		}
		if(weight[n-1]>target)
		{
			int excluding=unboundedknapsack(weight,values,target,n-1,dp);
			return excluding;
		}
		
		int including=unboundedknapsack(weight,values,target-weight[n-1],n,dp)+values[n-1];
		int excluding=unboundedknapsack(weight,values,target,n-1,dp);
		
		return dp[n][target]=Math.max(including, excluding);
		
		
	}

	private static int knapsack2(int[] weight, int[] values, int target) {
		// TODO Auto-generated method stub
		int dp[][]=new int[weight.length+1][target+1];
		for(int i=0;i<=weight.length;i++)
		{
			for(int j=0;j<=target;j++)
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
					if(j>=weight[i-1])
					{
						dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+values[i-1]);
					}
					else
					{
						dp[i][j]=dp[i-1][j];
					}
				}
			}
		}
		return dp[weight.length][target];
		
	}

	private static int knapsack(int[] weight, int[] values, int target, int n,int dp[][]) {
		// TODO Auto-generated method stub
		if(n==0 || target==0)
		{
			return 0;
		}
		if(dp[n][target]!=0)
		{
			return dp[n][target];
		}
		if(weight[n-1]>target)
		{
			int excluding=knapsack(weight,values,target,n-1,dp);
			return excluding;
		}
		
		int including=knapsack(weight,values,target-weight[n-1],n-1,dp)+values[n-1];
		int excluding=knapsack(weight,values,target,n-1,dp);
		
		return dp[n][target]=Math.max(including, excluding);
		
		
	}

}

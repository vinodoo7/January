package Dynamic_programming;

public class minjumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,0,2,3,1,0,1,2,0,1};
		System.out.println(minjumps(arr));
	}

	private static int minjumps(int[] arr) {
		// TODO Auto-generated method stub
		int dp[]=new int[arr.length];
		dp[0]=0;
		for(int i=1;i<arr.length;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
			{
				if(arr[j]>=i-j)
				{
					min=Math.min(min,dp[j]+1);
				}
			}
			dp[i]=min;
		}
		return dp[arr.length-1];
		
	}

	
}

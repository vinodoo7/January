package Homework_Arrays;

public class Max_sum_increasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,7,4,2,5};
		int target=5;
		longest_subsequence(a,0,target,0,"");
		System.out.println(maxsum);
		
	}
static int count=0;
	private static void longest_subsequence(int[] a, int vidx,int target,int ans,String s) {
		// TODO Auto-generated method stub
		if(vidx==a.length && s.length()!=0)
		{
    	 	  // System.out.println("xxxxxxxx");
    	 	  //s=s.trim();
//			     int f=s.length();
//					count=Math.max(f, count);
    	 	   //System.out.println(s);
    	 	   //System.out.println("yyyyyyyy");
    	 	   //s=s.trim();
			maxsumarrray(s);
			return;
		}
		if(vidx>a.length)
		{
			return;
		}
		if(vidx<a.length)
		{
			
			longest_subsequence(a,vidx+1,target,ans+a[vidx],s+a[vidx]+" ");
			longest_subsequence(a,vidx+1,target,ans,s);
		}
		
		
	}
	static int maxsum=Integer.MIN_VALUE;
	public static void maxsumarrray(String s)
	{
		s=s.trim();
		String str[]=s.split(" ");
		int arr[]=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
		   arr[i] = Integer.parseInt(str[i]);
		   //System.out.println(arr[i]);
		}
		int cur=arr[0];
		int sum=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(cur<arr[j])
			{
				sum+=arr[j];
				cur=arr[j];
			}
		}
		maxsum=Math.max(maxsum, sum);
		
	}

}

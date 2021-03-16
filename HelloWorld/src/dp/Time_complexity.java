package dp;

public class Time_complexity {

	public static int kadanes_algorithm(int a[])
	{
		int curSum=0;
		int max_Sum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
				curSum+=a[i];
				if(curSum>max_Sum)
				{
					max_Sum=curSum;
				}
				if(curSum<0)
				{
					curSum=0;
				}
				//max_Sum=Math.max(max_Sum,curSum);
			
		}
		return max_Sum;
	}
	public static void main(String[] args) {
		
		int a[]=new int[] {-1,-2,-3};
		System.out.println(kadanes_algorithm(a));
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println(max);	
	}
}

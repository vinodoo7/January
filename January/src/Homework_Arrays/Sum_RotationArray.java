package Homework_Arrays;

public class Sum_RotationArray {
	public static void main(String[] args)
	{
		int arr[] = {8,3,1,2};
//		sumrotationmax(arr);
//		System.out.println(max);
		Reducetimecomplexity(arr);
	}
	
	private static void Reducetimecomplexity(int[] arr) {
		// TODO Auto-generated method stub
		int csum=0;
		int ssum=0;
		for(int i=0;i<arr.length;i++)
		{
			csum+=arr[i];
			ssum+=(arr[i]*i);
		}
		System.out.println(csum);
		System.out.println(ssum);
		for(int i=1;i<arr.length;i++)
		{
			int totalres = ssum-csum +arr[i-1]*arr.length;
			ssum=totalres;
			System.out.println(totalres);
		}
		
	}

	static int max=0;
	
	private static void sumrotationmax(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length-1;
		
		for(int i=0;i<=n;i++)
		{
			rotation(arr,i);
		}
	}

	private static void rotation(int[] arr,int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int res[]=new int[arr.length];
		if(n>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				int pos=(i+(arr.length-n))%arr.length;
				
				res[pos]=arr[i];
			}
			for(int i=0;i<arr.length;i++)
			{
				sum+=(res[i]*i);
			}
			
		}
		if(sum>max)
		{
			max=sum;
		}
		
	}

}

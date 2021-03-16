package Homework_Arrays;
import java.util.*;
public class Arrays_1to5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			int size=sc.nextInt();
//			int repeat=sc.nextInt();
//			int a[]=new int[size];
//			for(int j=0;j<size;j++)
//			{
//				
//				a[j]=sc.nextInt();
//			}
//			int res[] =repeat(a,size,repeat);
//			System.out.println(maxsubarraysum(res,0));
//		}
		
		
		
	}
	
	public static int maxsubarraysum(int res[],int vidx)
	{
		int maxsum=Integer.MIN_VALUE;
		int cursum=0;
		for(int i=0;i<res.length;i++)
		{
			cursum+=res[i];
			if(cursum>maxsum)
			{
				maxsum=cursum;
			}
			if(cursum<0)
			{
				cursum=0;
			}
		}
		return maxsum;
	}
	public static int[] repeat(int a[],int size,int repeat)
	{
		int res[]=new int[size*repeat];
		for(int i=0;i<size;i++)
		{
			int temp=i;
			while(temp<res.length)
			{
				//System.out.println(temp);
				res[temp]=a[i];
				temp+=size;
			}
		}
		
		return res;
	}
	
	
	

}

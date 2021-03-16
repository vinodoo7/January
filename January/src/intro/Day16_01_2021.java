package intro;

public class Day16_01_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int a[]=new int[]{10,5,4,3,1,6,7};
		int b[]=new int[]{1,3,4,5,6,7,10};
		int target=11;
		int c[]=new int[]{7,1,3,6,4};
		buyandsell(c);
		//targetPairSum(a,target);
		//sortedSumPAir(b,target);
		
		//pattern5(n);
		
	}
	public static void buyandsell(int[] c)
	{
		int curmin=c[0];
		int maxprofit=0;
		for(int i=1;i<c.length;i++)
		{
			if(curmin<c[i])
			{
				int profit=c[i]-curmin;
				maxprofit=Math.max(maxprofit, profit);
			}
			curmin=Math.min(curmin,c[i]);
			
			
		}
		System.out.println(maxprofit);
	}
	public static void targetPairSum(int a[],int target)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	
	public static void pattern(int n)
	{
		int row=1;
		int cst=1;
		int nst=1;
		while(row<=n)
		{
			cst=1;
			while(cst<=nst)
			{
				System.out.print(cst);
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}
	
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void pattern3(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				System.out.print("*");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int n)
	{
		int row=1;
		int nst=1;
		//int cst=1;
		int nsp=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nsp)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nsp++;
			row++;
		}
	}
	
	

}

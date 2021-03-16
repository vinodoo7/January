package Homework_Arrays;
//Question : https://www.faceprep.in/c/find-the-equilibrium-index-of-an-array/
public class Equilibrium_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-7, 1, 5, 2, -4, 3, 0};
		equilibrium(a);//O(n^2) spaceO(1)
		equilibriumoptimized(a);//O(n) spaceO(n)
		
	}
	public static void equilibrium(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int left=0;
			for(int j=0;j<i;j++)
			{
				left+=a[j];
			}
			int right=0;
			for(int k=i+1;k<a.length;k++)
			{
				right+=a[k];
			}
			if(left==right)
			{
				System.out.println(i);
			}
		}

	}
	//Approach Cumulative frequency method
	public static void equilibriumoptimized(int a[])
	{
		int res[]=new int[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			res[i]=sum;
		}
		
		for(int i=1;i<a.length;i++)
		{
			int left=res[i]-a[i];
			int right=res[a.length-1]-res[i];
			if(left==right)
			{
				System.out.println(i);
			}
		}
	}

}

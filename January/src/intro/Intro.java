package intro;
import java.util.*;
public class Intro {
	
	public static int fun(int val)
	{
		int cou=0;
		while(val>0)
		{
			int rem=val%10;
			cou=cou*10+rem;
			val=val/10;
		}
		return cou;
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println(fun(12340));
		/*int nn=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=Math.sqrt(nn);i++)
		{
			if(nn%2==0)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.print("prime");
		}
		*/
		/*int max=Integer.MIN_VALUE;
		for(int i=0;i<nn;i++)
		{
			int v=sc.nextInt();
			if(v>max)
			{
				max=v;
			}
		}
		System.out.println(max);*/
		/*int a=5;
		int b=12;
		int c=6;
		if(a>b && b>c)
		{
			System.out.print(a);
		}
		else if(a>b && c>a)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(b);
		}
		
		int cel=42;
		double res=((9*cel*1.0)/5)+32;
		System.out.println(res);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			count+=i;
			
		}
		System.out.println(count);
		*/
	}
}

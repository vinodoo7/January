package Dynamic_programming;
import java.util.*;
public class eggdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=2;
		int f=10;
		int strg[][]=new int[100][100];
		System.out.println(eggdrop(e,f,strg));
	}
	public static int eggdrop(int e,int f,int strg[][])
	{
		if(f==1)
		{
			return 1;
		}
		if(f==0)
		{
			return 0;
		}
		if(e==0)
		{
			return f;
		}
		if(strg[e][f]!=0)
		{
			return strg[e][f];
		}
		int min=Integer.MAX_VALUE;
		for(int i=1;i<=f;i++)
		{
			min=Math.min(Math.max(eggdrop(e-1,i-1,strg), eggdrop(e-1,f-i,strg)),min);
		}
		return strg[e][f]=min+1;
	}
}

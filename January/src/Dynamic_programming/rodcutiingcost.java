package Dynamic_programming;
import java.util.*;
public class rodcutiingcost {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]= {0,3,5,6,15,10,25,12,24};
		int length[]= {0,1,2,3,4,5,6,7,8};
		rodcutting(price,length);
	}

	private static void rodcutting(int[] price, int[] length) {
		// TODO Auto-generated method stub
		int strg[]=new int[price.length];
		strg[0]=0;
		strg[1]=price[1];
		
		for(int i=2;i<price.length;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=1,c=i-1;j<=c;j++,c--)
			{
				max=Math.max(strg[j]+strg[c],max);
			}
			max=Math.max(max, price[i]);
			strg[i]=max;
		}
		System.out.println(strg[price.length-1]);
	}
	
}

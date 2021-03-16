package Homework_Arrays;
import java.util.*;
public class Buy_and_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = { 100, 180, 260, 310,
                40, 535, 695 };
		int maxprofit=0;
		int minvalue=prices[0];
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]>minvalue)
			{
				int cur=prices[i]-minvalue;
				maxprofit=Math.max(maxprofit, cur);
				
			}
			
			minvalue=Math.min(minvalue,prices[i]);
			
		}
		System.out.println(maxprofit);
	}

}

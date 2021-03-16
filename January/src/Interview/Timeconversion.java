package Interview;
import java.util.*;
public class Timeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="23:45:30";
		String q="23:45:30";
//		Finddifference(r,q);
		FindAnotherApproach(r,q);

	}

	private static void FindAnotherApproach(String r, String q) {
		// TODO Auto-generated method stub
		String arr[]=r.split(":");
		String que[]=q.split(":");
		
		int hour=Math.abs(Integer.parseInt(arr[0])-Integer.parseInt(que[0]));
		int min=Math.abs(Integer.parseInt(arr[1])-Integer.parseInt(que[1]));
		int sec=Math.abs(Integer.parseInt(arr[2])-Integer.parseInt(que[2]));
		System.out.println(hour+" hour "+ min+ " m "+ sec+" s");
		if(hour!=0)
		{
			System.out.println(hour+" hours a go");
		}
		else if(min!=0)
		{
			System.out.println(min+" Minute A go");
		}
		else if(sec!=0)
		{
			System.out.println(sec+" sec A go");
		}
		else
		{
			System.out.println("Present time");
		}
		
	}

	private static void Finddifference(String r, String q) {
		// TODO Auto-generated method stub
		String arr[]=r.split(":");
		String res="";
		for(String d:arr)
		{
			res+=d;
		}
		int sum=Integer.parseInt(res);
		System.out.println(sum);
		
		String que[]=q.split(":");
		String res1="";
		for(String d:que)
		{
			res1+=d;
		}
		int set=Integer.parseInt(res1);
		String total=(sum-set)+"";
		System.out.println(total);
		int count=0;
		for(int i=0;i<total.length();i++)
		{
			char c=total.charAt(i);
			if(c=='0')
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count==0)
		{
			System.out.println(total.substring(0,2));
		}
		else if(count==1)
		{
			System.out.println(total.substring(1,2));
		}
		
		
	}

}

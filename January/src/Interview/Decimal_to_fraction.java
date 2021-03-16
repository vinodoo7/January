package Interview;
import java.util.*;
public class Decimal_to_fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2.284";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='.')
			{
				res=s.substring(i+1);
				
			}
		}
		//System.out.println(res);
		int l=res.length();
		int den=(int)Math.pow(10, l);
		boolean flag=false;
		int sum=0;
		int num=Integer.parseInt(res);
		perform(num,den,sum);
		
	}
static int count=0;
	private static void perform(int num, int den,int sum) {
		// TODO Auto-generated method stub
		System.out.println(num);
		System.out.println(den);
		int sum1=0;
		int n=0;
		int d=0;
			for(int i=2;i<=9;i++)
			{
				
				if(num%i==00 && den%i==0)
				{
					
					
					System.out.println("XXXXX"+i);
					n=num/i;
					d=den/i;
					//break;
//					
//					System.out.println("XXXXX");

//					System.out.println("YYYY");
//					
					//284/1000   142/500  71/250
				}
			}
			if(sum==0)
			{
				System.out.println(n+" "+d);
			}
			else
			{
				sum1=0;
				perform(n,d,sum1);
				
			}
		
		
		
	}

}

package Interview;
import java.util.*;
public class Probability {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		String q="";
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		q+=arr[i];
		}
		int target=sc.nextInt();
		int x=throughArray(arr,target,1,0);
		int total=(int)Math.pow(2, arr.length)-1;
		System.out.println(x);
		double res=((double)(x-1)/total);
		System.out.println(res);
//		printSS(q,"",target);
		
		
//		double res=((double)count/total);
//		System.out.printf("%.7f", res);
//		

	}

	private static int throughArray(int[] arr, int target, int curpro,int vidx) {
		// TODO Auto-generated method stub
		if(vidx==arr.length && curpro>10)
		{
		  return 0;
		}
		else if(curpro<10 && vidx==arr.length)
		{
			return 1;
		}
		int ccc=0;
		if(curpro<10)
		{
			ccc+=throughArray(arr,target,curpro*arr[vidx],vidx+1);
		}
		if(curpro<10)
		{
			ccc+=throughArray(arr,target,curpro,vidx+1);
		}
		return ccc;
	}

	public static void printSS(String ques, String ans,int target) {

		if (ques.length() == 0) {
			countLess(ans,target);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSS(roq, ans + ch,target);
		printSS(roq, ans,target);
	}

	private static void countLess(String ans,int target) {
		// TODO Auto-generated method stub
		int sum=1;
		
		for(int i=0;i<ans.length();i++)
		{
			int c=Integer.parseInt(ans.charAt(i)+"");
			sum*=c;
			
		}
		if(ans.length()>0 &&sum<10)
		{
			count++;
		}
		
		
	}

}

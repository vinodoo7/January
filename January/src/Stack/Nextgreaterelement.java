package Stack;
import java.util.*;

public class Nextgreaterelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {4,5,2,1,8,12,13,1,66};
		//solve(arr);
		solve2(arr);

	}

	private static void solve2(int[] arr) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<>();
		st.push(0);
		int res[]=new int[arr.length];

		for(int i=1;i<arr.length;i++)
		{
			while(st.size()>0 && arr[i]>arr[st.peek()])
			{
				int pos=st.peek();
				res[pos]=arr[i];
				st.pop();
			}
			st.push(i);
			
		}
		while(st.size()!=0)
		{int pos=st.peek();
		res[pos]=-1;
		st.pop();
			
		}
		for(int g: res)
		{
			System.out.print(g+ " " );
		}
	}

	private static void solve(int[] arr) {
		// TODO Auto-generated method stub
		int res[]=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		st.push(arr[arr.length-1]);
		res[arr.length-1]=-1;
		for(int i=arr.length-2;i>=0;i--)
		{
			//int f=arr[i];
			while(st.size()>0 && arr[i]>st.peek())
			{
				st.pop();
			}
			if(st.size()==0)
			{
				res[i]=-1;
			}
			else
			{
				res[i]=st.peek();
			}
			st.push(arr[i]);
		}
		for(int g: res)
		{
			System.out.print(g+ " " );
		}
	}

}

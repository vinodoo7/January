package Stack;
import java.util.*;
public class Stackspamproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,80,60,70,60,75,85};
		
		for(int val:stackspamrevison(arr))
		{
			System.out.print(val+" ");
		}

	}
	
//
//	private static int[] stackspam(int[] arr) {
//		// TODO Auto-generated method stub
//		Stack<Integer> st=new Stack<>();
//		int[] span=new int[arr.length];
//		st.push(0);
//		span[0]=1;
//		for(int i=0;i<arr.length;i++)
//		{
//			while(st.size()>0 && arr[i]>arr[st.peek()])
//			{
//				st.pop();
//			}
//			if(st.size()==0)
//			{
//				span[i]=i+1;
//			}
//			else
//			{
//				span[i]=i-st.peek();
//			}
//			st.push(i);
//		}
//		return span;
//		
//	}

	private static int[] stackspamrevison(int[] arr) {
		// TODO Auto-generated method stub
		
		return null;
	}

}

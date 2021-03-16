package Stack;
import java.util.*;
public class incresingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,13,4,6,16,8};
		order(arr);

	}

	private static void order(int[] list) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		for(int a: list)
		{
			while(!st.isEmpty() && st.peek()<a)
			{
				int temp=st.pop();
				System.out.println(temp+" "+a);
				
			}
			st.push(a);
		}
		while(!st.isEmpty())
		{
			System.out.println(st.pop()+"--->"+ "-1");
		}
		
	}

}

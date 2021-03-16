package Stack;
import java.util.*;
public class StackgetMax {
	public static void push(int[] value)
	{
		Stack<Integer> st=new Stack<>();
		int max=0;
		for(int d:value)
		{
			if(d>max)
			{
				max=d;
				st.push(max);
			}
			else
			{
				st.push(st.peek());
			}
		}
		for(int f:st)
		{
			System.out.print(f+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,4,2,6,6,10};
		//ArrayList<Integer> ls=new ArrayList<>();
		push(arr);
	}

}

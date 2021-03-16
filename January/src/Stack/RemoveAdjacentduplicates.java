package Stack;
import java.util.*;
public class RemoveAdjacentduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,2,1,3,4,4,6};
		Removeadjacent(arr);

	}

	private static void Removeadjacent(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!st.isEmpty() && st.peek()==arr[i])
			{
				st.pop();
			}
			else
			{
				st.push(arr[i]);
			}
			
		}
		ArrayList<Integer> ls=new ArrayList<>();
		while(!st.isEmpty())
		{
			ls.add(st.pop());
		}
		Collections.reverse(ls);
		System.out.println(ls);
		
	}

}

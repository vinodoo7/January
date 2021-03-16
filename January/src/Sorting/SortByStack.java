package Sorting;
import java.util.*;
public class SortByStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,1,4,9,28,15};
		Stack<Integer> st1=new Stack<>();
		Stack<Integer> st2=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			st1.push(arr[i]);
		}
		sortbystack(st1);
		for(int g:st1)
		{
			System.out.print(g+" " );
		}
	}

	private static void sortbystack(Stack<Integer> st1) {
		// TODO Auto-generated method stub
		
		sortutil(st1);
	}

	private static void sortutil(Stack<Integer> st1) {
		// TODO Auto-generated method stub
			if(st1.empty())
			{
				return;
			}
			int temp=st1.pop();
			sortutil(st1);
			sortInsert(st1,temp);
	}

	private static void sortInsert(Stack<Integer> st1, int element) {
		// TODO Auto-generated method stub
		if(st1.isEmpty() ||element> st1.peek())
		{
			st1.push(element);
			return;
		}
		int temp=st1.pop();
		sortInsert(st1,element);
		st1.push(temp);
	}

}

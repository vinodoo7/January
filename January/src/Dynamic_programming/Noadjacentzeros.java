package Dynamic_programming;
import java.util.*;
public class Noadjacentzeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		adjacent(n);

	}

	private static void adjacent(int n) {
		// TODO Auto-generated method stub
		int endwitho=1;
		int endwith1=1;
		for(int i=1;i<n;i++)
		{
			int temp=endwitho+endwith1;
			endwitho=endwith1;
			endwith1=temp;
			
		}
		System.out.println(endwitho+endwith1);
		
	}

}

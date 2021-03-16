package Recurssion;
import java.util.*;
public class Oddevencount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,3,4,5,-1,6,7};
		Odd_even(arr,0,0,0,0);
		// TODO Auto-generated method stub
	}

	private static void Odd_even(int[] arr, int vidx,int odd,int even,int neg) {
		// TODO Auto-generated method stub
		if(arr.length==vidx)
		{
			System.out.println(" odd "+odd+" even "+even+" neg "+neg);
			return;
		}
		if(arr.length<vidx)
		{
			return;
		}
		if(arr[vidx]<0)
		{
			Odd_even(arr,vidx+1,odd,even,neg+1);
		}
		else if((arr[vidx]%2)==0)
		{
			Odd_even(arr,vidx+1,odd,even+1,neg);
		}
		else 
		{
			Odd_even(arr,vidx+1,odd+1,even,neg);
		}
		
	}

}

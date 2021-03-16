package intro;
import java.util.*;
public class HomeworkDay1 {

	public static double calculator(int num,int a,int b)
	{
		switch(num)
		{
		case 1:
			return a+b;
		case 2:
			return a-b;
		case 3:
			return a*b;
		case 4:
			return a/b;
		}
		return 0.0;

	}
	public static boolean square(int len,int bre)
	{
		if(len==bre)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println(calculator(num,a,b));
		//Take values of length and breadth of a rectangle from user and check if it is square or not.
		int len=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println(square(len,breadth));
		
		

	}

}

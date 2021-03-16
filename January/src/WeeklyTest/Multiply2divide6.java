package WeeklyTest;
import java.util.*;
public class Multiply2divide6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=3;
			getNumber1(n,"");

	}
	public static void getNumber1(int num,String ans)
	{
		if(num*6>num)
		{
			return;
		}
		if(num==1)
		{
			System.out.println(ans+" vvv");
			return;
		}
		getNumber1(num*2,ans+""+num);
		getNumber1(num/6,ans+""+num);
		return;
	}

}

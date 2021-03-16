package intro;
import java.util.*;
public class Day17_01_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[] {5,2,1,6,-1,31};
		int l=sc.nextInt();
		int r=sc.nextInt();
		int res[]=new int[a.length];
		for(int i=1;i<a.length;i++)
		{
			res[i]=res[i-1]+a[i];
		}
		if(l==0)
		{
			System.out.println(res[r]);
	
		}
		else if(l==r)
		{
			System.out.println(a[r]);

		}
		else
		{
			System.out.println(res[3]-res[1]);
		}
	}

}

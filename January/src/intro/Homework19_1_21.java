package intro;
import java.util.*;
public class Homework19_1_21 {
public static void h1()
{
	int a[]=new int[]{5};
	int sum=0;
	int x=0;
	for(int i=0;i<=a[a.length-1];i++)
	{
		if(i%2==0)
		{
			sum++;
			if(a[x]==i)
			{
				System.out.println(sum);
				x++;
			}
		}
		else
		{
			sum*=2;
			if(a[x]==i)
			{
				System.out.println(sum);
				x++;
			}
		}
	}

}
public static void rotation()
{
	int rotations =1;
	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(4);
	ls.add(6);
	ls.add(1);
	for(int i=0;i<rotations;i++)
	{
		int s=ls.remove(ls.size()-1);
		ls.add(0, s);
	}
	
	
	System.out.println(ls);
}
public static ArrayList<Integer> merge(ArrayList<Integer> l1,ArrayList<Integer> l2)
{
	ArrayList<Integer> n=new ArrayList<>();
	n.addAll(l1);
	n.addAll(l2);
	return n;
}

	public static void main(String[] args) {
		int a[]=new int[] {0,1,0,1,0,0,1};
		
		// TODO Auto-generated method stub
	/*	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            p_inverse[px] = x;
           // int a[0,3,2,4,5,1];
        }
        scan.close();
        
        
        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            System.out.println(y);
        }
		*/
		
	}

}

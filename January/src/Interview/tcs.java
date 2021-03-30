package Interview;
import java.util.*;
import java.util.Map.Entry;
public class tcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Theater[] t=new Theater[4];
		for(int i=0;i<4;i++)
		{
			t[i]=new Theater(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextBoolean());
		}
		String res=findtheatercatagory(1,t);
		System.out.println(res);
		Theater f[]=serchtheatercapacity(t,100);
		if(f[0].seatcapacity>100)
		{
			System.out.println(f[0].seatcapacity);
		}
		else
		{
			System.out.println("ALl the below price");
		}
		

	}
	private static Theater[] serchtheatercapacity(Theater[] t, int cap) {
		// TODO Auto-generated method stub
		Arrays.sort(t,new Comparator<>()
		{
	public int compare(Theater o1,Theater o2)
	{
		return o2.seatcapacity-o1.seatcapacity;
			
	}
		});
		return t;
		
	}
	private static String findtheatercatagory(int tid,Theater[] t) {
		// TODO Auto-generated method stub
		for(int i=0;i<t.length;i++)
		{
			if(t[i].theaterid==tid)
			{
				if(t[i].balcony==true && t[i].trating>4)
				{
					return "Ultra premium";
				}
				else if(t[i].balcony==true && t[i].trating>=3 && t[i].trating<=4)
				{
					return "premium";
				}
				else {return "Normal";} 
				
			}
			
		}
		return "Not Found";
		
	}
	

}
class Theater
{
	int theaterid;
	String theatername;
	int seatcapacity;
	double ticketrate;
	double trating;
	boolean balcony;
	Theater(int theaterid,String theatername,int seatcapacity,double ticketrate,double trating,boolean balcony)
	{
		this.theaterid=theaterid;
		this.theatername=theatername;
		this.seatcapacity=seatcapacity;
		this.ticketrate=ticketrate;
		this.trating=trating;
		this.balcony=balcony;
	}
	
}
package TASession;
import java.util.*;
public class prices {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Medicine[] med=new Medicine[4];
	    for(int i=0;i<med.length;i++)
	    {
	    	String mname=sc.nextLine();
	    	
	    	String batch=sc.nextLine();
	    
	    	String disease=sc.nextLine();
	    	
	    	int price=sc.nextInt();
	    	sc.nextLine();
	        med[i]=new Medicine(mname,batch,disease,price);
	      
	    }
	    String search=sc.nextLine();
	    Integer[] pppprice=perform(search,med);
}

private static Integer[] perform(String search, Medicine[] med) {
		Integer[] total=new Integer[med.length];
		int temp=0;
		for(int i=0;i<med.length;i++)
		{
			Medicine m=med[i];
			String r=m.disease;
			if(r.equals(search))
			{
			    Integer intObj = new Integer(m.price);

			total[temp]=intObj;
			temp++;
				System.out.println(m.price);
			}
		}
			
		return total;
	}
}

class Medicine
{
    String medicinename;
    String batchno;
    String disease;
    int price;
    Medicine(String medicinename,String batchno,String disease,int price)
    {
        this.medicinename=medicinename;
        this.batchno=batchno;
        this.disease=disease;
        this.price=price;
    }
}

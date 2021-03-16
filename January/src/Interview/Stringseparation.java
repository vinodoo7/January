package Interview;
import java.util.*;
public class Stringseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World \"This\" is vinod what are \"you doing\" ";
		String arr[]=s.split("\\s");
//		for(String d:arr)
//		{
//			System.out.println(d);
//		}
		ArrayList<String> ls=new ArrayList<>();
		int i=0;
		while(i<arr.length)
		{
			char first=arr[i].charAt(0);
			if(first=='\"')
			{
				char last=arr[i].charAt(arr[i].length()-1);
				if(last=='\"')
				{
					System.out.println(arr[i]);
				}
				else
				{
					String temp=arr[i]+" ";
					while(i<arr.length && last!='\"')
					{
						i++;
						last=arr[i].charAt(arr[i].length()-1);
						temp+=arr[i]+" ";
						
					}
					System.out.println(temp.trim());
				}
				
			}
			else
			{
				System.out.println(arr[i]);
			
			}
			i++;
		}
		//System.out.println(ls);
			
	}

}

package Sorting;
import java.util.*;
public class SortingWithcomparatorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 6;
		    Activity arr[] = new Activity[n];
		    arr[0] = new Activity(5, 9);
		    arr[1] = new Activity(1, 2);
		    arr[2] = new Activity(3, 4);
		    arr[3] = new Activity(0, 6);
		    arr[4] = new Activity(5, 7);
		    arr[5] = new Activity(8, 9);
		   // Arrays.sort(arr);
		    endcomp ec=new endcomp();
		    Arrays.sort(arr,ec);
		for(Activity g:arr)
		{
			//System.out.println(g.start+" "+g.end);
		}
		//1 3 0 5 5 8
		//2 4 6 7 9 9
		int maxmeeting=1;
		 
		//int j=0;
		int limit=arr[0].end;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].start>limit)
			{
				maxmeeting++;
				limit=arr[i].end;
			}
		}
		System.out.println(maxmeeting);
	}
	
}
///this is comparable only implements Comparable and CompareTo 

class Activity implements Comparable<Activity>
{
	int start;
	int end;
	Activity(int start,int end)
	{
		this.start=start;
		this.end=end;
		
	}
	 
	 public int compareTo(Activity o1)
	   {
		   return this.start-o1.start;
	   }
}

///This is Comparator only implements Comparator and compare(Two arguments need)
class endcomp implements Comparator<Activity>
{
	public int compare(Activity o1,Activity o2)
	{
		if(o1.end>o2.end)
		{
			return 1;
		}
		else if(o1.end<o2.end)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

  package HashMap;
import java.util.*;
public class getcommonelementsfromtwolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2,2,2,3,3,3,3,5,5,1};
		int arr2[]= {2,2,3,3,5,5,5,5};
		//getcommon1(arr1,arr2);
		//getcommon2(arr1,arr2);
		int arr[]= {2,12,9,16,10,5,3,20,25,11,1,8,6};
		longestsequence(arr);
	}

	private static void longestsequence(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Boolean> hm=new HashMap<>();
		for(int i:arr)
		{
			hm.put(i, false);
		}
		for(int i:arr)
		{
			if(hm.containsKey(i-1)==false)
			{
				hm.put(i, true);
			}
		}
		int count;
		int start=-1;
		int max=0;
		for(int j:arr)
		{
			if(hm.containsKey(j)==true)
			{
				count=1;
				while(hm.containsKey(j+count))
				{
					count++;
				}
				count--;
				if(count>max)
				{
					max=count;
					start=j;
				}
			}
		}
		System.out.println(start+" "+max);
		
	}

	private static void getcommon2(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		// HashMap<Integer,Integer> hm1=new HashMap<>();
		for(int i:arr1)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		for(int j:arr2)
		{
			if(hm.containsKey(j))
			{
				System.out.print(j+" ");
				hm.put(j, hm.get(j)-1);
				if(hm.get(j)<=0)
				{
					hm.remove(j);
				}
			}
		}
		
	}

	private static void getcommon1(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		// HashMap<Integer,Integer> hm1=new HashMap<>();
		for(int i:arr1)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		for(int j:arr2)
		{
			if(hm.containsKey(j))
			{
				System.out.println(j);
				hm.remove(j);
			}
			
		}
		//System.out.println(hm1);
		ArrayList<Integer> al=new ArrayList<>(hm.keySet());
		System.out.println(al);
	}

}

package Homework_Arrays;
import java.util.*;

import java.util.Map.*;
public class Twopairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr1[] = {1, 1, 2};
	      int n1 = arr1.length;
	      
	      int arr2[] = {1,2,3};
	      int n2 = arr2.length;
	      int k=4;
	      Pairsum(arr1,arr2,n1,n2,k);

	}

	private static void Pairsum(int[] arr1, int[] arr2, int n1, int n2, int k) {
		// TODO Auto-generated method stub
		HashMap<HashMap<Integer,Integer>,Integer> hm=new HashMap<HashMap<Integer,Integer>,Integer>();
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.println(arr1[i]+" "+arr2[j]);
				HashMap<Integer,Integer> subhm=new HashMap<>();
				subhm.put(arr1[i], arr2[j]);
				hm.put(subhm,arr1[i]+arr2[j]);
			}
		}
		
		//sorting Value
		List<Entry<HashMap<Integer,Integer>, Integer>> ls=new LinkedList<>(hm.entrySet());
		Collections.sort(ls,new Comparator<>()
				{
			public int compare(Entry<HashMap<Integer,Integer>, Integer> o1,Entry<HashMap<Integer,Integer>, Integer> o2)
			{
				return o1.getValue().compareTo(o2.getValue());
			}
				});
		System.out.println(ls);
		
	}

}

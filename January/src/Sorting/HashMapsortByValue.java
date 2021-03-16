package Sorting;
import java.util.*;
import java.util.Map.*;
public class HashMapsortByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Jayant", 80); 
        map.put("Abhishek", 90); 
        map.put("Anushka", 80); 
        map.put("Amit", 75); 
        map.put("Danish", 40); 
        SortbyValue(map);

	}

	private static void SortbyValue(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		List<Entry<String,Integer>> ls=new LinkedList<Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(ls,new Comparator<>()
				{
			public int compare(Entry<String,Integer> o1,Entry<String,Integer> o2)
			{
				int x= o2.getValue().compareTo(o1.getValue());
				if(x==0)
				{
					return o2.getKey().compareTo(o1.getKey());
				}
				else
				{
					return x;
				}
			}
				});
		
		
//		Collections.sort(ls, new Comparator<Entry<String, Integer> >() { 
//	            public int compare(Entry<String, Integer> o1,  
//	                               Entry<String, Integer> o2) 
//	            { 
//	                return (o1.getValue()).compareTo(o2.getValue()); 
//	            } 
//	        }); 
		//System.out.println(ls);	
		
		HashMap<String,Integer> hmres=new LinkedHashMap<>();
		for(Map.Entry<String, Integer> h:ls)
		{
			System.out.println(h.getKey()+" "+h.getValue());
		}
	}

}

package Sorting;
import java.util.*;
public class HashMapsortBy_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Jayant", 80); 
        map.put("Abhishek", 90); 
        map.put("Anushka", 80); 
        map.put("Amit", 75); 
        map.put("Danish", 40); 
        sortBYKey(map); //putAll
        sortbyKeyconstructor(map);
        sortByKeyUsingArrayList(map);
	}

	private static void sortByKeyUsingArrayList(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		ArrayList<String> lis=new ArrayList<>(map.keySet());
		Collections.sort(lis);
		for(String s:lis)
		{
			System.out.println(s+" "+map.get(s));
		}
		
		
	}

	private static void sortbyKeyconstructor(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm=new TreeMap<>(map);
		//tm.putAll(map);
		for(Map.Entry<String, Integer> gg: tm.entrySet())
		{
			//System.out.println(gg.getKey()+"               "+gg.getValue());
	}
	}

	private static void sortBYKey(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm=new TreeMap<>();
		tm.putAll(map);
		for(Map.Entry<String, Integer> gg: tm.entrySet())
		{
			//System.out.println(gg.getKey()+"               "+gg.getValue());
		}
		
	}

}

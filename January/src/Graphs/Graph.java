package Graphs;
import java.util.*;

public class Graph {
	 HashMap<String,HashMap<String,Integer>> vces = new HashMap<>();


	    public boolean containsVertex(String vname){
	        return vces.containsKey(vname);
	    }

	    public void addVertex(String vname){
	        if(containsVertex(vname)==false){
	            vces.put(vname, new HashMap<>());
	        }
	    }

	    public void addEdge(String v1name,String v2name,int wt){
	        if(containsVertex(v1name)&&containsVertex(v2name)){
	            vces.get(v1name).put(v2name,wt);
	            vces.get(v2name).put(v1name,wt);
	        }
	    }

	    public boolean containsEdge(String v1name,String v2name){
	        if(containsVertex(v1name)==false||containsVertex(v2name)==false){
	            return false;
	        }

	        return vces.get(v1name).containsKey(v2name);
	    }
	    
	    public int countVertices()
	    {
	    	return vces.size();
	    }
	    
	    public int countEdges()
	    {
	    	ArrayList<String> vname=new ArrayList<>(vces.keySet());
           int count=0;
	    	for(String vnam:vname)
            {
            	count+=vces.get(vnam).size();
            }
	    	return count/2;
	    }
	    
	    public void removeEdge(String v1name,String v2name)
	    {
	    	if(containsVertex(v1name)&&containsVertex(v2name))
	    	{
	    		vces.get(v1name).remove(v2name);
	    		vces.get(v2name).remove(v1name);
	    	}
	    }
	    
	    public void removeVertex(String vname){
	        if(containsVertex(vname)){
	            ArrayList<String> nbrs = new ArrayList<>(vces.get(vname).keySet());
	            for(String nbr:nbrs){
	                removeEdge(nbr, vname);
	            }
	            vces.remove(vname);
	        }
	    }

	    public void display(){
	        System.out.println("----------------------------------------");
	        ArrayList<String> vnames = new ArrayList<>(vces.keySet());

	        for(String vname:vnames){
	            System.out.println(vname+"-"+vces.get(vname));
	        }
	    }
	
}

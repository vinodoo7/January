package GenericTree;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		generictree gt= new generictree(arr);
        gt.mirror();
        gt.display();
        //System.out.println(gt.find(110));
	}
}
class generictree
{
    class Node
    {
        int data;
        ArrayList<Node> children=new ArrayList<>();
        
    }
    Node root;
    int size;
    
    generictree(int arr[])
    {
        Stack<Node> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else{
                Node node=new Node();
                node.data=arr[i];
                this.size++;

                if(st.size()==0)
                {
                    //st.push(node)
                    this.root=node;
                }
                else if( st.size()>0)
                {
                    st.peek().children.add(node);
                }
                st.push(node);
            }
        }
    }
    
    public void display()
    {
        display(root);
    }
    public void display(Node node)
    {
        System.out.print(node.data+"-->");
        for(Node child:node.children)
        {
            System.out.print(child.data+" , ");
        }
        System.out.println(".");
        for(Node child:node.children)
        {
            display(child);
        }
    }
    
    public int size()
    {
        return size(root);
    }
    public int size(Node node)
    {
        int s=0;
        for(Node child:node.children)
        {
            int csize=size(child);
            s+=csize;
        }
        s++;
        return s;
    }
    
    public int max()
    {
        return max(root);
    }
    public int max(Node node)
    {
        int max=0;
        for(Node child:node.children)
        {
            int curmax=max(child);
            max=Math.max(curmax,max);
        }
        
        max=Math.max(max,node.data);
        return max;
    }
    
    public int min()
    {
        return min(root);
    }
    public int min(Node node)
    {
        int min=node.data;
        for(Node child:node.children)
        {
            int curmin=min(child);
            min=Math.min(curmin,min);
        }
        return min;
    }
    
    public int height()
    {
        return height(root);
    }
    public int height(Node node)
    {
        int h=0;
        for(Node child:node.children)
        {
            int cheight=height(child);
            h=Math.max(cheight,h);
        }
        h++;
        return h;
    }
    
    public boolean find(int data)
    {
        return find(root,data);
    }
    public boolean find(Node node,int data)
    {
        if(node.data==data)
        {
            return true;
        }
        boolean b=false; 
        for(Node child:node.children)
        {
            b = b || find(child,data);
            if(b==true)
            {
                return true;
            }
            
        }
        return false;
    }
    
    public void removeleafs()
    {
        removeleafs(root);
    }
    public void removeleafs(Node node)
    {
        for(int i=node.children.size()-1;i>=0;i--)
        {
            Node child=node.children.get(i);
            if(child.children.size()==0)
            {
                node.children.remove(child);
            }
            else{
                removeleafs(child);
            }
        }
    }
    
    public ArrayList<Integer> Nodetoroot(int data)
    {
        return Nodetoroot(root,data);
    }
    public ArrayList<Integer> Nodetoroot(Node node,int data)
    {
       //ArrayList<Integer> mres=new ArrayList<>();
        if(node.data==data)
        {
            ArrayList<Integer> res=new ArrayList<>();
            res.add(node.data);
            return res;
        }
        for(Node child:node.children)
        {
            ArrayList<Integer> recur=Nodetoroot(child,data);
            if(recur.size()>0)
            {
                recur.add(node.data);
                return recur;
            }
        }
      return new ArrayList<>(); 
    }
    
    public void mirror()
    {
        mirror(root);
    }
    public void mirror(Node node)
    {
        for(Node child:node.children)
        {
            mirror(child);
            
            // int l=0;
            // int r=node.children.size()-1;
            // while(l<r)
            // {
            //     Node lchild=node.children.get(l);
            //     Node rchild=node.children.get(r);
            //     int temp=lchild.data;
            //     lchild.data=rchild.data;
            //     rchild.data=temp;
            //     l++;
            //     r--;
            // }
                  

        }
          Collections.reverse(node.children );
    }
    
}


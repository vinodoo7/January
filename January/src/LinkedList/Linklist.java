package LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class Linklist {
	public class Node
	{
		int data;
		Node next;
	}
	Node Head;
	int size;
	Node Tail;

	
	public void display() {
		// TODO Auto-generated method stub
		Node temp=Head;
		
		while(temp != null)
		{
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		
	}

	public void Addlast(int d) {
		// TODO Auto-generated method stub
		Node newnode=new Node();
		newnode.data=d;
		if(size==0)
		{
			Head=newnode;
			Tail=newnode;
		}
		else
		{
			Tail.next=newnode;
			Tail=newnode;
		}
		this.size++;	
	}
	
	public void Addfirst(int d)
	{
		Node newnode=new Node();
		newnode.data=d;
		if(Head==null)
		{
			Head=newnode;
			Tail=newnode;
		}
		else
		{
			Node temp=Head;
			newnode.next=temp;
			Head=newnode;	
		}
		this.size++;
	}
	
	public void Addposition(int pos,int d)
	{
		Node newnode=new Node();
		newnode.data=d;
		int count=0;
		Node temp=Head;
		if(pos>=0 && pos<=size)
		{
			if(pos==0)
			{
				Addfirst(d);
			}
			else if(pos==size)
			{
				Addlast(d);
			}
			else
			{
				while(count<pos-1)
				{
					count++;
					temp=temp.next;
				}
		  		newnode.next=temp.next;
		  		temp.next=newnode;
		  		size++;
			}
			
		}
		
	}
	
	public void Removefirst()
	{
		if(size==0)
		{
			return;
		}
		if(size==1)
		{
			Head=null;
			Tail=null;
			size--;
		}
		else
		{
			Node temp=Head;
			Head=temp.next;
			//temp.next=null;//Head=Head.next
			size--;
		}
		
	}
	
	public void RemoveLast()
	{
		if(size>0)
		{
			int count=0;
			Node temp=Head;
			while(count<size-2)
			{
				temp=temp.next;
				count++;
			}
			temp.next=null;
			Tail=temp;
			size--;
		}
		else if(size==0)
		{
			return;
		}
	}
	
	public void RemoveAt(int pos)
	{
		if(size<=0 && pos>size)
		{
			return;
		}
		else if(pos==size)
		{
			RemoveLast();
		}
		else if(pos==1)
		{
			Removefirst();
		}
		else
		{
			int count=0;
			Node temp=Head;
			while(count<pos-2)
			{
				temp=temp.next;
				count++;
			}
			temp.next=temp.next.next;
			size--;
			
		}
	}
	
	
		public boolean isEmpty()
		{
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public int getsize()
		{
			return size;
		}
		
	public Node findwithsize() throws Exception
	{
		if(size==0)
		{
			throw new Exception("there is no data");	
		}
		int count=0;
		int n=0;
		if(size%2==0)
		{
			n=(size/2)-1;
		}
		else
		{
			n=(size/2);
		}
		Node temp=Head;
		while(count<n)
		{
			temp=temp.next;
			count++;
		}
		return temp;
	}
	
	public Node findMidWithoutSize()
	{
		Node rabbit=Head;
		Node tortoise=Head;
		int count=0;
		while(rabbit.next!= null && rabbit.next.next != null)
		{
			rabbit=rabbit.next.next;
			tortoise=tortoise.next;
		}
		return tortoise;
	}
	
	public Node getFirst()
	{
		if(size==0)
		{
			return null;
		}
		else
		{
			return Head;
		}
	}
	
	public Node getLast()
	{
		if(size==0)
		{
			return null;
		}
		else
		{
			return Tail;
		}
	}
	
	public int getposAt(int pos)
	{
		if(pos<0 || pos>=size)
		{
			return -1;
		}
		else
		{
			int count=0;
			Node temp=Head;
			while(count<pos)
			{
				temp=temp.next;
				count++;
			}
			return temp.data;
		}
	}
	

	public Node getpos(int pos)
	{
		if(pos<0 || pos>=size)
		{
			return null;
		}
		else
		{
			int count=0;
			Node temp=Head;
			while(count<pos)
			{
				temp=temp.next;
				count++;
			}
			return temp;
		}
	}
	
	
	public void reverseDI()
	{
		int l=0;
		int r=size-1;
		
		while(l<r)
		{
			Node first=getpos(l);
			Node last=getpos(r);
			
			//swap
			int temp=first.data;
			first.data=last.data;
			last.data=temp;
			l++;
			r--;
		}
		
		
	}
	
	public void reverseLink()
	{
		Node pre=null;
		Node curr=Head;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=pre;
			pre=curr;
			curr=temp;	
		}
		Node temp=this.Head;
		this.Head=this.Tail;
		this.Tail=temp;
	}
	
	public boolean ispalindromeON2()
	{
		int l=0;
		int r=size-1;
		while(l<r)
		{
			Node first=getpos(l);
			Node last=getpos(r);
			
			//swap
			if(first.data!=last.data)
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	Node lefthelper;
	
	public boolean ispalindromerecursive()
	{
		lefthelper=this.Head;
		return ispalindromerecursive(this.Head);
		
	}

	private boolean ispalindromerecursive(Node right) {
		// TODO Auto-generated method stub
		if(right==null)
		{
			return true;
		}
		Boolean b1=ispalindromerecursive(right.next);
		if(b1==false)
		{
			return false;
		}
		if(lefthelper.data!=right.data)
		{
			return false;
		}
		lefthelper=lefthelper.next;
		return true;
	}
	
//	private static void deletenodewithouthead(Node node)
//	{
//		while(node.next!=null)
//		{
//			node.data=node.next.data;
//			node=node.next;
//			
//		}
//		node=null;
//	}
	// 1 2 3 4 5     1 5 2 4 3
	Node foldleft;
	public void fold()
	{
		foldleft=this.Head;
		fold(this.Head,0);
	}
	
	private void fold(Node right,int floor) {
		// TODO Auto-generated method stub
		if(right==null)
		{
			return;
		}
		fold(right.next,floor+1);
		if(floor>size/2)
		{
			Node temp=foldleft.next;
			foldleft=right;
			right=temp;
			foldleft=temp;
		}
		if(floor==size/2)
		{
			right=null;
			Tail=right;
		}
	
	}
	Node LeftRecur;
	public void reverseRecurssion()
	{
		LeftRecur=this.Head;
		reverseRecurssion(this.Head,0);
	}

	
	
	private void reverseRecurssion(Node right,int floor) {
		// TODO Auto-generated method stub
		if(right==null)
		{
			return;
		}
		reverseRecurssion(right.next,floor+1);
		if(floor>=size/2)
		{
			int data = LeftRecur.data;
			LeftRecur.data=right.data;
			right.data=data;
			LeftRecur=LeftRecur.next;
		}
	}
	
	

	public int kthelement(int last) {
		// TODO Auto-generated method stub
		Node fast=this.Head;
		Node slow=this.Head;
		int count=0;
		while(count<last)
		{
			fast=fast.next;
			count++;
		}
		while(fast!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		return slow.data;
		
	}
	
	public static Linklist mergerTwosoryedList(Linklist l1, Linklist l2) {
	{
		//Linklist res=new Linklist();
		Linklist res = new Linklist();
		Node temp1 = l1.Head;
		Node temp2 = l2.Head;
		while (temp1 != null && temp2 != null) {
			int val1 = temp1.data;
			int val2 = temp2.data;

			if (val1 < val2) {
				res.Addlast(val1);
				temp1 = temp1.next;
			} else {
				res.Addlast(val2);
				temp2 = temp2.next;
			}
		}

		while (temp1 != null) {
			int val1 = temp1.data;

			res.Addlast(val1);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			int val2 = temp2.data;

			res.Addlast(val2);
			temp2 = temp2.next;
		}

		return res;
		}
	}
	

	
	public void reverepointerrecursively()
	{
		reverepointerrecursively(this.Head);
		Node temp=Tail;
		Tail=Head;
		Head=temp;
		Tail.next=null;
		
	}

	public void reverepointerrecursively(Node right) {
		// TODO Auto-generated method stub
		if(right.next==null)
		{
			return;
		}
		reverepointerrecursively(right.next);	
		right.next.next=right;
	}
	
	
	public static void makeCycle(Linklist l1) {
		l1.Tail.next=l1.Head;
	}
	
	public static boolean isCycle(Linklist l1)
	{
		//l1.Tail.next=l1.Head;
		Node slow=l1.Head;
		Node fast=l1.Head;
		while(slow!=null && fast!=null &&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	public Node rightrotation(int k)
	{
		return rightrotation(Head,k);
	}
	
	private Node rightrotation(Node head, int k) {
		// TODO Auto-generated method stub
		if(head==null ||k==0)
		{
			return head;
		}
		Node temp=head;
		int len=1;
		while(temp.next!=null)
		{
			temp=temp.next;
			len++;
		}
		System.out.println(len+" len");
		 k=k%len;
		 k=k-1;
		 Node start=head;
		 while(k>0)
		 {
			 start=start.next;
			 k--;
		 }
		 Head=start.next;
		 start.next=null;
		 temp.next=head;
		
		
		return Head;
	}

	public Node rotateListbyk(int k)
	{
		return rotateListbyk(Head,k);
	}
	private Node rotateListbyk(Node head, int k) {
		// TODO Auto-generated method stub
		if(head==null)
		{
			return null;
		}
		//find length
		Node temp=head;
		int len=1;
		while(temp.next!=null)
		{
			temp=temp.next;
			len++;
		}
		temp.next=head;
		k=k%len;
		k=len-k;
		
		
		//Node start=head;
		while(k>0)
		{
			temp=temp.next;
			k--;
		}
		Head=temp.next;
		temp.next=null;
		return Head;
		//make tail.next==head for circular
		// 
		
	}

	public void removeduplicates()
	{
		removeduplicates(this.Head);
	}

	private void removeduplicates(Node node) {
		// TODO Auto-generated method stub
		Node temp=this.Head;
		while(temp!= null)
		{
			while(temp.next != null && temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
				temp=temp.next;
		}

	}
	
	public Node elementcycleAt()
	{
		 return elementcycleAt(Head);
	}

	
	private Node elementcycleAt(Node head) {
		// TODO Auto-generated method stub
		
		//we can do by using Hashing Also
		 if(head==null)
	        {
	            return null;
	        }
	        Node start=head;
	        Node entry=head;
	        Node fast=head;
	        while(start!=null && fast!=null && fast.next!=null )
	        {
	            start=start.next;
	            fast=fast.next.next;
	            if(start==fast)
	            {
	                start=head;
	                while(start!=fast)
	                {
	                    start=start.next;
	                    fast=fast.next;
	                }
	                return start;
	            }
	            
	            
	        }
	       
	        return null;
		
	}

	public Node intersection()
	{
		return intersection(Head,Head);
	}

	private Node intersection(Node head1, Node head2) {
		// TODO Auto-generated method stub
		// Using Hashing
		 Node a=head1;
         Node b=head2;
        HashSet<Node> hs=new HashSet<>();
        
        while(a!=null)
        {
            hs.add(a);
            a=a.next;
        }
        while(b!=null)
        {
           if(hs.contains(b))
           {
               return b;
           }
            b=b.next;
        }
        return null;
        // Using two for loops
//         ListNode a=headA;
//         ListNode b=headB;
//         int size1=0;
//         int size2=0;
//         while(a!=null)
//         {
//             a=a.next;
//             size1++;
//         }
//         while(b!=null)
//         {
//             b=b.next;
//             size2++;
//         }
//         System.out.println(size1+" "+size2);
//         a=headA;
        
//         for(int i=0;i<size1;i++)
//         {
//             b=headB;
//             for(int j=0;j<size2;j++)
//             {
//                 if(a==b)
//                 {
//                     System.out.println(a.val+" "+b.val+" a==b");
//                     return a;
//                 }
//                 else
//                 {
//                     System.out.println(a.val+" "+b.val+" a!=b");
//                     if(b.next!=null)
//                     {
//                         b=b.next;
//                     }
                    
//                 }
//             }
//              if(a.next!=null)
//                     {
//             a=a.next;}
                    
//         }
//         return null;
        
        // Using length
//        if( null==head1 || null==head2 )
//			return null;
//		
//		Node curA = head1, curB = head2;
//		while( curA!=curB){
//			curA = curA==null?head2:curA.next;
//			curB = curB==null?head1:curB.next;
//		}
//		return curA
      
	}
	
}

package LinkedList;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linklist Linklist = new Linklist();
		Linklist.Addfirst(0);
		Linklist.Addlast(5);
		Linklist.Addlast(15);
		Linklist.Addlast(35);
		Linklist.Addlast(45);
		
//		linkedList.addLast(5);
		
		Linklist l1=new Linklist();
		l1.Addlast(1);
		l1.Addlast(7);
		l1.Addlast(7);
		l1.Addlast(8);
		l1.Addlast(8);
		l1.Addlast(9);
		l1.removeduplicates();
		l1.display();
		System.out.println();
		Linklist l2=new Linklist();
		l2.Addlast(1);
		l2.Addlast(5);
		l2.Addlast(7);
		l2.Addlast(42);
		l2.Addlast(54);
//		l2.display();
		System.out.println();
		
//		l1.reverepointerrecursively();
//		Linklist l4= Linklist.mergerTwosoryedList(l1,l2);
//		Linklist.makeCycle(l1);
//		System.out.println(Linklist.isCycle(l1));
		System.out.println();
//		l1.display();
		
//		l1.Addfirst(4);
//		l1.Addfirst(100);
//		l1.Addposition(0,22);
//		l1.Addposition(6,42);
//		l1.Addposition(3,52);
//		l1.fold();
//		System.out.println();
//		l1.Removefirst();
//	     	
//		l1.RemoveLast();
//		l1.RemoveLast();
//		l1.RemoveAt(2);
//		
//		System.out.println(l1.findMidWithoutSize().data);
//		System.out.println(l1.size);
//     	System.out.println(l1.getpos(7).data);
//		System.out.println(l1.ispalindromerecursive());
//		l1.reverseLink();
//		System.out.println();
//		l1.display();
//		l1.reverseRecurssion();
		System.out.println();
//		System.out.println(l1.kthelement(5));
		System.out.println();
//		l1.display();

	}


}

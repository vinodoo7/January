package BinaryseaarchTree;

public class binarysearchtree {

    Node root;

    public void addViaArray(int arr[]) {
        for(int a : arr) {
            this.root = addNodeUtil(this.root, a);
        }
    }
    public void addNode(int data) {
        addNodeUtil(this.root, data);
    }
    public Node addNodeUtil(Node root,int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(data < root.data) {
            root.left = addNodeUtil(root.left, data);
        } else if(data > root.data) {
            root.right = addNodeUtil(root.right, data);
        }
        return root;
    }

    public void preOrder() {
        preOrder(this.root);
    }

    private void preOrder(Node root) {
        if(root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder() {
        postOrder(this.root);
    }

    private void postOrder(Node root) {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public int max()
	{
		return max(root);
	}
	public int max(Node node)
	{
		if(node.right==null)
		{
			return node.data;
		}
		return max(node.right);
	}
	
//	public void pair(Node node,int lo,int hi)
//	{
//		if(node.data>hi)
//		{
//			pair(node.left,lo,hi);
//		}
//		else if(node.data>=lo && node.data<=hi)
//		{
//			pair(node.left,lo,hi);
//			System.out.println(node.data);
//			pair(node.right,lo,hi);
//		}
//		else
//		{
//			pair(node.right,lo,hi);
//		}
//	}
	
	int sum;
	public void largest()
	{
		sum=0;
		largest(root);
	}
	public void largest(Node node)
	{
		if(node==null)
		{
			return;
		}
		largest(node.right);
		int temp=node.data;
		node.data=sum;
		sum+=temp;
		largest(node.left);
		
	}
	 public void remove(int data){
	        root = remove(root,data);
	    }

	    private Node remove(Node node, int data) {
	        if(node.data>data){
	           node.left = remove(node.left,data);
	        }else if(node.data<data){
	            node.right = remove(node.right,data);
	        }else{
	            if(node.left==null&&node.right == null){
	                return null;
	            }else if(node.left==null){
	                return node.right;
	            }else if(node.right == null){
	                return node.left;
	            }else{
	                int lmax = max(node.left);
	                node.data = lmax;
	                node.left = remove(node.left,lmax);
	            }
	        }

	        return node;
	    }
	    
	    public int LCA(int lo,int hi)
	    {
	    	return LCA(root,lo,hi);
	    }
		private int LCA(Node node, int lo, int hi) {
			// TODO Auto-generated method stub
		if(node==null)
		{
			return 0;
		}
			if(node.data>=lo && node.data>=hi)
			{
				return LCA(node.left,lo,hi);
			}
			else if(node.data<=lo && node.data<=hi)
			{
				return LCA(node.right,lo,hi);
			}
			else
			{
				return node.data;
			}
			
		}
	    
}
//
//public class binarysearchtree<T> {
//Node root;
//	
//	public int max()
//	{
//		return max(root);
//	}
//	public int max(Node node)
//	{
//		if(node.right==null)
//		{
//			return node.data;
//		}
//		return max(node.right);
//	}
//	
////	public int min()
////	{
////		return min(root);
////	}
////	public int min(Node node)
////	{
////		if(node.left==null)
////		{
////			return node.data;
////		}
////		return min(node.left);
////	}
//	
//	public void pair(Node node,int lo,int hi)
//	{
//		
//	}
////	public void addNode(int data)
////	{
////		addnode(this.root,data);
////	}
////	private Node addnode(Node root, int data) {
////		// TODO Auto-generated method stub
////		if(root==null)
////		{
////			root=new Node(data);
////			return root;
////		}
////		if(data<root.data)
////		{
////			root.left=addnode(root.left,data);
////		}
////		else
////		{
////			root.right=addnode(root.right,data);
////		}
////		return root;
////	}


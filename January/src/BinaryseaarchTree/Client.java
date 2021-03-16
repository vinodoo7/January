package BinaryseaarchTree;

public class Client {
	public static void main(String[] args) {
		binarysearchtree bst = new binarysearchtree();
        int arr[] = {10, 5, 4, 20, 21, 18, 19};
        bst.addViaArray(arr);
        //bst.largest();
        //bst.inOrder();
        System.out.println(bst.LCA(20,21));
     //System.out.println(bst.max());
        //binarySearchTree.inOrder();
        //System.out.println(binarySearchTree.diameterLength());
}
}

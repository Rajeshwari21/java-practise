	package trees;

public class TreeTest {

	public static void main(String[] args) {
		int valuToInsert = 33;
		BinaryTree binaryTree = new BinaryTree(valuToInsert);
		int[] arrs = {21,35, 20, 34, 54};
		for(int arr: arrs) {
			binaryTree.insertTreeNode(arr);
		}
		
		System.out.println("Tree Height:\n" + binaryTree.getTreeHeight());
		System.out.println("Tree Height at 20 is:\n" + binaryTree.heightOfTreeElement(20));
		System.out.println("Tree Height at 35 is:\n" + binaryTree.heightOfTreeElement(35));
		System.out.println("Search Tree for value 10:\n" + binaryTree.searchTreeElement(10));
		
		System.out.println("In Order Travesal:\n" + binaryTree.toString(1));
		System.out.println("PreOrder Traversal:\n" + binaryTree.toString(2));
		System.out.println("PostOrder Traversal:\n" + binaryTree.toString(3));
		System.out.println("Level Order Traversal:\n" + binaryTree.toString(4));
		
		int nx = binaryTree.countTreeNodes(binaryTree.getRoot());
		System.out.println("Count Of number of nodes in the tree:\n" + nx);
	}
}

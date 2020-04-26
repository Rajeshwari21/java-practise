package trees;

public class TreeTest {

	public static void main(String[] args) {
		int valuToInsert = 33;
		BinaryTree binaryTree = new BinaryTree(valuToInsert);
		int[] arrs = {21,35, 20, 34, 54};
		for(int arr: arrs) {
			binaryTree.insertTreeNode(arr);
		}
		System.out.println("In Order Travesal:\n" + binaryTree.toString(1));
		System.out.println("PreOrder Traversal:\n" + binaryTree.toString(2));
		System.out.println("PostOrder Traversal:\n" + binaryTree.toString(3));
	}
}

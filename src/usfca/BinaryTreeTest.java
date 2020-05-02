package usfca;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rootNode = 33;
		int[] arrs = {25, 35, 21, 26, 34, 54, 20};
		BinaryTreeOperations binaryTree = new BinaryTreeOperations();
		binaryTree.setRoot(rootNode);
		for(int arr: arrs) {
			binaryTree.insertTreeNodes(arr);;
		}
		binaryTree.countOfNodes(binaryTree.getRoot());
		System.out.println("InOrder Traversal: " + binaryTree.showTree(1));
		System.out.println("Level Order Traversal: " + binaryTree.showTree(2));
		System.out.println("Count of Nodes: " + binaryTree.getCountNodes());
		System.out.println("Height of tree is:" + binaryTree.heightOfTree(binaryTree.getRoot())); 
		System.out.println("Height of 25 tree Node is:" + binaryTree.heightOfSpecificElement(21)); 
	}

}

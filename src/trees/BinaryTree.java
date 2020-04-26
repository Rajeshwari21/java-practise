package trees;

public class BinaryTree {
	public TreeNode root;
	public String displayTree = "";
	
	public BinaryTree(int rootNodeValue) {
		this.root = new TreeNode(rootNodeValue);
	}
	
	// rootnode = 33, 
	// nodeValue = 36
	public void insertTreeNode(int nodeValue) {
		TreeNode node = new TreeNode(nodeValue);
		TreeNode pointer = this.root;
		while(pointer != null) {
			if (nodeValue < pointer.data) {
				if (pointer.leftNode == null) {
					pointer.leftNode = node;
					break;
				}
				pointer = pointer.leftNode;
			} else {
				if (pointer.rightNode == null) {
					pointer.rightNode = node;
					break;
				}
				pointer = pointer.rightNode;
			}
		}
		
	}
	
	public String toString(int option) {
		this.displayTree = "";
		switch(option) {
		case 1:
			inOrderTraversal(this.root);
			break;
		case 2:
			preOrderTraversal(this.root);
			break;
		case 3:
			postOrderTraversal(this.root);
		}
		return this.displayTree;
	}
	
	private void postOrderTraversal(TreeNode self) {	
		// left right self
		if (self.leftNode != null) {
			postOrderTraversal(self.leftNode);
		}
		if (self.rightNode != null) {
			postOrderTraversal(self.rightNode);
		}
		displayTree = displayTree + self.data + " ";
	}

	private void preOrderTraversal(TreeNode self) {
		// self left right
		displayTree = displayTree + self.data + " ";
		if (self.leftNode != null) {
			preOrderTraversal(self.leftNode);
		}
		if (self.rightNode != null) {
			preOrderTraversal(self.rightNode);
		}
	}

	public void inOrderTraversal(TreeNode self) {
		// left self right
		if (self.leftNode != null) {
			inOrderTraversal(self.leftNode);
		}
		displayTree = displayTree + self.data + " ";
		if (self.rightNode != null) {
			inOrderTraversal(self.rightNode);
		}
	}
}

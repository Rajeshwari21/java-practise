package usfca;

import java.util.ArrayDeque;

public class BinaryTreeOperations {
	private BinaryTreeNode root;
	private String displayTree = "";
	private int countNodes = 0;
	
	public BinaryTreeNode getRoot() {
		return this.root;
	}
	public void setRoot(int rootNodeValue) {
		this.root = new BinaryTreeNode(rootNodeValue);
	}

	public int getCountNodes() {
		return this.countNodes;
	}
	
	public void insertTreeNodes(int treeNode) {
		BinaryTreeNode newNode = new BinaryTreeNode(treeNode);
		BinaryTreeNode pointer = this.root;
		while(pointer !=null) {
			if (treeNode < pointer.data) {
				if (pointer.leftNode == null) {
					pointer.leftNode = newNode;
					break;
				}
				pointer = pointer.leftNode;
			} else {
				if (pointer.rightNode == null) {
					pointer.rightNode = newNode;
					break;
				}
				pointer = pointer.rightNode;
			}
		}
	}
	
	public String showTree(int option) {
		this.displayTree = "";
		switch(option) {
		case 1:
			inOrderTraversal(this.root);
			break;
		case 2:
			levelOrderTraversal(this.root);
			break;
		}
		return this.displayTree;
	}

	// InOrder Traversal.
	public void inOrderTraversal(BinaryTreeNode self) {
		if (self.leftNode != null) {
			inOrderTraversal(self.leftNode);
		}
		displayTree = displayTree + self.data + " ";
		if (self.rightNode != null) {
			inOrderTraversal(self.rightNode);
		}
	}
	
	public void levelOrderTraversal(BinaryTreeNode self) {
		ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<>();
		queue.add(self);
		while(queue.size() != 0) {
			BinaryTreeNode popData = queue.poll();
			displayTree = displayTree + popData.data + " ";
			if (popData.leftNode != null) {
				queue.add(popData.leftNode);
			}
			if (popData.rightNode != null) {
				queue.add(popData.rightNode);
			}
		}
	}
	
	// count number of nodes in the tree.
	public int countOfNodes(BinaryTreeNode self) {
		if (self.leftNode != null) {
			countOfNodes(self.leftNode);
		}
		countNodes++;
		if (self.rightNode != null) {
			countOfNodes(self.rightNode);
		}
		return countNodes;
	}
	
	// Returns the height of the tree.
	public int heightOfTree(BinaryTreeNode self) {
		int leftNodeHeight = 0;
		int rightNodeHeight = 0;
		
		if (self.leftNode != null) {
			leftNodeHeight = heightOfTree(self.leftNode);
		}
		if (self.rightNode != null) {
			rightNodeHeight = heightOfTree(self.rightNode);
		}
		int height = 1 + Math.max(leftNodeHeight, rightNodeHeight);
		return height;
	}
	
	public int heightOfSpecificElement(int treeElement) {
		BinaryTreeNode pointer = this.root;
		int treeHeight = 0;
		int height = -1;
		while (pointer != null) {
			if (treeElement == pointer.data) {
				height = treeHeight;
				break;
			}
			if (treeElement < pointer.data) {
				if (pointer.leftNode == null) {
					break;
				}
				treeHeight++;
				pointer = pointer.leftNode;
			} else {
				if (pointer.rightNode == null) {
					break;
				}
				treeHeight++;
				pointer = pointer.rightNode;
			}
		}
		return height;
	}
}

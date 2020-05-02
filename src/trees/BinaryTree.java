package trees;

import java.util.ArrayDeque;

public class BinaryTree {
	private TreeNode root;
	public TreeNode getRoot() {
		return root;
	}

	public String displayTree = "";
	public int countNodes = 0;
	
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
			this.inOrderTraversal(this.root);
			break;
		case 2:
			this.preOrderTraversal(this.root);
			break;
		case 3:
			this.postOrderTraversal(this.root);
			break;
		case 4:
			this.levelOrderTraversal(this.root);
			break;
		}
		
		return this.displayTree;
	}
	
	private void postOrderTraversal(TreeNode self) {	
		// left right self
		if (self.leftNode != null) {
			this.postOrderTraversal(self.leftNode);
		}
		if (self.rightNode != null) {
			this.postOrderTraversal(self.rightNode);
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
	
	// Level Order Traversal.
	public void levelOrderTraversal(TreeNode self) {
		ArrayDeque<TreeNode> queue = new ArrayDeque<>();
		queue.add(self);
		while (queue.size() != 0) {
			TreeNode popData = queue.poll();
			displayTree = displayTree + popData.data + " ";
			
			if (popData.leftNode != null) {
				queue.add(popData.leftNode);
			}
			if (popData.rightNode != null) {
				queue.add(popData.rightNode);
			}
		}
	}
	
	
	public int countTreeNodes(TreeNode self) {
		// left self right
		if (self.leftNode != null) {
			countTreeNodes(self.leftNode);
		}
		countNodes++;
		if (self.rightNode != null) {
			countTreeNodes(self.rightNode);
		}
		return countNodes;
	}

	public int countNumberofNodes() {
		int count = 0;
		TreeNode self = this.root;
		ArrayDeque<TreeNode> queue = new ArrayDeque<>();
		queue.add(self);
		while(queue.size() != 0) {
			TreeNode popData = queue.poll();
			count++;
			if (popData.leftNode != null) {
				queue.add(popData.leftNode);
			}
			if (popData.rightNode != null) {
				queue.add(popData.rightNode);
			}
		}
		return count;
	}
	
	public int getTreeHeight() {
		return this.treeHeight(this.root);
	}
	
	private int treeHeight(TreeNode self) {
		int leftHeight = 0;
		int rightHeight = 0;
		if (self.leftNode != null) {
			leftHeight = treeHeight(self.leftNode);
		}
		if (self.rightNode !=null) {
			rightHeight = treeHeight(self.rightNode);
		}
		int height = 1 + Math.max(leftHeight, rightHeight);
		return height;
	}
	
	public int heightOfTreeElement(int treeElement) {
		TreeNode pointer = this.root;
		int heightOfElement = -1;
		int treeHeight = 0;
		while(pointer != null) {
			if (treeElement == pointer.data) {
				heightOfElement = treeHeight;
				break;
			}
			if (treeElement < pointer.data) {
				if (pointer.leftNode ==null) {
					break;
				}
				treeHeight++;
				pointer = pointer.leftNode;
			}
			else {
				if (pointer.rightNode ==null) {
					break;
				}
				treeHeight++;
				pointer = pointer.rightNode;
			}
		}
		return heightOfElement;
	}
	
	public boolean searchTreeElement(int treeElement) {
		return (this.heightOfTreeElement(treeElement) >= 0 ? true : false);
	}
}

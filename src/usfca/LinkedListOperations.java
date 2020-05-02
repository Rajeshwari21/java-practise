package usfca;

public class LinkedListOperations {
	LinkedListBuild head;
	LinkedListBuild tail;
	
	public LinkedListOperations() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertNode(int data) {
		LinkedListBuild node = new LinkedListBuild(data);
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}
		this.tail = node;
	}
	
	public String showLinkedList() {
		LinkedListBuild node = this.head;
		String result = "";
		int count = 0;
		while (node != null) {
			count++;
			result += node.data + " ";
			node = node.next;
		}
		return result + "\nCount of array: " + count;
	}
	
	// 4 , 8, 12, 16, 20, 24, 28
	public boolean insertNodeAtPosition(int data, int position) {
		LinkedListBuild newNode = new LinkedListBuild(data);
		LinkedListBuild currentNode = this.head;
		int index = 0;
		if (position >=0) {
			if (position == 0) {
				newNode.next = this.head;
				this.head = newNode;
				return true;
			}
			while (currentNode != null) {
				if (index == position-1) {
					newNode.next = currentNode.next;
					currentNode.next = newNode;
					index++;
					return true;
				} else {
					currentNode = currentNode.next;
					index++;
				}
			}
		}
		
		return false;
	}
	
	// delete a node.
	// 4 , 8, 12, 16, 20, 24, 28
	public boolean deleteNode(int data) {
		LinkedListBuild currentNode = this.head;
		if (data == currentNode.data) {
			this.head = this.head.next;
			return true;
		}
		while (currentNode != null) {
			if (data == currentNode.next.data) {
				currentNode.next = currentNode.next.next;
				return true;
			} else {
				currentNode = currentNode.next;
			}
		}
		return false;
	}
	
	public boolean deleteNodeAtPosition(int position) {
		LinkedListBuild currentNode = this.head;
		int index = 0;
		if (position == 0) {
			this.head = this.head.next;
			return true;
		}
		while(currentNode != null) {
			if (index == position-1) {
				currentNode.next = currentNode.next.next;
				index++;
				return true;
			} else {
				currentNode = currentNode.next;
				index++;
			}
		}
		return false;
	}
}

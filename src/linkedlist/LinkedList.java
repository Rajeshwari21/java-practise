package linkedlist;

import java.util.ArrayList;

public class LinkedList {

	public LinkedListNode head;
	public LinkedListNode tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public LinkedList(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			this.insertNode(arr[i]);
		}
	}

	public void insertNode(int nodedata) {
		LinkedListNode node = new LinkedListNode(nodedata);
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}
		this.tail = node;
	}
	
	public String toString() {
		
		String s = "";
		LinkedListNode node = this.head;
		while (node != null) {
			s += node.data + " ";
			node = node.next;
		}
		return s;
	}
	
	// 8 ,6, 1, 5, 7, 2 position = 3
	public boolean deleteNodeAtIndex(int positionToDelete) {
		LinkedListNode currentNode = this.head;
		int index = 0;
		
		if (positionToDelete == 0) {
			this.head = this.head.next;
			return true;
		}
		while (currentNode != null) {
			if (index == positionToDelete-1) {
				currentNode.next = currentNode.next.next;
				index++;
				return true;
			}
			else {
				currentNode = currentNode.next;
				index++;
			}
		}
		return false;
	}
	
	// 8 ,6, 1, 5, 7, 2 number = 1
	public boolean deleteNodeByValue(int numberToDelete) {
		LinkedListNode currentNode = this.head;
		boolean numberFound = false;
		if (numberToDelete == currentNode.data) {
			this.head = this.head.next;
		    numberFound = true;
		}
		while (currentNode.next !=null) {
			if (numberToDelete == currentNode.next.data) {
				currentNode.next = currentNode.next.next;
				numberFound = true;
			} else {
				currentNode = currentNode.next;
			}
		}
		return numberFound;
	}
	
	// Print Reverse order.
	// listofData = 12345
	// index      = 01234
	// result = 5 4 3 2 1
	public String reverseOrder() {
		LinkedListNode currentNode = this.head;
		ArrayList<Integer> listOfData = new ArrayList<Integer>();
		while (currentNode !=null) {
			listOfData.add(currentNode.data);
			currentNode = currentNode.next;
		}
		String result = "";
		for (int i=listOfData.size()-1; i>=0; i--) {
			result = result + listOfData.get(i) + " "; 
		}
		return result;
	}
	
	// Helper function to insert node at head, tail or any position.
	// currentNode = 2 5 7 9;
	public  boolean insertNodeAtPosition(int data, int positionToInsert) {
		LinkedListNode newNode = new LinkedListNode(data);
		LinkedListNode currentNode = this.head;
		int index = 0;
		if (positionToInsert >=0) {
			if (positionToInsert == 0) {
				newNode.next = this.head;
				this.head = newNode;
			    return true;
			}
			while(currentNode != null) {
				if (index == positionToInsert-1) {
					newNode.next = currentNode.next;
					currentNode.next = newNode;
					index++;
					return true;
				}
				else {
					currentNode = currentNode.next;
					index++;
				}
			}
		}
		
		return false;
	}
}

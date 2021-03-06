package linkedlist;

public class LinkedListInsertNodeAtHead {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 9};
		LinkedList llist = new LinkedList(arr);
		boolean isInsertedAtHeadPosition = llist.insertNodeAtPosition(1,0);
		if (isInsertedAtHeadPosition) {
			System.out.println("Inserted at head position:\n" + llist.toString());
		}
		else {
			System.out.println("Cannot be inserted");
		}
	}

}

package usfca;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations llist = new LinkedListOperations();
		int[] arrays = {4 , 8, 12, 16, 20, 24, 28};
		for(int integer : arrays) {
			llist.insertNode(integer);
		}
		System.out.println("Linked List: " + llist.showLinkedList());
		boolean isInserted = llist.insertNodeAtPosition(18, 3);
		if (isInserted ) {
			System.out.println("Add a node at any position: " + llist.showLinkedList());
		}
		else {
			System.out.println("Cannot be inserted.");
		}
		
//		boolean isDeletedThroughData = llist.deleteNode(16);
//		if (isDeletedThroughData) {
//			System.out.println("Deleted " + llist.showLinkedList());
//		} else {
//			System.out.println("Not deleted.");
//		}
		
//		boolean isDeletedThroughPosition = llist.deleteNodeAtPosition(6);
//		if (isDeletedThroughPosition) {
//			System.out.println("Deleted " + llist.showLinkedList());
//		} else {
//			System.out.println("Not deleted.");
//		}
	}
}

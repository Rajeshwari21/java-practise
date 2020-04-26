
public class LinkedListInserNodeAtAnyPosition {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 9};
		LinkedList llist = new LinkedList(arr);
		boolean isInsertedAtAnyPosition = llist.insertNodeAtPosition(6,2);
		if (isInsertedAtAnyPosition) {
			System.out.println("Inserted at any position:\n" + llist.toString());
		}

	}

}

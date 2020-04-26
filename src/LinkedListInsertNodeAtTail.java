
public class LinkedListInsertNodeAtTail {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 9};
		LinkedList llist = new LinkedList(arr);
		boolean isInsertedAtTailPosition = llist.insertNodeAtPosition(10,4);
		if (isInsertedAtTailPosition) {
			System.out.println("Inserted at tail position:\n" + llist.toString());
		}

	}

}

package linkedlist;

public class LinkedListDeleteNode {

	public static void main (String[] args) {
		int []arr = {8 ,6, 1, 5, 7, 2};
		LinkedList llist = new LinkedList(arr);
		String printReverse = llist.reverseOrder();
		boolean isDeleted = llist.deleteNodeAtIndex(1);
//		boolean isDeleted6 = llist.deleteNodeByValue(5);
//		System.out.println(printReverse);
		if (isDeleted) {
			System.out.println(llist.toString());
		} else {
			System.out.println("Index does not exist");
		}
	}
}

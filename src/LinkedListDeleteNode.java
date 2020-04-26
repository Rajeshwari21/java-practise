
public class LinkedListDeleteNode {

	public static void main (String[] args) {
		int []arr = {8 ,6, 1, 5, 7, 2, 6, 1};
		LinkedList llist = new LinkedList(arr);
		String printReverse = llist.reverseOrder();
		boolean isDeleted = llist.deleteNodeByValue(8);
		boolean isDeleted6 = llist.deleteNodeByValue(5);
		System.out.println(printReverse);
//		if (isDeleted && isDeleted6) {
//			System.out.println(llist.toString());
//		} else {
//			System.out.println("Index does not exist");
//		}
	}
}

/*
* @Author: ljaiverson
* @Date:   2019-07-06 10:29:40
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-06 19:45:25
*/

public class VengefulSLList<Item> extends SLList<Item> {
	SLList<Item> deletedItems;

	public VengefulSLList() {
		/** implicitly called super();
		  * not if we explicitly call super(x);
		  */
		deletedItems = new SLList<Item>();
	}

	public VengefulSLList(Item x) {
		super(x);
		deletedItems = new SLList<Item>();
	}

	/** Overrides removeLast so that it keeps the lost items. */
	@Override
	public Item removeLast() {
		Item x = super.removeLast();
		deletedItems.addLast(x);
		return x;
	}

	/** Prints out the deleted items. */
	public void printLostItems() {
		deletedItems.print();
	}

	public static void main(String[] args){
//		VengefulSLList<Integer> vsl = new VengefulSLList<>(0);
//
//		vsl.addLast(1);
//		vsl.addLast(5);
//		vsl.addLast(10);
//		vsl.addLast(13);
//		/* vsl is now: [1, 5, 10, 13] */
//
//
//		vsl.removeLast();
//		vsl.removeLast();
//		// After deletion, vsl is: [1, 5]
//
//		// Should print out the numbers of the fallen, namely 10 and 13.
//		System.out.print("The fallen are: ");
//		vsl.printLostItems();

		VengefulSLList<Integer> vsl = new VengefulSLList<>(9);
		SLList<Integer> sl = vsl;

		sl.addLast(50);
		sl.removeLast();

		// sl.printLostItems(); // sl has static type SLList, SLList does not have printLostItems(), compile error.


		// sl -> static type SLList, is not necessarily a VengefulSLList. So the next line causes compile error.
		// Have to use cast to do this.
		VengefulSLList<Integer> vsl2 = (VengefulSLList) sl;
	}
}
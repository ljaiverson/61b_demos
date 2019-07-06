/*
* @Author: ljaiverson
* @Date:   2019-07-01 10:25:12
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-05 10:58:31
*/

/** An SLList is a  list of integers, which hides the 
  * terrible truth of the nakedness within. */
public class SLList<LochNess> implements List61B<LochNess>{

	/** StuffNode is used and only used by  SLList, so it is good to make it a private nested class. */

	/** Since StuffNode never uses anything in SLList, so we make it static. */

	/** But if consider generic type, in which scenerio StuffNode is actually using 
	  * the type specified at SLList<LochNess>, then the StuffNode class should not be static. */
	private class StuffNode {
	
		public LochNess item;
		public StuffNode next;

		public StuffNode(LochNess i, StuffNode n) {
			item = i;
			next = n;
		}	
	}

	/* The first item (if exists) is sentinel.next. */
	private StuffNode sentinel;
	private int size;


	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new StuffNode(null, null); // 63 is just randomly chosen.
		size = 0;
	}


	public SLList(LochNess x) {
		sentinel = new StuffNode(null, null);
		sentinel.next = new StuffNode(x, null);
		size = 1;
	}	

	/** Adds x to the front of the list. */
	@Override
	public void addFirst(LochNess x) {
		sentinel.next = new StuffNode(x, sentinel.next);
		size += 1;
	}

	/** Inserts x to the target position. */
	@Override
	public void insert(LochNess x, int position) {
		StuffNode p = sentinel;
		while (position != 0) {
			position -= 1;
			p = p.next;
		}

		p.next = new StuffNode(x, p.next);
		size += 1;
	}

	/** Returns the first item in the list. */
	@Override
	public LochNess getFirst() {
		return sentinel.next.item;
	}

	/** Adds an item to the end of the List. */
	@Override
	public void addLast(LochNess x) {
		size += 1;

		// Use sentinel node to avoid the following special case.
		// if (first == null) {
		// 	first = new StuffNode(x, null);
		// 	return;
		// }

		StuffNode p = this.sentinel;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new StuffNode(x, null);
	}

	/** Get last item in the last node. */
	@Override
	public LochNess getLast() {
		StuffNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}
		return p.item;
	}

	/** Returns the ith item in the list. */
 	@Override
 	public LochNess get(int i) {
 		return get(i, sentinel.next);
 	}

 	/** Helper function for get(int i), return the ith item of the list, start with StuffNode p. */
 	private LochNess get(int i, StuffNode p) {
 		if (i == 0) {
 			return p.item;
 		}
 		return get(i - 1, p.next);
 	}


 	/** Removes the last item of the list. */
 	@Override
 	public LochNess removeLast() {
 		size = size - 1;
 		StuffNode p = sentinel;
 		while (p.next.next != null) {
 			p = p.next;
 		}
 		LochNess x = p.next.item;
 		p.next = null;
 		return x;
 	}


	/** Helper function for size(): returns the size of the list that starts at StuffNode p. */
	// private static int size(StuffNode p) {
	// 	if (p.next == null) {
	// 		return 1;
	// 	}
	// 	return 1 + size(p.next);
	// }

	/** Returns the size of the list. */
	@Override
	public int size() {
		// The next line uses the helper function above.
		// return size(first);
		return size;
	}

	/** List61B's print is not efficient for SLList. */
	/** Prints the entire list. */
	@Override
	public void print() {
		System.out.println("Yo what's up, SLList (or my sub class) here.");
		for (StuffNode p = sentinel; p.next != null; p = p.next) {
			System.out.print(p.next.item + " ");
		}
	}

	// Use SLListLauncher instead of a main method in SLList class.
	public static void main(String[] args){
		// Before generic
		// /* Creates a list of one integer, namely 10 */
		// SLList L = new SLList();



		SLList L = new SLList(15);

		L.addFirst(10);
		L.addFirst(5);
		L.addLast(20);

		L.insert(3, 2);
		L.print();

		// System.out.println(L.get(3));
		// System.out.println(L.removeLast());
		// System.out.println(L.removeLast());
		// System.out.println(L.removeLast());
		// System.out.println(L.removeLast());
		// System.out.println(L.size());

		// // After generic
		// SLList<String> s1 = new SLList<String>("bone");
		// s1.addFirst("thugs");

		// System.out.println(s1.getFirst());
	}
}
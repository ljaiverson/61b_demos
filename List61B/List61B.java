/*
* @Author: ljaiverson
* @Date:   2019-07-04 09:22:22
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-05 10:53:28
*/

public interface List61B<Item> {
	/** Inserts x to the target position. */
	public void insert(Item x, int position);

	/** Inserts X into the front of the list. */
	public void addFirst(Item x);

	/** Inserts X into the back of the list. */
	public void addLast(Item x);

	/** Returns the item from the back of the list. */
	public Item getFirst();

	/** Returns the item from the back of the list. */
	public Item getLast();

	/** Gets the ith item in the list (0 is the front). */
	public Item get(int i);

	/** Returns the number of items in the list. */
	public int size();

	/** Deletes item from back of the list and
	  * returns deleted item. */
	public Item removeLast();

	/** Prints all the items in the list. */
	/** This is implementation inheritance. */
	default public void print() {
		for (int i = 0; i < size(); i += 1) {
			System.out.print(get(i) + " ");
		}
	}

}
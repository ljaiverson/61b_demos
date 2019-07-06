/*
* @Author: Jun Luo
* @Date:   2019-07-02 11:28:59
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-05 11:00:08
*/

public class AList<Item> implements List61B<Item> {
	private Item[] items;
	private int size;

	/** Creates an empty list. */
	public AList() {
		items = (Item[]) new Object[100]; // Syntax of generic array
		size = 0;
	}

	/** Resizes the underlying array to the target capacity. */
	private void resize(int capacity) {
		Item[] a = (Item[]) new Object[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}

	/** Inserts x to the target position. */
	@Override
	public void insert(Item x, int position) {
		Item[] newItems = (Item[]) new Object[items.length + 1];
		System.arraycopy(items, 0, newItems, 0, position);

		newItems[position] = x;

		System.arraycopy(items, position, newItems, position+1, items.length - position);
		items = newItems;
		size += 1;
	}

	/** Adds x to the front of the list. */
	@Override
	public void addFirst(Item x) {
		insert(x, 0);
	}

	/** Returns the first item of the list. */
	@Override
	public Item getFirst() {
		return items[0];
	}

	/** Inserts X into the back of the list. */
	@Override
	public void addLast(Item x) {
		if (size == items.length) {
			resize(size * 2);
		}

		items[size] = x;
		size += 1;
	}

	/** Returns the item from the back of the list. */
	@Override
	public Item getLast() {
		return items[size- 1 ];
	}
	/** Gets the ith item in the list (0 is the front). */
	@Override
	public Item get(int i) {
		return items[i];
	}

	/** Returns the number of items in the list. */
	@Override
	public int size() {
		return size;
	}

	/** Deletes item from back of the list and
	  * returns deleted item. */
	@Override
	public Item removeLast() {
		Item x = getLast();
		items[size - 1] = null; // Save memory
		size = size - 1;
		return x;
	}

	public static void main(String[] args) {
		AList<Integer> l = new AList<>();
		l.addFirst(5);
		l.addLast(10);
		l.addLast(20);
		l.insert(15, 2);
		l.print();
	}
} 
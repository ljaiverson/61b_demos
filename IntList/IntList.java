/*
* @Author: ljaiverson
* @Date:   2019-07-01 09:38:50
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-01 10:21:02
*/

public class IntList {
	
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using recursion! */
	public int size() {
		if (this.rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;

		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Get the ith (from 0th) or the last (i > size-1) item of the list using recursion. */
	public int get(int i) {
		if (this.rest == null || i == 0) {
			return this.first;
		}
		return this.rest.get(i - 1);
	}

	public static void main(String[] args){
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		// System.out.println(L.size());
		// System.out.println(L.iterativeSize());
		System.out.println(L.get(2));



		// IntList L = new IntList();
		// L.first = 5;
		// L.rest = null;

		// L.rest = new IntList();
		// L.rest.first = 10; 

		// L.rest.rest = new IntList();
		// L.rest.rest.first = 15;
	}	
}
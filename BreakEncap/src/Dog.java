/*
* @Author: ljaiverson
* @Date:   2019-07-06 12:08:12
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-06 19:29:03
*/

public class Dog {

	/** Case 1: */
	/** public void bark(){
		System.out.println("bark");
	}

	public void barkMany(int N) {
		for (int i = 0; i < N; i+=1) {
			bark();
		}
	}

	/** Case 2: */
	public void bark(){
		barkMany(1);
	}

	public void barkMany(int N) {
		for (int i = 0; i < N; i+=1) {
			System.out.println("bark");
		}
	}
}
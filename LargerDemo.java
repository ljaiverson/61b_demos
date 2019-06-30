/*
* @Author: Jun Luo
* @Date:   2019-06-28 15:52:42
* @Last Modified by:   Jun Luo
* @Last Modified time: 2019-06-28 17:02:08
*/

public class LargerDemo {
	/** Returns the larger of x and y. */
	public static int larger(int x, int y) {
		if (x > y) {
			return x;
		}
		return y;
	}

	public static void main(String[] args){
		System.out.println(larger(-5, 10));
	}	
}
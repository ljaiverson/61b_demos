/*
* @Author: ljaiverson
* @Date:   2019-06-30 21:26:40
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-01 16:32:41
*/

public class Array {

	/** Shows three ways of newing an array of integers. */
	public static void main(String[] args){
		// // No.1
		// int[] x = new int[3];
		// x[0] = 4;
		// x[1] = 7;
		// x[2] = 10;
		// System.out.println(x[1]);

		// // No.2
		// int[] y = new int[]{4, 7, 10};
		// System.out.println(y[1]);

		// // No.3
		// int[] z = {9, 10, 11};
		// System.out.println(z[1]);



		int[] z = null;
		int[] x, y;

		x = new int[]{1, 2, 3, 4, 5};
		y = x;
		x = new int[]{-1, 2, 5, 4, 99};
		y = new int[3];
		z = new int[0]; // empty array
		int xL = x.length;

		String[] s = new String[6];
		s[4] = "ketchup";
		s[x[3] - x[1]] = "muffins";

		int[] b = {9, 10, 11};

		// copy from the 0th item of b, to the 3rd item of x and the copy length is 2
		// i.e. copy b[0], b[1] to x[3], x[4]
		System.arraycopy(b, 0, x, 3, 2);

	}	
}
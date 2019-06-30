/*
* @Author: ljaiverson
* @Date:   2019-06-30 21:26:40
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-06-30 21:28:26
*/

public class Array {

	/** Shows two ways of newing an array of integers. */
	public static void main(String[] args){
		int[] numbers = new int[3];
		numbers[0] = 4;
		numbers[1] = 7;
		numbers[2] = 10;
		System.out.println(numbers[1]);


		int[] new_numbers = new int[]{4, 7, 10};
		System.out.println(new_numbers[1]);
	}	
}
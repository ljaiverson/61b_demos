/*
* @Author: Jun Luo
* @Date:   2019-06-28 19:36:13
* @Last Modified by:   Jun Luo
* @Last Modified time: 2019-06-28 19:40:31
*/

public class SumArgs {
	public static void main(String[] args){
		int sum = 0;
		for(int i = 0; i < args.length; i=i+1) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}	
}
/*
* @Author: ljaiverson
* @Date:   2019-07-01 16:04:37
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-01 16:11:47
*/

public class SLListLauncher {
	public static void main(String[] args){
		/** Use the referrence type corresponding to
		  * each primitive tpye.
		  * int: Integer
		  * double: Double
		  * char: Character
		  * boolean: Boolean
		  * long: Long
		  */
		
		SLList<String> s1 = new SLList<>("bone");
		s1.addFirst("thugs");

		SLList<Double> s2 = new SLList<>(2.3);
		s2.addFirst(3.4);
	}	
}
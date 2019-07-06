/*
* @Author: ljaiverson
* @Date:   2019-07-02 12:23:10
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-02 13:15:16
*/

public class SpeedTestAList {
	public static void main(String[] args){
		AList<Integer> L = new AList();
		for(int i = 0; i < 10000; i = i + 1) {
			L.addLast(i);
		}
	}	
}
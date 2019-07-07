/*
* @Author: ljaiverson
* @Date:   2019-07-07 08:06:34
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-07-07 08:07:59
*/

import java.util.Set;
import java.util.HashSet;

public class SimpleBuiltInSetExample {
	public static void main(String[] args){
		Set<String> S = new HashSet<>();
		S.add("Tokyo");
		S.add("Beijing");
		S.add("Sao Paulo");
		System.out.println(S.contains("Tokyo"));
	}	
}
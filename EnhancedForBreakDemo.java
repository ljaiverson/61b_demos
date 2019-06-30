/*
* @Author: ljaiverson
* @Date:   2019-06-30 21:33:59
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-06-30 21:34:04
*/

public class EnhancedForBreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }                
            }
        }
    }
}
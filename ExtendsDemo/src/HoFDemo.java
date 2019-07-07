/**
 * @Author: Jun Luo
 * @Date: 07/06/2019
 * @Time: 20:48
 * @Description: Higher Order Function Demo
 */

public class HoFDemo {
    public static int do_twice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        int x = 2;
        IntUnaryFunction tenX = new TenX();
        System.out.println(do_twice(tenX, x));
    }
}

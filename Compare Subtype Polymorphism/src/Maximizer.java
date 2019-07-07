import java.util.Comparator;

/**
 * @Author: Jun Luo
 * @Date: 07/06/2019
 * @Time: 22:01
 * @Description: Compares Dogs
 */



public class Maximizer {
    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for(int i = 0; i < items.length; i += 1) {
            if (items[i].compareTo(items[maxDex]) >= 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 9), new Dog("artemesios", 15)};
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}

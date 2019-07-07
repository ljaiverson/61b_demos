/**
 * @Author: Jun Luo
 * @Date: 07/06/2019
 * @Time: 22:00
 * @Description: Dog that has name and size
 */

import java.util.Comparator;

public class Dog implements Comparable<Dog>{
    public int size;
    public String name;

    public Dog(String n, int s) {
        size = s;
        name = n;
    }

    public void bark() {
        System.out.println("I am " + name + ", Woof");
    }

    /* Returns negative value if this dog is smaller than other dog. */
    @Override
    public int compareTo(Dog o) {
        return this.size - o.size;
    }


    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }
}

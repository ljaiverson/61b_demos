/**
 * @Author: Jun Luo
 * @Date: 07/07/2019
 * @Time: 8:18
 * @Description: ArraySet
 */

import java.util.*;


public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this set contains a mapping for the specified item. */
    public boolean contains(T x) {
        for(int i = 0; i < size; i += 1) {
            if(items[i] == null) {
                if(x == null) {
                    return true;
                }
            }
            if(x.equals(items[i])) {
                return true;
            }
        }
        return false;
    }

    /* Add item into Set (no duplicates).
     * Throws an IllegalArgumentException if the item is null. */
    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("You can't add null to an ArraySet.");
        }
        if (this.contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of items in this Set. */
    public int size() {
        return size;
    }

    /* Returns an iterator (a.k.a. seer) into ME. */
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        @Override
        public boolean hasNext() {
            return wizPos < size;
        }

        @Override
        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    /*@Override
    public String toString() {
        StringBuilder returnSB = new StringBuilder("{");
        for(int i = 0; i < size-1; i+= 1) {
            returnSB.append(items[i].toString());
            returnSB.append(", ");
        }
        returnSB.append(items[size-1].toString());
        returnSB.append("}");
        return returnSB.toString();
    }*/

    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();
        for(T x: this) {
            listOfItems.add(x.toString());
        }
        return "{" + String.join(", ", listOfItems) + "}";
    }

    public static <Glerp> ArraySet<Glerp> of(Glerp... stuff) {
        ArraySet<Glerp> returnSet = new ArraySet<>();
        for(Glerp x: stuff) {
            returnSet.add(x);
        }
        return returnSet;
    }


    @Override
    public boolean equals(Object other) {
        if(this == other) { return true; }
        if(other == null) { return false; }
        if(other.getClass() != this.getClass()) { return false; }


        ArraySet<T> o = (ArraySet<T>) other;
        if(o.size() != this.size()) {
            return false;
        }
        for(T item: this) {
            if(!o.contains(item)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        ArraySet<String> S = new ArraySet<>();
//        S.add(null);
//        S.add("Tokyo");
//        S.add("Beijing");
//        S.add("Sao Paulo");
//        S.add("Tokyo");
//        System.out.println(S.contains("Tokyo"));
//
//        Set<Integer> javaset = new HashSet<>();
//        javaset.add(5);
//        javaset.add(23);
//        javaset.add(42);
//        for (int i : javaset) {;}
//
//        Iterator<Integer> seer = javaset.iterator();
//        while(seer.hasNext()) {
//            int i = seer.next();
//        }
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);


//        Iterator<Integer> aseer = aset.iterator();
//        while(aseer.hasNext()) {
//            int i = aseer.next();
//            System.out.println(i);
//        }
//
//        for (int i : aset) {
//            System.out.println(i);
//        }
//
//
        System.out.println(aset);

        ArraySet<String> aset2 = ArraySet.of("I", "love", "Lingling");
        System.out.println(aset2);

//        ArraySet<Integer> aset2 = new ArraySet<>();
//        aset2.add(5);
//        aset2.add(23);
//        aset2.add(42);
//
//        System.out.println(aset2.equals(aset));
//        System.out.println(aset2.equals(null));
//        System.out.println(aset2.equals("nihao"));
    }

}
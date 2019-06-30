/*
* @Author: Jun Luo
* @Date:   2019-06-30 21:46:37
* @Last Modified by:   ljaiverson
* @Last Modified time: 2019-06-30 21:47:01
*/

public class PollQuestionsW2L1 {
   public static void main(String[] args) {
      Walrus a = new Walrus(1000, 8.3);
      Walrus b;
      b = a;
      b.weight = 5;
      System.out.println(a);
      System.out.println(b);      

      int x = 5;
      int y;
      y = x;
      x = 2;
      System.out.println("x is: " + x);
      System.out.println("y is: " + y);      
   }
   
   public static class Walrus {
      public int weight;
      public double tuskSize;
      
      public Walrus(int w, double ts) {
         weight = w;
         tuskSize = ts;
      }

      public String toString() {
         return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
      }
   }
}
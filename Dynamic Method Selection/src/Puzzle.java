public class Puzzle {
    public static void main (String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        a.greet(d);
        a.sniff(d);
        d.flatter(d);
        a.flatter(d);
    }
}

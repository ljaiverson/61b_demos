public class Dog implements Animal {
    public void sniff(Animal a) {
        System.out.println("dog sniff animal");
    }

    public void flatter (Dog a) {
        System.out.println("This is not overriding, because the method signature is not the same. u r cool dog");
    }

//    @Override
//    public void flatter (Animal a) {
//        System.out.println("Override. Dog flatter animal");
//    }
}
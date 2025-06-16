

class Outer {
    static class StaticInner {
        void hello() {
            System.out.println("Hi!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
            Outer.StaticInner inner = new Outer.StaticInner();
            inner.hello();
    }
}
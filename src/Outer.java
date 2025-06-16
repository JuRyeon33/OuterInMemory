

public class Outer {
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();

        inner.printData();

        inner = null;
        outer = null;

        System.gc();
        System.out.println("Outer와 Inner는 더 이상 사용되지 않음");
    }
}
package addieren;

public class A {
    protected int zahl;
    public int addieren(int x, int y) {
        System.out.println("In A");
        return x + y;
    }

    public int subtrahieren(int x, int y) {
        return x - y;
    }
}

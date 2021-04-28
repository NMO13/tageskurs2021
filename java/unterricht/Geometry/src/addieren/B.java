package addieren;

public class B extends A{
    int number;

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public int dreiPlusVier() {
        return 3 + 4;
    }

    // wird vererbt, kann aber nicht außerhalb aufgerufen werden
    protected int x() {
        return 44;
    }

    // addieren wird von A überschrieben
    public int addieren(int x, int y) {
        System.out.println("In B");
        return x + y + 10;
    }
}

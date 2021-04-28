package addieren;

public class C extends B{
    public void  setNumber1(int x) {
        // setNumber(3); // geht nicht, da private
        // setNumber() wird nicht vererbt, da private

        dreiPlusVier(); // geht, da public
        // dreiPlusVier() wird vererbt
        x();

        zahl = 9;
        subtrahieren(9, 3);
    }

    public int addieren(int x, int y) {
        System.out.println("In C");
        return x + y;
    }
}

public class MyException extends Exception {
    private int index;
    public MyException(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

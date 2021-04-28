class Main {
    public static void main(String[] args) {
        Zug zug = new Zug(230, 5);
        zug.printWaggone();
        zug.waggonAnkoppeln();
        zug.printWaggone();
        zug.waggonAnkoppeln();
        zug.printWaggone();
        zug.waggonAnkoppeln();
        zug.printWaggone();
        zug.waggonAnkoppeln();
        zug.printWaggone();
        zug.waggonAnkoppeln();
        zug.printWaggone();
        zug.waggonAnkoppeln();
        zug.printWaggone();

        zug.waggonAbkoppeln();
        zug.printWaggone();
        zug.waggonAbkoppeln();
        zug.printWaggone();
        zug.waggonAbkoppeln();
        zug.printWaggone();
        zug.waggonAbkoppeln();
        zug.printWaggone();
        zug.waggonAbkoppeln();
        zug.printWaggone();
        zug.waggonAbkoppeln();
        zug.printWaggone();


        zug.beschleunigen(10);
        zug.beschleunigen(50);
        zug.beschleunigen(100);
        zug.beschleunigen(150);

        zug.bremsen(10);
        zug.bremsen(50);
        zug.bremsen(100);
        zug.bremsen(150);
    }
}
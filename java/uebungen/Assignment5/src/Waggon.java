public class Waggon {
    enum Typ {
        GUETER,
        PERSON
    }
    public Waggon(Typ typ, int maxPersonenCount) {
        this.waggonTyp = typ;
        this.maximalPersonenCount = maxPersonenCount;
    }
    int maximalPersonenCount;
    Typ waggonTyp;
}

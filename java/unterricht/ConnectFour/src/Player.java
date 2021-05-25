enum Color {
    YELLOW,
    RED,
    EMPTY
}
public interface Player {
    public Move chooseMove(Board board);
}

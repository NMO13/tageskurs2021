enum Color {
    YELLOW,
    RED,
}
public interface Player {
    public Move chooseMove(Board board);
    public Color getColor();
}

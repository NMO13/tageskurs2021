import java.util.Scanner;

public class HumanPlayer implements Player {
    private Color color;
    public HumanPlayer(Color color) {
        this.color = color;
    }
    public Move chooseMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        int column = -1;

        while(column < 0 || column > 6) {
            System.out.println("Choose column (0-6): ");
            column = scanner.nextInt();
            int[] validMoves = board.getValidMoves();
            // todo check if column is in validMoves
            // if no then let the user try again
        }

        Move move = new Move(this.color, column);
        return move;
    }
}

import java.util.Scanner;

public class HumanPlayer implements Player {
    private Color color;
    public HumanPlayer(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Move chooseMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        int column = -1;
        while(true) {
            System.out.println("Choose column (0-6): ");
            column = scanner.nextInt();
            int[] validMoves = board.getValidMoves();
            // if column is not in valid range or column already full
            // => start again
            if(column < 0 || column > 6 || validMoves[column] == -1){
                // column is full so choose another one
                System.out.println("Column is not valid. Choose another one.");
            } else
                break;
        }

        Move move = new Move(this.color, column);
        return move;
    }
}

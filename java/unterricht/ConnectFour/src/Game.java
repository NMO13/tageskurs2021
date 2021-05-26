import java.util.LinkedList;

public class Game {
    LinkedList<Move> history = new LinkedList<>();
    void play() {
        Board board = new Board();
        Player player1 = new HumanPlayer(Color.RED);
        Player player2 = new HumanPlayer(Color.YELLOW);

        Player currentPlayer = player1;
        // game loop
        while(!board.gameOver()) {
            board.draw();
            Move move = currentPlayer.chooseMove(board);
            board.executeMove(move);
            history.add(move);
            currentPlayer = switchPlayer(currentPlayer, player1, player2);
        }
        board.draw();
        Color winner = board.getWinner();
        printWinner(winner);
    }

    private Player switchPlayer(Player currentPlayer, Player player1, Player player2) {
        if(currentPlayer == player1) {
            return player2;
        } else {
            return player1;
        }

        // Equivalent:
        // return (currentPlayer == player1) ? player2 : player1;
    }

    private void printWinner(Color winner) {
        if(winner == Color.RED) {
            System.out.println("Roter Spieler hat gewonnen!");
        } else if(winner == Color.YELLOW) {
            System.out.println("Gelber Spieler hat gewonnen!");
        } else {
            System.out.println("Unentschieden!");
        }
    }
}

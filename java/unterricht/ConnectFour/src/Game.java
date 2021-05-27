import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    LinkedList<Move> history = new LinkedList<>();
    void play() {
        boolean playAnotherGame;
        do {
            playAnotherGame = false;
            Board board = new Board();
            Player player1 = new HumanPlayer(Color.RED);
            Player player2 = new HumanPlayer(Color.YELLOW);

            Player currentPlayer = player2;
            // game loop
            while (!board.gameOver(currentPlayer.getColor())) {
                board.draw();
                currentPlayer = switchPlayer(currentPlayer, player1, player2);
                Move move = currentPlayer.chooseMove(board);
                board.executeMove(move);
                history.add(move);
            }
            board.draw();
            Color winner = board.getWinner();
            printWinner(winner);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to play another game? (y/n) ");
            String result = scanner.nextLine();
            if (result.equals("y"))
                playAnotherGame = true;
        } while(playAnotherGame);
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

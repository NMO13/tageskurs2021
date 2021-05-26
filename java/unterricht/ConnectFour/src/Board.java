public class Board {
    Color[][] board = new Color[6][7];
    public void reset() {

    }

    public void executeMove(Move move) {
        int x = 0;
        for(;x < board.length; x++) {
            if(board[x][move.column] == null) {
                break;
            }
        }

        board[x][move.column] = move.color;
    }

    public int[] getValidMoves() {
        return null;
    }

    public boolean gameOver() {
        return false;
    }

    public Color getWinner() {
        return null;
    }

    public void draw() {
        int numColumns = board[0].length;
        int numRows = board.length;
        // header row
        System.out.print("   ");
        for(int i = 0; i < numColumns; i++)
            System.out.print(i + " ");
        System.out.println();

        // actual grid
        for(int row = 0; row < numRows; row++) { // iterate over rows
            System.out.print(numRows - 1 - row);
            System.out.print(" ");
            for(int col = 0; col < numColumns; col++) { // iterate over columns
                System.out.print("|");
                String content = cellToString(row, col);
                System.out.print(content);
            }
            System.out.print("|");
            System.out.println();
        }
        // bottom
        System.out.print("  ");
        for(int i = 0; i < numColumns; i++) {
            System.out.print("-");
            System.out.print("-");
        }
        System.out.println("-");

    }

    public String cellToString(int row, int col) {
        int numRows = board.length;
        Color color = board[numRows - row - 1][col];
        if(color == Color.RED)
            return "x";
        else if(color == Color.YELLOW)
            return "o";
        else
            return " ";
    }

}

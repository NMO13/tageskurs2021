public class Board {
    Color[][] board = new Color[6][7];
    Color winner;

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
        // get number of columns
        int numCols = board[0].length;
        // create array of size "number of columns"
        int[] stateArray = new int[numCols];
        for(int col = 0; col < numCols; col++)
            for(int row = 0; row < board.length; row++) {
                if(board[row][col] == null)
                    stateArray[col] = col;
                else
                    stateArray[col] = -1;
            }
        return stateArray;
    }

    public boolean gameOver(Color currentColor) {
        //check for 4 across
        for(int row = 0; row<board.length; row++){
            for (int col = 0;col < board[0].length - 3;col++){
                if (board[row][col] == currentColor   &&
                        board[row][col+1] == currentColor &&
                        board[row][col+2] == currentColor &&
                        board[row][col+3] == currentColor){
                    winner = currentColor;
                    return true;
                }
            }
        }
        //check for 4 up and down
        for(int row = 0; row < board.length - 3; row++){
            for(int col = 0; col < board[0].length; col++){
                if (board[row][col] == currentColor   &&
                        board[row+1][col] == currentColor &&
                        board[row+2][col] == currentColor &&
                        board[row+3][col] == currentColor){
                    winner = currentColor;
                    return true;
                }
            }
        }
        //check upward diagonal
        for(int row = 3; row < board.length; row++){
            for(int col = 0; col < board[0].length - 3; col++){
                if (board[row][col] == currentColor   &&
                        board[row-1][col+1] == currentColor &&
                        board[row-2][col+2] == currentColor &&
                        board[row-3][col+3] == currentColor){
                    winner = currentColor;
                    return true;
                }
            }
        }
        //check downward diagonal
        for(int row = 0; row < board.length - 3; row++){
            for(int col = 0; col < board[0].length - 3; col++){
                if (board[row][col] == currentColor   &&
                        board[row+1][col+1] == currentColor &&
                        board[row+2][col+2] == currentColor &&
                        board[row+3][col+3] == currentColor){
                    winner = currentColor;
                    return true;
                }
            }
        }
        return false;

    }

    public Color getWinner() {
        return winner;
    }

    public void draw() {
        int numColumns = board[0].length;
        int numRows = board.length;
        // header row
        System.out.print("   ");
        for(int i = 0; i < numColumns; i++)
            System.out.print(i + " ");
        System.out.println();

        // actual board
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

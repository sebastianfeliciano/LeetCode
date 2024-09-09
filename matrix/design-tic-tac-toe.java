class TicTacToe {
    private int[] rows;
    private int[] columns;
    private int diagonal;
    private int antiDiagonal;

    public TicTacToe(int n) {
        rows = new int[n];
        columns = new int[n];
    }
    
    public int move(int row, int col, int player) {
        int playerNumber;
        if(player == 1){
            playerNumber = 1;
        } else {
            playerNumber = -1;
        }

        rows[row] += playerNumber;
        columns[col] += playerNumber;
        if(row == col) diagonal += playerNumber;
        if(row == rows.length - col - 1) antiDiagonal += playerNumber;

        int size = rows.length;
        
        if(Math.abs(rows[row]) == size || Math.abs(columns[col]) == size ||
        Math.abs(diagonal) == size || Math.abs(antiDiagonal) == size){
            return player;
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
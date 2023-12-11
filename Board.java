public class Board {
    private Piece[][] board = new Piece[8][8];

    public Board() {
        this.initialize();
    }

    private void initialize(){
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
                board[x][y] = null;
            }
        }

        // White pawns
        for(int x=0; x<8; x++){
            board[1][x] = new Pawn("white");
        }

        // Black pawns
        for(int x=0; x<8; x++){
            board[6][x] = new Pawn("black");
        }

        //Rooks
        board[0][0] = new Rook("white");
        board[0][7] = new Rook("white");
        board[7][7] = new Rook("black");
        board[7][0] = new Rook("black");

        //Knights
        board[0][1] = new Knight("white");
        board[0][6] = new Knight("white");
        board[7][6] = new Knight("black");
        board[7][1] = new Knight("black");

        //Bishops
        board[0][2] = new Bishop("white");
        board[0][5] = new Bishop("white");
        board[7][2] = new Bishop("black");
        board[7][5] = new Bishop("black");

        //Queens
        board[0][3] = new Queen("white");
        board[7][3] = new Queen("black");

        //Kings
        board[0][4] = new King("white");
        board[7][4] = new King("black");
    }

}

import Pieces.*;

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
            board[1][x] = new Pawn();
        }

        // Black pawns
        for(int x=0; x<8; x++){
            board[6][x] = new Pawn();
        }

        //Rooks
        board[0][0] = new Rook();
        board[0][7] = new Rook();
        board[7][7] = new Rook();
        board[7][0] = new Rook();

        //Knights
        board[0][1] = new Knight();
        board[0][6] = new Knight();
        board[7][6] = new Knight();
        board[7][1] = new Knight();

        //Bishops
        board[0][2] = new Bishop();
        board[0][5] = new Bishop();
        board[7][2] = new Bishop();
        board[7][5] = new Bishop();

        //Queens
        board[0][3] = new Queen();
        board[7][3] = new Queen();

        //Kings
        board[0][4] = new King();
        board[7][4] = new King();
    }

}

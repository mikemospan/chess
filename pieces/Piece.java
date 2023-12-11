package pieces;

public abstract class Piece {
    private int x;
    private int y;

    public void move(int x, int y) {
        if (canMove(x, y)) {
            setX(x);
            setY(y);
        }
    }

    public abstract boolean canMove(int x, int y);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

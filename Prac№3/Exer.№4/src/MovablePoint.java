public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Point (" + x + ", " + y + ")"
                + "\nxSpeed = " + xSpeed
                + "\nySpeed = " + ySpeed + '\n';
    }

    @Override
    public void moveUp() {
        y = ++y * ySpeed;
    }

    @Override
    public void moveDown() {
        y = --y * ySpeed;
    }

    @Override
    public void moveLeft() {
        x = --x * xSpeed;
    }

    @Override
    public void moveRight() {
        x = ++x * xSpeed;
    }
}

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String color;
        int radius;

        color = in.nextLine();
        radius = in.nextInt();

        Ball ballFirst = new Ball(color, radius);
        Ball ballSecond = new Ball("yellow");
        Ball ballThird = new Ball();

        ballThird.setColor("blue");
        ballThird.setRadius(9);

        System.out.println(ballFirst);
        System.out.println(ballSecond);
        System.out.println(ballThird);
    }
}

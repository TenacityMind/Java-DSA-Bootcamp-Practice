package solutions.conditional_loops;

public class DistanceBetweenTwoPoints {
    public static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
        // We will use the distance formula derived from Pythagorean theorem.
        // The formula for distance between two point (x1, y1) and (x2, y2) is Distance = sqrt( (x2-x1)^2 + (y2-y1)^2 )
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        x1 =3;
        y1 =4;
        x2 =4;
        y2 =3;
        System.out.println("The distance between two points is " + distanceBetweenTwoPoints(x1, y1, x2, y2));
        x1 =3;
        y1 =4;
        x2 =7;
        y2 =7;
        System.out.println("The distance between two points is " + distanceBetweenTwoPoints(x1, y1, x2, y2));

    }
}

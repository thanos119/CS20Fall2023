public class Circlepart1 {
    private double radius;

    public Circlepart1() {
        this.radius = 0.0; // Default constructor sets the radius to 0
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

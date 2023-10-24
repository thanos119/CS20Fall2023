package Circle;

public class Circlepart1 {
    private double radius;

    // Default constructor
    public Circlepart1() {
        this.radius = 0.0; // Default constructor sets the radius to 0
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circlepart1 spot = new Circlepart1();

        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
    }
}

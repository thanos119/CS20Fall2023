package Circle;

public class Circlepart3 
{
	
    private double radius;

    // Default constructor
    public Circlepart3() {
        this.radius = 0.0; // Default constructor sets the radius to 0
    }

    // Overloaded constructor
    public Circlepart3(double radius) {
        this.radius = radius;
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

    public static void displayAreaFormula() {
        System.out.println("The area of a circle is calculated using the formula: π * r^2");
    }
}


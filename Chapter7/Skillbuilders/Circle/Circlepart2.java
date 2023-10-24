package Circle;

public class Circlepart2 
{
	
    private double radius;

    // Default constructor
    public Circlepart2() {
        this.radius = 0.0; // Default constructor sets the radius to 0
    }

    // Overloaded constructor
    public Circlepart2(double radius) {
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
}
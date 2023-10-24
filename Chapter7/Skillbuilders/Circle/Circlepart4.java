package Circle;

public class Circlepart4 
{
	
    private double radius;

    // Default constructor
    public Circlepart4() {
        this.radius = 0.0; // Default constructor sets the radius to 0
    }

    // Overloaded constructor
    public Circlepart4(double radius) {
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

    // Override the toString() method
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    // Override the equals() method to compare Circle objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circlepart4 otherCircle = (Circlepart4) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }
}


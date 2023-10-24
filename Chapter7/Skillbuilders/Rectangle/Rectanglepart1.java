package Rectangle;

public class Rectanglepart1 {
    private double length;
    private double width;

    // Default constructor
    public Rectanglepart1() {
        this.length = 0.0;
        this.width = 0.0;
    }

    // Overloaded constructor with parameters for length and width
    public Rectanglepart1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


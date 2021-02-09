 abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Circle extends GeometricObject{
     private double radius;
     public Circle(){}
     public Circle(double radius){
         this.radius = radius;
     }
     public double getRadius() {
         return radius;
     }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

class Rectangle extends GeometricObject{
     private double size1;
     private double size2;
     public Rectangle(double size1, double size2){
         this.size1 = size1;
         this.size2 = size2;
     }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }
    public double getArea() {
        return size1*size2;
    }

    @Override
    public double getPerimeter() {
        return (size1+size2)*2;
    }
}


public class Main {
    public static void main(String[] args) {
        // Create an array of four objects
        GeometricObject[] array = {new Circle(5), new Circle(8),
                new Rectangle(3, 4), new Rectangle(4, 2)};

        // Display results
        System.out.println("Total area: " + sumArea(array));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}

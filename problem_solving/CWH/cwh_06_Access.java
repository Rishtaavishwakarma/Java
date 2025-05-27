// create a class cylinder and use getter and setters to set its radius and height 
// use ➊ to calculate surface and volume of the cylinder 
// Use a constructor and repeat ➊
// Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 
// Repeat ➊ for a sphere

class Cylinder {

    private int radius;
    private int height;
    private double pi = 3.14;

    public Cylinder(int radius, int height) {
        setHeight(height);
        setRadius(radius);

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

    public double surface() {
        return 2 * pi * radius * (radius + height);
    }

    public double volume() {
        return pi * radius * radius * height;
    }

}

class Rectangle {

    private int length;
    private int breadth;

    // Default constructor
    public Rectangle() {
        this.length = 5;
        this.breadth = 5;
    }

    // Overloaded constructor
    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    // Area = length × breadth
    public int area() {
        return length * breadth;
    }

    // Perimeter = 2 × (length + breadth)
    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Sphere {

    private int radius;
    private double pi = 3.14;

    public Sphere(int radius) {
        this.radius = radius;
    }

    // Surface Area = 4πr²
    public double surface() {
        return 4 * pi * radius * radius;
    }

    // Volume = 4/3 πr³
    public double volume() {
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }
}

class cwh_06_Access {

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(7, 10);
        System.out.println("Cylinder Surface Area: " + cyl.surface());
        System.out.println("Cylinder Volume: " + cyl.volume());
        Rectangle rect1 = new Rectangle();
        System.out.println("\nRectangle (5x5) Area: " + rect1.area());
        System.out.println("Rectangle (5x5) Perimeter: " + rect1.perimeter());

        // Rectangle custom
        Rectangle rect2 = new Rectangle(8, 6);
        System.out.println("\nRectangle (8x6) Area: " + rect2.area());
        System.out.println("Rectangle (8x6) Perimeter: " + rect2.perimeter());

        // Sphere
        Sphere sp = new Sphere(5);
        System.out.println("\nSphere Surface Area: " + sp.surface());
        System.out.println("Sphere Volume: " + sp.volume());
    }
}

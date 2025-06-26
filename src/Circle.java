public class Circle implements Prototype{
    int radius;
    String colour;

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    // Copy constructor
    public Circle(Circle circle)
    {
        // setting values of existing circle object inside the new Circle object created through copy constructor
        // as this.radius means radius of Circle object created through this copy constructor
        this.radius=circle.radius;
        this.colour= circle.colour;
    }

    @Override
    public Prototype clone() {
        // pass values of existing Circle object created through main constructor (passed as this) into new object
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}

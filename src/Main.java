import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(10,"Green");
        //need to cast because clone() returns Prototype
        //Java won’t assume the result is a Circle unless you explicitly cast
        Circle newcircle=(Circle) circle.clone();
        System.out.println(circle);
        System.out.println(newcircle);
        // Will print false as both are different objects
        System.out.println(circle==newcircle);
    }
}
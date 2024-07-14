package oops;

interface Shape {
    void draw() ;
    double area() ;
}

class Rectangle implements Shape {

    private double  length ;
    private double width ;
    Rectangle(double x, double y) {
        length = x ;
        width = y ;
    }
    public void draw() {
        System.out.println();
    }
    public double area() {
        return (double)length*width ;
    }
}

public class Interface {
    public static void main(String[] args) {
        
    }
}

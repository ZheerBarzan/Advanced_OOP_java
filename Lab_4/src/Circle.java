public class Circle extends Shape {

    protected double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius= radius;

    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(getRadius(),2);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * getRadius();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                "}\n";
    }
}

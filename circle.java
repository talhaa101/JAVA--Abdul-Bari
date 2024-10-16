
class circle_info {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class circle {

    public static void main(String[] args) {
        circle_info c1 = new circle_info();
        c1.radius = 7;

        System.out.println("Area:" + c1.area());
        System.out.println("Perimeter:" + c1.perimeter());
        System.out.println("Circumference:" + c1.circumference());
    }

}
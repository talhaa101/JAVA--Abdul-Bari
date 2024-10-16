
class Cylinder_info {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double drumArea() {
        return 2 * lidArea() + perimeter() * height;
    }

    public double volume() {
        return lidArea() * height;
    }
}

public class Cylinder {

    public static void main(String[] args) {

        Cylinder_info c = new Cylinder_info();
        c.radius = 10;
        c.height = 15;

        System.out.println("LidArea " + c.lidArea());
        System.out.println("Circumference " + c.perimeter());
        System.out.println("totalSurfaceArea " + c.drumArea());
        System.out.println("Volume " + c.volume());

    }

}
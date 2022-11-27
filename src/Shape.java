public final class Shape {
    Shape() {

    }
    public static class Rectangle {
        double height;
        double width;
        Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }
    }
    public static class Circle {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
    }
}

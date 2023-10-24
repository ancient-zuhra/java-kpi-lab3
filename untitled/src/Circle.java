public abstract class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 5;
    }

    public Circle(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.round(Math.pow(this.getRadius(), 2) * Math.PI * 1000.0) / 1000.0;
    }

    public double getCircleLength() {
        return Math.round(this.getRadius() * 2 * Math.PI * 1000.0) / 1000.0;
    }

    public Circle setCoords(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        return this;
    }

    @Override
    public abstract String toString();
}

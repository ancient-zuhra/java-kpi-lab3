public class BlackCircle extends Circle {
    private final String color;

    public BlackCircle (){
        super();
        this.color = "Black";
    }

    public BlackCircle(Circle circle){
        super(circle);
        this.color = "Black";
    }
    public BlackCircle(double x, double y, double radius){
        this.setCoords(x, y, radius);
        this.color = "Black";
    }
    @Override
    public String toString(){
        return "\nShape: Circle\n" +
                "Color: " + this.color + "\n" +
                "Center: x: "+ this.getX()+ ", y: " + this.getY() + "\n" +
                "Radius: " + this.getRadius()+"\n" +
                "Circle length: " + Double.toString(this.getCircleLength()) + "\n" +
                "Circle area: " + Double.toString(this.getArea()) + "\n";
    };
}

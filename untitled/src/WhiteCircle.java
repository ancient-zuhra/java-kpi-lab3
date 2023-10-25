public class WhiteCircle extends Circle {
    private final String color;

    public WhiteCircle (){
        super();
        this.color = "white";
    }

    public WhiteCircle(Circle circle){
        super(circle);
        this.color = "white";
    }
    public WhiteCircle(double x, double y, double radius){
        this.setCoords(x, y, radius);
        this.color = "white";
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
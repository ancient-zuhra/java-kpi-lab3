public class Client {
    private final Triangle triangle;
    private final Circle circle;

    public Client(AbstractFactory factory){
        this.circle = factory.createCircle();
        this.triangle = factory.createTriangle();
    }

    public void print(){
        System.out.println(this.circle + "\n" + this.triangle);
    }

    public void setCircle(double x, double y, double radius){
        this.circle.setCoords(x,y,radius);
    }

    public void setTriangle(double[][] points){
        this.triangle.SetPoints(points);
    }

}

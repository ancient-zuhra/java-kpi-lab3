public class BlackFactory implements AbstractFactory {
   @Override
    public Triangle createTriangle(){
       return new BlackTriangle();
   }
   @Override
    public Circle createCircle(){
       return new BlackCircle();
   }
}

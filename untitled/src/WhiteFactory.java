public class WhiteFactory implements AbstractFactory {
   @Override
    public Triangle createTriangle(){
       return new WhiteTriangle();
   }
   @Override
    public Circle createCircle(){
       return new WhiteCircle();
   }
}

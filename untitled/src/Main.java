// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static void main(String[] args) {

        double[][] points = {{1,0,6}, {0,1,0}, {0,0,1}};
//        BlackTriangle blackTriangle = new BlackTriangle(points);
//        WhiteTriangle whiteTriangle = new WhiteTriangle(points);
//
//
//        double[] point = {1,0,0};
//        blackTriangle.SetPoint(point, 0);
//
//        WhiteCircle whiteCircle = new WhiteCircle(1.0, 0.0, 4.0);
//
//        System.out.println(blackTriangle);
//        System.out.println(whiteTriangle);
//
//        System.out.println(blackTriangle.GetArea());
//        System.out.println(whiteTriangle.GetArea());
//
//        System.out.println(blackTriangle.GetMedianPoint(0)[2]);
//        System.out.println(whiteTriangle.GetMedianPoint(0)[1]);
//
//        System.out.println(whiteCircle);
        Client client = new Client(new WhiteFactory());
//        client.print();

        client.setCircle(1.0, 0.0, 4.0);
        client.setTriangle(points);
        client.print();
    }
}
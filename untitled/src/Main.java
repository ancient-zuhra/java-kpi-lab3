// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static void main(String[] args) {

        double[][] points = {{1,0,6}, {0,1,0}, {0,0,1}}; //тестування
        BlackTriangle Black = new BlackTriangle(points);
        WhiteTriangle White = new WhiteTriangle(points);

        double[] point = {1,0,0};
        Black.SetPoint(point, 0);

        System.out.println(Black);
        System.out.println(White);

        System.out.println(Black.GetArea());
        System.out.println(White.GetArea());

        System.out.println(Black.GetMedianPoint(0)[2]);
        System.out.println(White.GetMedianPoint(0)[1]);
    }
}
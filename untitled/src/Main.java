// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static void main(String[] args) {

        double[][] points = {{1,0,6}, {0,1,0}, {0,0,1}};
        Client client = new Client(new WhiteFactory());

        client.setCircle(1.0, 0.0, 4.0);
        client.setTriangle(points);
        client.print();

        Client client2 = new Client(new BlackFactory());

        client2.setCircle(1.0, 0.0, 4.0);
        client2.setTriangle(points);
        client2.print();
    }
}
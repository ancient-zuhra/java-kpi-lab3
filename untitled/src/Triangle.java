
public abstract class Triangle { //Created by Zhenia Dude
    protected int Dim;
    protected double[][] Points;
    protected double[] Angles;
    protected double[] EdgesLength;



    public Triangle(){
        this.Dim = 2;
        this.Points = new double[3][this.Dim];
        for(int i=0; i<this.Dim; i++){
            this.Points[0][i] = i;
            this.Points[1][i] = i+1;
            this.Points[2][i] = i+2;
        }
    }

    public Triangle(int Dim){
        this.Dim = Dim;
        this.Points = new double[3][Dim];
        for(int i=0; i<Dim; i++){
            this.Points[0][i] = i;
            this.Points[1][i] = i+1;
            this.Points[2][i] = i+2;
        }
    }
    public Triangle(double[][] Points){
        this.Dim = Points[0].length;
        this.Points = new double[3][Dim];
        this.Points[0] = Points[0].clone();
        this.Points[1] = Points[1].clone();
        this.Points[2] = Points[2].clone();

    }

    public Triangle(Triangle a){
        this.Dim = a.Dim;
        double[][] temp = a.GetPoints();
        this.Points = new double[3][Dim];
        this.Points[0] = temp[0].clone();
        this.Points[1] = temp[1].clone();
        this.Points[2] = temp[2].clone();

    }
    public double GetArea(){
        double[] EdgesLength = new double[3];
        double p;
        double area;
        EdgesLength = Triangle.CalcEdgesLength(this.Points, this.Dim);
        p = (EdgesLength[0] + EdgesLength[1] + EdgesLength[2])/2;
        area = Math.sqrt(p*(p - EdgesLength[0])*(p - EdgesLength[1])*(p - EdgesLength[2])); //формула герона
        return area;
    }
    public abstract String GetColor();
    public double[] GetPoint(int index){
        return this.Points[index];
    }
    public double[][] GetPoints(){
        return this.Points;
    }
    public int GetDim(){
        return this.Dim;
    }
    public double[] GetAngles(){
        return this.Angles;
    }

    public double[] GetEdgesLength(){
        return this.EdgesLength;
    }
    public double[] GetMedianPoint(int pointIndex){
        int index1 = pointIndex % 3 + 1;
        int index2 = pointIndex % 3 + 2;
        double[] vertex1 = this.Points[index1].clone();
        double[] vertex2 = this.Points[index2].clone();
        double[] MedianPoint = new double[this.Dim];

        for(int i =0; i<this.Dim; i++)
            MedianPoint[i] = (vertex1[i] + vertex2[i])/2;

        return MedianPoint;
    }
    //public Triangle[] MakeBisector(int pointIndex){
    //    Triangle[] temp = {new BlackTriangle(), new BlackTriangle()};
    //    return temp;
    //}
    //public Triangle[] MakeVertical(int pointIndex){
    //   Triangle[] temp = {new BlackTriangle(), new BlackTriangle()};
    //   return temp;
    //}
    public abstract Triangle SetPoint(double[] Point, int index);
    public abstract Triangle SetPoints(double[][] Points);
    public abstract Triangle CalculateAttributes();

                                        @Override
                                        public abstract String toString();




    public static double[] CalcAngles(final double[][] Points, int Dim){
        double[] Angles = new double[3];
        double[] Length = Triangle.CalcEdgesLength(Points, Dim);
        Angles[0] = Math.acos((Math.pow(Length[1], 2) + Math.pow(Length[2], 2) - Math.pow(Length[0], 2))/(2*Length[1]*Length[2])); //ця формула випливає з теореми косинусів
        Angles[1] = Math.acos((Math.pow(Length[0], 2) + Math.pow(Length[2], 2) - Math.pow(Length[1], 2))/(2*Length[0]*Length[2]));
        Angles[2] = Math.acos((Math.pow(Length[1], 2) + Math.pow(Length[0], 2) - Math.pow(Length[2], 2))/(2*Length[0]*Length[1]));
        return Angles;
    }

    public static double[] CalcEdgesLength(final double[][] Points, int Dim){
        double[] EdgesLength = new double[3];
        for(int i = 0; i < Dim; i++) {
            EdgesLength[0] += Math.pow(Points[1][i] - Points[2][i], 2);
            EdgesLength[1] += Math.pow(Points[0][i] - Points[2][i], 2);
            EdgesLength[2] += Math.pow(Points[1][i] - Points[0][i], 2);
        }
        EdgesLength[0] = Math.pow(EdgesLength[0], 0.5);
        EdgesLength[1] = Math.pow(EdgesLength[1], 0.5);
        EdgesLength[2] = Math.pow(EdgesLength[2], 0.5);
        return EdgesLength;
    }

    protected static double round(double value, int places) {  // просте округлення
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}

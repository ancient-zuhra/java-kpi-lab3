public class WhiteTriangle extends Triangle {

    private String color;

    public WhiteTriangle(){
        super();
        this.color = "White";
    }
    public WhiteTriangle(int Dim){
        super(Dim);
        this.color = "White";
    }
    public WhiteTriangle(Triangle input){
        super(input);
        this.color = "White";
    }
    public WhiteTriangle(double[][] Points){
        super(Points);
        this.color = "White";
    }
    public String GetColor(){
        return this.color;
    }
    public WhiteTriangle SetPoint(double[] Point, int index){
        this.Points[index] = Point.clone();
        return this;
    }
    public WhiteTriangle SetPoints(double[][] Points){
        this.Points[0] = Points[0].clone();
        this.Points[1] = Points[1].clone();
        this.Points[2] = Points[2].clone();
        return this;
    }
    public WhiteTriangle Triangle2Black(Triangle input){
        WhiteTriangle output = new WhiteTriangle(input);
        return output;
    }
    public WhiteTriangle CalculateAttributes(){
        this.Angles = BlackTriangle.CalcAngles(this.Points, this.Dim);
        this.EdgesLength = BlackTriangle.CalcEdgesLength(this.Points, this.Dim);
        return this;
    }

    @Override
    public String toString()
    {
        String str;
        this.CalculateAttributes();
        str = "Shape: Triangle\n";
        str += "\nColor = "+ this.color + "\n";
        str += "Angles (degrees) = " + round(this.Angles[0] * 57.3, 2) + ", " + round(this.Angles[1] * 57.3, 2) + ", " + round(this.Angles[2] * 57.3, 2)+"\n";
        str += "Edges Length = " + round(this.EdgesLength[0], 2) + ", " + round(this.EdgesLength[1], 2) + ", " + round(this.EdgesLength[2], 2)+"\n";
        str += "Coordinates:\n";
        str += "Point A = " + round(this.Points[0][0], 2);
        for(int i = 1; i < Dim; i++)
            str += ", " + round(this.Points[0][i], 2);

        str += "\nPoint B = " + round(this.Points[1][0], 2);
        for(int i = 1; i < Dim; i++)
            str += ", " + round(this.Points[1][i], 2);

        str += "\nPoint C = " + round(this.Points[2][0], 2);
        for(int i = 1; i < Dim; i++)
            str += ", " + round(this.Points[2][i], 2);

        str+="\n";

        return str;
    }



}

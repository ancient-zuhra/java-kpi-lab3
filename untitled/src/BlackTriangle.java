class BlackTriangle extends Triangle{
    private String color;

    public BlackTriangle(){
        super();
        this.color = "Black";
    }
    public BlackTriangle(int Dim){
        super(Dim);
        this.color = "Black";
    }
    public BlackTriangle(Triangle input){
        super(input);
        this.color = "Black";
    }
    public BlackTriangle(double[][] Points){
        super(Points);
        this.color = "Black";
    }
    public String GetColor(){
        return this.color;
    }
    public BlackTriangle SetPoint(double[] Point, int index){
        this.Points[index] = Point.clone();
        return this;
    }
    public BlackTriangle SetPoints(double[][] Points){
        this.Points[0] = Points[0].clone();
        this.Points[1] = Points[1].clone();
        this.Points[2] = Points[2].clone();
        return this;
    }
    public BlackTriangle Triangle2Black(Triangle input){
        BlackTriangle output = new BlackTriangle(input);
        return output;
    }
    public BlackTriangle CalculateAttributes(){
        this.Angles = BlackTriangle.CalcAngles(this.Points, this.Dim);
        this.EdgesLength = BlackTriangle.CalcEdgesLength(this.Points, this.Dim);
        return this;
    }

    @Override
    public String toString()
    {
        String str;
        this.CalculateAttributes();
        str = "\nColor = "+ this.color + "\n";
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

        str += "\n";

        return str;
    }

}

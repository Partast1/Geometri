public class Triangle extends Figure {
    public Triangle(float A, float B, float C) {
        super(A, B, C);
    }
    protected float PerimeterCalculate()
    {
        float PerResult = (getA() * getB() * getC());
        return PerResult;
    }
    protected float ArealCalculate(){
        float arealResult = (float) (0.5 * getA() * getB());
        return  arealResult;
    }
}

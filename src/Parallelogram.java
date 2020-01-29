public class Parallelogram extends Square {
    private float b;
    private float h;

    public float getB() {
        return b;
    }
    public float getH() {
        return h;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setH(float h) {
        this.h = h;
    }

    public Parallelogram(float A, float B) {
        super(A);
        setB(B);
    }
    protected float PerimeterCalculate()
    {
        float PerResult = ((2 * getA() ) + (2 * b));
        return PerResult;
    }
    protected float ArealCalculate(){
        float arealResult = (float) (getA() * b * Math.sin(0));
        return  arealResult;
    }
}

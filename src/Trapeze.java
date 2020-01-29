public class Trapeze extends Square {

    private float b;
    private float c;
    private float d;
    private float A;
    private float B;

    public float getB() { return b;}
    public float getC() { return c; }
    public float getD() { return d; }
    public float GetA() { return A;}
    public float GetB(){ return B;}

    public void setB(float b) {
        this.b = b;
    }
    public void setC(float c) {
        this.c = c;
    }
    public void setD(float d) {
        this.d = d;
    }
    public void SetA(float A){ this.A = A;}
    public void SetB(float B){ this.B = B;}


    public Trapeze(float A, float B, float C, float D ,float A2, float B2) {
        super(A);
        setB(B);
        setC(C);
        setD(D);
        SetA(A2);
        SetB(B2);
    }
    public Trapeze(float A, float B, float C, float D) {
        super(A);
        setB(B);
        setC(C);
        setD(D);
    }

    protected float PerimeterCalculate(){
        float perResult = (float) (getA() + b + findingHeight() * (1 / Math.sin(GetA()) + 1 / Math.sin(getB()));
        return perResult;
    }

    protected float ArealCalculate(){
        float perResult = (float) (0.5 * ( getA() + c) * findingHeight());
        return perResult;
    }
    public float FindingS(){
        float s = (getA() + b) - (c + d) / 2;
        return s;
    }
    public float findingHeight(){
        float height = (float) (2 / (getA() - c) * Math.pow(FindingS(),  (FindingS() - getA() + c) * (FindingS() - c) * (FindingS() - d));
    }

}

public class Square
{
    private float a;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }
    public Square(float A){
        setA(A);
    }
    protected float PerimeterCalculate(){
        float perResult = 4 * a;
        return perResult;
    }

    protected float ArealCalculate(){
        float arealResult = (float) Math.pow(a, 2);
        return arealResult;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + getA() +
                '}';
    }
}

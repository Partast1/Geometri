public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);
        Square s2 = new Square(7);

        Square s3 = new Trapeze(3,4,7,2, 7, 10);
        Square s4 = new Parallelogram(4, 8);
        Figure f = new Figure(4,6,9);
        System.out.print("Areal: " + s.ArealCalculate() + "Perimeter: " + s.PerimeterCalculate());
        System.out.print("\n Areal: " + s2.ArealCalculate() + "Perimeter: " + s2.PerimeterCalculate());

        System.out.print("\n Areal: " + s3.ArealCalculate() + "Perimeter: " + s3.PerimeterCalculate());

        System.out.print("\n Areal: " + s4.ArealCalculate() + "Perimeter: " + s4.PerimeterCalculate());
    }

}

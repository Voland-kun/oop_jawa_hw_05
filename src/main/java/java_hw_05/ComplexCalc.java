package java_hw_05;

public class ComplexCalc extends CalcModel<Double, Complex> {

    @Override
    public Complex addition() {
        return new Complex((x1 + x2),(y1 + y2));
    }

    @Override
    public Complex subtraction() {
        return new Complex((x1 - x2),(y1 - y2));
    }

    @Override
    public Complex multiplication() {
        return new Complex((x1 * x2 - y1 * y2),(y1 * x2 + x1 * y2));
    }

    @Override
    public Complex division() {
        return new Complex((x1 * x2 + y1 * y2)/(x2 * x2 + y2 * y2),
                (y1 * x2 - x1 * y2)/(x2 * x2 + y2 * y2));
    }

    @Override
    public void setX1(Complex a) {
        super.x1 = a.getReal();
    }

    @Override
    public void setY1(Complex a) {
        super.y1 = a.getImaginary();
    }

    @Override
    public void setX2(Complex b) {
        super.x2 = b.getReal();
    }

    @Override
    public void setY2(Complex b) {
        super.y2 = b.getImaginary();
    }
}

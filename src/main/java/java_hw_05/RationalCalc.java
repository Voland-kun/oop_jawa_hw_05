package java_hw_05;

public class RationalCalc extends CalcModel<Integer, Rational>{

    @Override
    public Rational addition() {
        return new Rational(x1*lcm(y1,y2)/y1+x2*lcm(y1,y2)/y2,lcm(y1,y2));
    }

    @Override
    public Rational subtraction() {
        return new Rational(x1*lcm(y1,y2)/y1-x2*lcm(y1,y2)/y2,lcm(y1,y2));
    }

    @Override
    public Rational multiplication() {
        return new Rational(x1*x2,y1*y2);
    }

    @Override
    public Rational division() {
        return new Rational(x1*y2,y1*x2);

    }

    @Override
    public void setX1(Rational a) {
        super.x1 = a.getNumerator();
    }

    @Override
    public void setY1(Rational a) {
        super.y1 = a.getDenominator();
    }

    @Override
    public void setX2(Rational b) {
        super.x2 = b.getNumerator();
    }

    @Override
    public void setY2(Rational b) {
        super.y2 = b.getDenominator();
    }

    int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }

    int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }
}

package java_hw_05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Rational extends Numbers {
    public int numerator;
    public int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        }

    @Override
    public String toString() {
        if (denominator < 0 || numerator < 0) {
            return Math.abs(numerator) + "/" + Math.abs(denominator);
        } else if (denominator < 0 && numerator > 0) {
            return "-" + numerator + "/" + (denominator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}

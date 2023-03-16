package java_hw_05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Complex extends Numbers {
    public double real;
    public double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return "(" + real + "+" + imaginary + "i)";
        } else {
            return "(" + real + "+" + imaginary + "i)";
        }
    }

}

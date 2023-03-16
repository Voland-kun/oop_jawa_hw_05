package java_hw_05;

public class PresenterComplex extends ParentPresenter<ComplexCalc, Complex> {

    public PresenterComplex(ComplexCalc m, View v) {
        this.model = m;
        this.view = v;
    }

    @Override
    public void buttonClick() {
        Complex a = view.getValueComplex("Введите первое число. ");
        Complex b = view.getValueComplex("Введите второе число. ");
        selectAction(a,b);
    }

    @Override
    public void selectAction(Complex a, Complex b) {
        model.setX1(a);
        model.setY1(a);
        model.setX2(b);
        model.setY2(b);
        Complex result;
        switch (view.selectAction()) {
            case "+":
                result = (model.addition());
                view.print(result, "Результат: ");
                Logger.logging(a + "+" + b + "=" + result + "\n");
                break;
            case "-":
                result = (model.subtraction());
                view.print(result, "Результат: ");
                Logger.logging(a + "-" + b + "=" + result);
                break;
            case "*":
                result = (model.multiplication());
                view.print(result, "Результат: ");
                Logger.logging(a + "*" + b + "=" + result);
                break;
            case "/":
                result = (model.division());
                view.print(result, "Результат: ");
                Logger.logging(a + "/" + b + "=" + result);
                break;
        }
    }
}


package java_hw_05;

public class PresenterRational extends ParentPresenter<RationalCalc, Rational>{

    public PresenterRational(RationalCalc m, View v) {
        this.model = m;
        this.view = v;
    }
    @Override
    public void buttonClick() {
        Rational a = view.getValueRational("Введите первое число. ");
        Rational b = view.getValueRational("Введите второе число. ");
        selectAction(a,b);
    }

    @Override
    public void selectAction(Rational a, Rational b) {
        model.setX1(a);
        model.setY1(a);
        model.setX2(b);
        model.setY2(b);
        Rational result;
        switch (view.selectAction()) {
            case "+":
                result = (model.addition());
                view.print(result, "Результат: ");
                Logger.logging(a + "+" + b + "=" + result + "\n");
                break;
            case "-":
                result = (model.subtraction());
                view.print(result, "Результат: ");
                Logger.logging(a + "-" + b + "=" + result + "\n");
                break;
            case "*":
                result = (model.multiplication());
                view.print(result, "Результат: ");
                Logger.logging(a + "*" + b + "=" + result + "\n");
                break;
            case "/":
                result = (model.division());
                view.print(result, "Результат: ");
                Logger.logging(a + "/" + b + "=" + result + "\n");
                break;
        }
    }
}


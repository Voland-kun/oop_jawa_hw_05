package java_hw_05;

public class PresenterPresenter {
    View view;

    public PresenterPresenter(View v) {
        view = v;
    }
    //наверное можно было это прописать в main но не уверен
    public void presentation(){
        switch (view.selectMode()) {
            case 1:
                View v1 = new View<Complex>();
                PresenterComplex p1 = new PresenterComplex(new ComplexCalc(),v1);
                p1.buttonClick();
                break;
            case 2:
                View v2 = new View<Rational>();
                PresenterRational p2 = new PresenterRational(new RationalCalc(),v2);
                p2.buttonClick();
                break;
        }
    }
}

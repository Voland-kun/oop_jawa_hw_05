package java_hw_05;

interface Presenter <E extends Numbers> {

    void buttonClick();

    void selectAction(E a, E b);
}

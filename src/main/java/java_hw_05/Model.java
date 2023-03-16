package java_hw_05;

interface Model<T extends Numbers> {
    T addition();
    T subtraction();
    T  multiplication();
    T division();
    void setX1(T value);
    void setY1(T value);
    void setX2(T value);
    void setY2(T value);

}

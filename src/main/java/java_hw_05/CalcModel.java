package java_hw_05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class CalcModel<E, T extends Numbers> implements Model<T>{
    protected E x1, x2, y1, y2;
}


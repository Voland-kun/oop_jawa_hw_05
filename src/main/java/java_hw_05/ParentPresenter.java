package java_hw_05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class ParentPresenter<C extends CalcModel, E extends Numbers> implements Presenter<E> {
    View view;
    C model;

    public ParentPresenter(C m, View v) {
        model = m;
        view = v;
    }

    public ParentPresenter() {}

}

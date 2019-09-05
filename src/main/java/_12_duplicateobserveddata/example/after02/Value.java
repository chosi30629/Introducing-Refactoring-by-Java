package _12_duplicateobserveddata.example.after02;


import java.util.ArrayList;
import java.util.List;


public class Value {
    private int value = 0;
    private final List<ValueListener> listeners = new ArrayList<ValueListener>();


    public Value(int value) {
        this.value = value;
    }


    public void setValue(int value) {
        this.value = value;
        notifyToListeners();
    }

    public int getValue() {
        return value;
    }

    public void addValueListener(ValueListener listener) {
        listeners.add(listener);
    }

    public boolean removeValueListener(ValueListener listener) {
        return listeners.remove(listener);
    }

    public void notifyToListeners() {
        for (ValueListener listener : listeners) {
            listener.valueChanged(new ValueChangeEvent(this));
        }
    }

}

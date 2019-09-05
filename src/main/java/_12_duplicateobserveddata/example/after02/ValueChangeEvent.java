package _12_duplicateobserveddata.example.after02;


public class ValueChangeEvent {
    private final Value source;


    public ValueChangeEvent(Value source) {
        this.source = source;
    }


    public Value getSource() {
        return source;
    }

}

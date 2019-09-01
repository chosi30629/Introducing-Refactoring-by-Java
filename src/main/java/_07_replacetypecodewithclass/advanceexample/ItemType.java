package _07_replacetypecodewithclass.advanceexample;


public enum ItemType {
    BOOK(0),
    DVD(1),
    SOFTWARE(2);

    private final int typecode;

    private ItemType(int typecode) {
        this.typecode = typecode;
    }

    public int getTypecode() {
        return typecode;
    }

}

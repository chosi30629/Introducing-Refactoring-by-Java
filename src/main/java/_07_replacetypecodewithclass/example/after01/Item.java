package _07_replacetypecodewithclass.example.after01;


public class Item {
    public static final int TYPECODE_BOOK = ItemType.BOOK.getTypecode();
    public static final int TYPECODE_DVD = ItemType.DVD.getTypecode();
    public static final int TYPECODE_SOFTWARE = ItemType.SOFTWARE.getTypecode();


    private final ItemType itemType;
    private final String title;
    private final int price;


    public Item(int typecode, String title, int price) {
        this.itemType = ItemType.getItemType(typecode);
        this.title = title;
        this.price = price;
    }


    public int getTypecode() {
        return itemType.getTypecode();
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "[ "
                + getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }

}

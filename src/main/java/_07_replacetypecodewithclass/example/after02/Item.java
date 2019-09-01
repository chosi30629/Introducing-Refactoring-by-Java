package _07_replacetypecodewithclass.example.after02;


public class Item {
    private final ItemType itemType;
    private final String title;
    private final int price;


    public Item(ItemType itemType, String title, int price) {
        this.itemType = itemType;
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

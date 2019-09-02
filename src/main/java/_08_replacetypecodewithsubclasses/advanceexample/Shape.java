package _08_replacetypecodewithsubclasses.advanceexample;


/**
 * 클래스명 변경
 *  - Shape 클래스 메서드는 추상 메서드이므로 Shape 는 추상 클래스가 된다.
 *  - 추상 클래스임을 알기 쉽게 Shape 라는 이름을 AbstractShape 로 바꾸는 것도 한 가지 방법이다.
 *  - 이것이 클래스명 변경이라는 리팩토링이다.
 */
public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int startx;
    private final int starty;
    private final int endx;
    private final int endy;


    protected Shape(int startx, int starty, int endx, int endy) {
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }


    /**
     * 메서드명 변경
     *  - createShape 메서드의 반환 타입은 Shape 이다.
     *  - 따라서 메서드명에 xxxShape 를 포함하지 않아도 된다,
     *  - createShape 메서드의 이름을 create 로 바꾸는 식의 리팩토링을 메서드명 변경이라고 한다.
     */
    public static Shape createShape(ShapeFactory factory, int startx, int starty, int endx, int endy) {
        return factory.create(startx, starty, endx, endy);
    }

    public abstract int getTypecode();

    public abstract String getName();

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startx + ", " + starty + ")-"
                + "(" + endx + ", " + endy + ") ]";
    }

    public abstract void draw();

    public static ShapeLine createShapeLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static ShapeRectangle createShapeRectagle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static ShapeOval createShapeOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }

}

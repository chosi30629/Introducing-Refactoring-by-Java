package _11_replaceconstructorwithfactorymethod.example01.before;


public class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int typecode;
    private final int startx;
    private final int starty;
    private final int endx;
    private final int endy;


    public Shape(int typecode, int startx, int starty, int endx, int endy) {
        this.typecode = typecode;
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }


    public int getTypecode() {
        return typecode;
    }

    public String getName() {
        switch (typecode) {
            case TYPECODE_LINE:
                return "LINE";
            case TYPECODE_RECTANGLE:
                return "RECTANGLE";
            case TYPECODE_OVAL:
                return "OVAL";
            default:
                return null;
        }
    }

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startx + ", " + starty + ")-"
                + "(" + endx + ", " + endy + ") ]";
    }

    public void draw() {
        switch (typecode) {
            case TYPECODE_LINE:
                drawLine();
                break;
            case TYPECODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPECODE_OVAL:
                drawOval();
                break;
            default:
                ;
        }
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
    }


    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
    }

    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
    }

}

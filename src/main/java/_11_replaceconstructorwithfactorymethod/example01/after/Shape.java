package _11_replaceconstructorwithfactorymethod.example01.after;


public abstract class Shape {
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


    public static Shape createLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static Shape createRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static Shape createOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }

    public abstract String getName();

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startx + ", " + starty + ")-"
                + "(" + endx + ", " + endy + ") ]";
    }

    public abstract void draw();

}

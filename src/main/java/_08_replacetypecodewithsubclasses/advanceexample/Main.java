package _08_replacetypecodewithsubclasses.advanceexample;


public class Main {

    public static void main(String[] args) {
        /*
        팩토리 메서드로 switch 문을 없도록 했지만 필요 이상으로 코드가 복잡해짐.
        아무리 switch 문을 삭제하고 싶다고 해도 이건 너무 지나치다.
        리팩토링을 한다고 다 좋은 건 아니다.
        균형을 잘 생각해서 실행해야 한다.

        Shape line = Shape.createShape(ShapeFactory.LineFactory.getInstance(), 0, 0 ,100 ,200);
        Shape rectangle = Shape.createShape(ShapeFactory.RectangleFactory.getInstance(), 10, 20, 30, 40);
        Shape oval = Shape.createShape(ShapeFactory.OvalFactory.getInstance(), 100, 200, 300, 400);
        */

        /*
        팩토리 메서드로 switch 문을 없애기 위해 좀 더 간단한 방법
        createShape 라는 팩토리 메서드 하나로 다 하려고 하지 말고, 처음부터 클래스에 따른 팩토리 메서드를 만든다.
        팩토리 메서드를 호출하는 쪽은 직선, 사각형, 타원 중 어느 인스턴스를 만들지 알고 있으므로 각 팩토리 메서드를 호출하는게 이상하지 않다.
        또한 팩토리 메서드를 호출하는 쪽의 소ㅑ스 코드에 생성할 인스턴스 클래스명(ShapeLine 등)을 쓰지 않았다.
        createShapeLine 메서드에서 생성하는 것이 ShapeLine 클래스의 인스턴스 인지 ShapeLine 클래스의 하위 클래스 인스턴스인지는
        createShapeLine 메서드 안에 은폐되어 있다.
         */
        Shape line = Shape.createShapeLine(0, 0 ,100 ,200);
        Shape rectangle = Shape.createShapeRectagle(10, 20, 30, 40);
        Shape oval = Shape.createShapeOval(100, 200, 300, 400);

        Shape[] shape = {
            line, rectangle, oval
        };

        for (Shape s : shape) {
            s.draw();
        }
    }

}

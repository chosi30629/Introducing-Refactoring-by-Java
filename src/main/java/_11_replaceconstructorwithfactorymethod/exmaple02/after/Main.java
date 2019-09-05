package _11_replaceconstructorwithfactorymethod.exmaple02.after;


public class Main {

    public static void main(String[] args) {
//        new Client(false).execute();
//        new Client(true).execute();

        /**
         * 'Client 인스턴스를 만들 때 Printer 하위 클래스의 인스턴스를 넘긴다'는 건 Client 인스턴스를
         * 생성할 때 의존 관계를 만들어 낸다는 것이 된다. 이런 기법을 일반적으로 의존성 주입(Dependency Injection)이라고
         * 부른다. DI 라고 줄여 부르기도 한다. 의존성 주입을 사용하면 클래스 의존 관계를 줄일 수 있으므로 클래스를 부품으로 다루기 쉬워진다.
         *
         * 의존성 주입으로 Client 클래스는 DigitPrinter 클래스나 GraphPrinter 클래스에 의존하지 않는다.
         * 대신 Main 클래스가 양쪽 클래스에 의존한다. 이렇듯 클래스 사이의 의존 관계 취급은 번거롭다.
         */
        new Client(new DigitPrinter()).execute();
        new Client(new GraphPrinter()).execute();
    }

}

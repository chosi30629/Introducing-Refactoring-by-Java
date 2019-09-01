package _04_introducenullobject.sample.after;


public class Person {
    private final Label name;
    private final Label mail;


    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    /**
     * Label  존재하지 않는다는 의미로 쓰인 null 을 널 객체로 치환
     */
    public Person(Label name) {
        this(name, new NullLabel());
    }


    public void display() {
        name.display();
        mail.display();
    }

    public String toString() {
        return " [ Person: name=" + name + " mail=" + mail + " ]";
    }

}

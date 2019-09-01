package _06_extractclass.mutable;


/**
 * 불변 인터페이스(Immutable Interface) 방법을 사용하면 일반 인스턴스 내용을 읽기 전용으로 만들 수 있다.
 *  - 세터 메서드가 없음
 */
public interface ImmutableAuthor {
    public String getName();
    public String getMail();
}

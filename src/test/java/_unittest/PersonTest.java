package _unittest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    // 테스트 픽스처(fixture)
    // 픽스처는 '붙박이'라는 의미로, 테스트 메서드가 호출될 때면 이미 준비된 필드를 뜻함
    private Person person;


    // 테스트 사전 준비
    @Before
    public void setUp() {
        person = new Person("chosi", "chosi@example.com");
    }

    // 테스트 후처리
    @After
    public void tearDown() {

    }

    // 테스트 메서드
    @Test
    public void testName() {
        assertEquals("getName test", "chosi", person.getName());
    }

    @Test
    public void testMail() {
        assertEquals("getMail test", "chosi@example.com", person.getMail());
    }

    @Test
    public void testSetName() {
        person.setName("java");
        assertEquals("setName test", "java", person.getName());
    }


    @Test
    public void testSetMail() {
        person.setMail("java@example.com");
        assertEquals("setMail test", "java@example.com", person.getMail());
    }

    @Test
    public void testToString() {
        assertEquals("toString test", "chosi <chosi@example.com>", person.toString());
    }

}

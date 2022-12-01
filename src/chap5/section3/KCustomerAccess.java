package chap5.section3;

public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println(Person1.LEVEL1); //코틀린 클래스의 컴패니언 객체의 접근
        Person1.login1();
        Person1.Companion.login1();
    }
}

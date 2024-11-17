package ch1;

public class Variable {

    public static void main(String[] args) {
        /*
        * 변수는 자료형과 변수 이름으로 구성된다. - 선언
        * 변수에는 값을 대입할 수 있다. - 할당
        * 선언과 할당을 동시에 진행할 수 있다.
        * */
        // 정수형 -2147483648 ~ 2147483647
        int integer = 10; // 선언과 할당

        int integer2; // 선언
        integer2 = 20; // 할당
        System.out.println(integer2);

        System.out.println("정수형은 = " + integer);
        System.out.println("integer와 10은 동등한가? " + (integer == 10));

        // 실수형
        float realNumber = 1.111111111111111111111111111f;
        System.out.println("실수형은 = " + realNumber);

        // 실수형
        double doubleNumber = 1.1111111111111111111111111111111;
        System.out.println("실수형은 = " + doubleNumber);

        // 문자형
        char character = 'A';
        System.out.println("문자형은 = " + character);

        // 문자열
        String string = "AB";
        System.out.println("문자열은 = " + string);
    }

}

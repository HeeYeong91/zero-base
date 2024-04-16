// Java 프로그래밍 - 변수와 자료형_2

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
        
//      1-1. 정수
        int intNum = 10; // int 기본타입
        System.out.println("intNum = " + intNum);

        System.out.println(Integer.MIN_VALUE); // Integer 기본타입보다 기능이 많다
        System.out.println(Integer.MAX_VALUE); // 대문자 스네이크표기법 (상수 = 변경되지 않는 값)

        int intNum2 = Integer.MAX_VALUE;
        System.out.println("intNum2 = " + intNum2);
        int intNum3 = Integer.MAX_VALUE + 1;
        System.out.println("intNum3 = " + intNum3); // 최대값이 넘어가서 최소값으로 돌아감
        long longNum = (long) Integer.MAX_VALUE + 1; // long 타입으로 형변환을 해야 제대로 표기됨

//      1-2. 실수
        float floatNum = 1.23f; // 값 뒤에 f를 안쓰면 double 타입
        double doubleNum = 1.23;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2); // 10진수로 출력
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8); // 10진수로 출력
        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16); // 10진수로 출력

        System.out.println("0b" + Integer.toBinaryString(numBase2));
        System.out.println("0" + Integer.toOctalString(numBase8));
        System.out.println("0x" + Integer.toHexString(numBase16));


//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);


//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyList = 'z';
        System.out.println("keyList = " + keyList);
        System.out.println((int) keyFirst); // int로 형변환
        System.out.println((int) keyList); // 아스키 코드 값

    }
}

// Java 프로그래밍 - 변수와 자료형_3

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");

        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      1-1. equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        String s5 = new String("Hi");
        System.out.println(s3.equals(s5)); // true <- 값 비교
        System.out.println(s3 == s5); // false <- 객체 비교

//      1-2. indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!")); // 5 <- index는 0부터 시작
        System.out.println(s6.indexOf(s6.indexOf("!") + 1)); // 2번째 ! 찾기
        
//      1-3. replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);

//      1-4. substring
        System.out.println(s7.substring(0, 3)); // 3에서 하나 전 까지 출력 0 ~ 2
        System.out.println(s7.substring(0, s7.indexOf("!") + 1)); // !까지

//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());


//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");

        StringBuffer sb1 = new StringBuffer(); // 데이터가 변경되어도 객체가 새로 생성되지 않는다.
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak); // true

        a += b; // 객체가 새로 생성되고, 이런 경우 메모리 생성이 여러번 된다. 시스템 적으로 딜레이
        System.out.println(a);
        System.out.println(a == bak); // false


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");

        int[] myArray1 = {1, 2, 3, 4, 5}; // index 0 부터 시작
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]); // index 범위를 벗어나면 에러 발생

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'}; // 바로 초기화
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);

    }
}

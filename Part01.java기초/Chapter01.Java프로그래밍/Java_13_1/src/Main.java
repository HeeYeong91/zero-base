// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력 : ");
        int a = System.in.read() - '0';
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 남아 있는 데이터 (엔터키) 소진

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.print("입력 : ");
        reader.read(c);
        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);

    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력1 : ");
        System.out.println(sc.next());
        sc.nextLine(); // 엔터키 소진

        System.out.print("입력2 : ");
        System.out.println(sc.nextInt()); // int 값만 입력
        sc.nextLine(); // 엔터키 소진

        System.out.print("입력3 : ");
        System.out.println(sc.nextLine());

//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("12345"); // 문자를 숫자로
        String str = Integer.toString(12345); // 숫자를 문자로
        
//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello"); // 줄바꿈
        System.out.println("World!"); // 줄바꿈

        System.out.print("Hello "); // 줄바꿈 X
        System.out.print("World!"); // 줄바꿈 X
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);

        System.out.printf("%d\n", 10); // 정수는 %d
        System.out.printf("%o\n", 10); // 8진수
        System.out.printf("%x\n", 10); // 16진수

        System.out.printf("%f\n", 5.2f); // 실수
        System.out.printf("%c\n", 'A'); // 문자
        System.out.printf("%s\n", "안녕하세요."); // 문자열

        System.out.printf("%-5d\n", 123); // 5자리, 왼쪽부터 출력
        System.out.printf("%5d\n", 1234); // 5자리
        System.out.printf("%5d\n", 12345); // 5자리

        System.out.printf("%.2f\n", 1.126456789f); // 소수점 2번째 자리 까지 출력 반올림

    }
}

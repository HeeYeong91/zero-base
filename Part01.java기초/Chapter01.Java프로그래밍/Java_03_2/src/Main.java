// Java 프로그래밍 - 여러가지 연산자_2

public class Main {
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");

//      1-1. AND 연산자 (&)
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        
        result = num1 & num2;
        System.out.println("result = " + result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-2. OR 연산자 (|)
        result = num1 | num2;
        System.out.println("result = " + result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-3. XOR 연산자 (^)
        result = num1 ^ num2;
        System.out.println("result = " + result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-4. 반전 연산자 (~)
        num1 = 5;

        result = ~num1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));


//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");

//      2-1. << 연산자
        int numA = 3;
        result = numA << 1;

        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      2-2. >> 연산자
        result = numA >> 1;

        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));

        result = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result)); // 가장 앞에 부호비트 0


        System.out.println("[===== 2진법 =====]");
        System.out.println(Integer.toBinaryString(2)); // 10
        System.out.println(Integer.toBinaryString(10)); // 1010


        System.out.println("[===== 비트 논리 연산자 =====]");
        int a = 2;
        int b = 3;
        int result1 = 0;
        
        result1 = a & b;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a))); // 0010
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(b))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1))); // 0010

        result1 = a | b;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a))); // 0010
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(b))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1))); // 0011

        result1 = a ^ b;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a))); // 0010
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(b))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1))); // 0001

        result1 = ~a;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a))); // 0010
        System.out.printf("%s\n", Integer.toBinaryString(result1)); // 11111111111111111111111111111101


        System.out.println("[===== 비트 이동 연산자 =====]");
        a = 2;
        result1 = a << 1;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a))); // 0010
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1))); // 0100

        result1 = a >> 1;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(a))); // 0010
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result1))); // 0001

        a = -2;
        result1 = a >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(a)); // 11111111111111111111111111111110
        System.out.printf("%s\n", Integer.toBinaryString(result1)); // 1111111111111111111111111111111 맨 앞에 0
    }

}

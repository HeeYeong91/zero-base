// Java 프로그래밍 - 클래스와 객체_2

import car.Car2;

class Car {
    String name;
    String type;

    Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 오버로딩 구현 (매개변수의 개수나 타입을 다르게)
    public void printCarInfo(String date) {
        this.printCarInfo();
        System.out.println("date = " + date);
    }

    public void printCarInfo(int number) {
        this.printCarInfo();
        System.out.println("number = " + number);
    }

    public void printCarInfo(String date, int number) {
        this.printCarInfo();
        System.out.println("date = " + date);
        System.out.println("number = " + number);
    }
}


class Car3 {
    // 스태틱 변수
    static String name = "None";
    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 스태틱 메소드
    public static void getName() {
        System.out.println("Car name: " + name);
    }
}


public class Main {

    public static void main(String[] args) {
        Car myCar1 = new Car("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022", 1234);


//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car2 myCar2 = new Car2("a", "b", "c", "d");
        System.out.println(myCar2.name1);
//        System.out.println(myCar2.name2); // 접근 안됨. private
//        System.out.println(myCar2.name3); // 접근 안됨. protected
//        System.out.println(myCar2.name4); // 접근 안됨. default


//      3. Static
        System.out.println("=== Static ===");
        Car3.getName(); // 객체를 만들지 않아도 클래스를 통해서 메소드 사용 가능
        Car3 myCar3_1 = new Car3("a", "sedan");
        Car3 myCar3_2 = new Car3("b", "suv");
        Car3 myCar3_3 = new Car3("c", "rv");
        myCar3_1.printCarInfo(); // name: c
        myCar3_2.printCarInfo(); // name: c
        myCar3_3.printCarInfo(); // name: c
        // name 변수가 static이기 때문에 마지막에 바꿔준 c로 공유해서 모두 c로 출력

    }

}
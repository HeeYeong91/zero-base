// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person {
    // 추상 메소드
    abstract void printInfo();
}


// 추상 클래스 상속
// 추상 메소드를 오더라이딩 하지 않으면 에러
class Student extends Person {

    @Override
    void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Main {

    public static void main(String[] args) {
        
//        추상 클래스의 사용
//        Person p1 = new Person(); // 추상클래스 객체로 만들지 못한다.
        Student s1 = new Student();
        s1.printInfo(); // Student.printInfo

        // 익명 클래스
        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo(); // Main.printInfo
    }

}

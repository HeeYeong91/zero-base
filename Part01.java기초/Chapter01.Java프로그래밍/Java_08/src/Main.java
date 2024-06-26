// Java 프로그래밍 - 상속

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person {
    Student() {
        a1 = 1;
//        a2 = 1; 접근제어자 때문에 사용 불가능
    }
}

// Student 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
    String name;
    int stdId;

    public Student2(String name, int age, int stdId) {
//        this.name = name; // Student2의 name
//        super.name = name; // 부모의 name
        super(name, age); // 부모의 생성자
        this.age = age; // 상속 받은 age
        this.stdId = stdId;
    }

    // 오버라이딩 어노테이션
    @Override
    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("stdId = " + stdId);
    }

}


public class Main {

    public static void main(String[] args) {

//      Test code
//      1. 상속
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();
        // 결과:
        // Student2.printInfo
        // name: null 생성자에서 부모의 name을 가져왔기 때문에 null이 리턴
        // age: 32
        // stdId = 1

    }
}

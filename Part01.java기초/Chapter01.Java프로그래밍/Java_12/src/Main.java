// Java 프로그래밍 - 내부 클래스 (Inner Class)

// 내부 클래스 구조
class Outer {
    public void print() {
        System.out.println("Outer.print");
    }

    /**
     * 내부 클래스
     */
    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    /**
     * 정적 내부 클래스
     */
    static class InnerStaticClass {
        void innerPrint() {
//            Outer.this.print(); // static이기 때문에 Outer가 메모리에 올라기 전에 올라가서 사용 불가능
        }
    }
}

/**
 * Person 추상 클래스
 */
abstract class Person {
    public abstract void printInfo();
}

/**
 * Person 추상 클래스를 상속한 Student 클래스
 */
class Student extends Person {

    @Override
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Main {

    public static void main(String[] args) {

//      외부 클래스
        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();

//      내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass(); // static이기 때문에 Outer 생성 없이 접근 가능

//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };

    }

}

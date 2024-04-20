// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {

    @Override
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {

    @Override
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Main {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student(); // 다형성
//        Student s2 = new Person(); // 자식이 부모로는 안됨

        p1.print(); // Person.print
        s1.print(); // Student.print
        s1.print2(); // Student.print2
        p2.print(); // Student.print
//        p2.print2(); // 부모에는 print2가 없기 때문에 사용 불가능

        Person p3 = new CollegeStudent();
//        CollegeStudent c1 = new Student(); 자식끼리 같은 부모를 상속했다고 하더라도 다형성 안됨
        p3.print(); // CollegeStudent.print


//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;
        
        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = pp2;
        ss1 = (Student) pp3; // 형변환 다운캐스팅 (업캐스팅 됐던 걸 다시 원래로 되돌리는)

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
//        ss1 = (Student) cc2; // 안됨
//        cc1 = (CollegeStudent) ss2; // 안됨


//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person); // true
        System.out.println(pe1 instanceof Student); // false

        System.out.println(st1 instanceof Student); // true
        System.out.println(st1 instanceof Person); // true

        System.out.println(pe2 instanceof Person); // true
        System.out.println(pe2 instanceof Student); // true

        System.out.println(pe3 instanceof Person); // true
        System.out.println(pe3 instanceof CollegeStudent); // true

        if (pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }

        if (st1 instanceof Person) {
            Person per1 = (Person) st1;
        }


    }
}

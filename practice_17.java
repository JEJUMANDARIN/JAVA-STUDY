// Java 프로그래밍 - 다형성

class Person0429 {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student0429 extends Person0429 {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person0429 {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}

public class practice_17 {
    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person0429 p1 = new Person0429();
        Student0429 s1 = new Student0429();

        Person0429 p2 = new Student0429();
//        Student s2 = new Person();

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//        p2.print2();

        Person0429 p3 = new CollegeStudent();
//        CollegeStudent c1 = new Student();
        p3.print();


//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person0429 pp1 = null;
        Student0429 ss1 = null;

        Person0429 pp2 = new Person0429();
        Student0429 ss2 = new Student0429();
        Person0429 pp3 = new Student0429();     // 업캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = (Student)pp2;
        ss1 = (Student0429)pp3; // 다운캐스팅

//        CollegeStudent cc1;
//        CollegeStudent cc2 = new CollegeStudent();
//        ss1 = (Student) cc2;
//        cc1 = (CollegeStudent) ss2;


//      3. instanceof
        System.out.println("== instanceof ==");
        Person0429 pe1 = new Person0429();
        Student0429 st1 = new Student0429();
        Person0429 pe2 = new Student0429();
        Person0429 pe3 = new CollegeStudent();

        System.out.println("== instance of ==");
        System.out.println(pe1 instanceof Person0429);
        System.out.println(pe1 instanceof Student0429);

        System.out.println(st1 instanceof Student0429);
        System.out.println(st1 instanceof Person0429);

        System.out.println(pe2 instanceof Person0429);
        System.out.println(pe2 instanceof Student0429);

        System.out.println(pe3 instanceof Person0429);
        System.out.println(pe3 instanceof CollegeStudent);

        if (pe1 instanceof Student0429) {
            Student0429 stu1 = (Student0429) pe1;
        }

        if (st1 instanceof Person0429) {
            Person0429 per1 = (Person0429)st1;
        }

    }
}

// Java 프로그래밍 - 인터페이스

// School 인터페이스
interface School {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}

// Student 클래스 - School 인터페이스 이용
class MyStudent implements School {

    public void printSchool() {
        System.out.println("00 University");
    }
}

// Person 클래스
class MyPerson {
    public String name;

    public void printName() {
        System.out.println("Name: " + name);
    }
}


// Student2 클래스 - Person 상속, School 인터페이스 이용
class MyStudent2 extends MyPerson implements School {

    MyStudent2(String name) {super.name = name;}
    public void printSchool() {
        System.out.println("21 University");
    }
}

public class practice_21 {
    public static void main(String[] args) {

//      1. 인터페이스 기본 사용
        System.out.println("== 기본 인터페이스 ==");
        MyStudent s1 = new MyStudent();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);


//      2. 다중 상속처럼 사용하기
        System.out.println("== Like 다중 상속 ==");
        MyStudent2 s2 = new MyStudent2("A");
        s2.printSchool();
        s2.printName();

    }

}

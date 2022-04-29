// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Persons {

    abstract void printInfo();
}

// 추상 클래스 상속
class Students extends Person {

    public void printInfo() {
        System.out.println("Students.printInfo");
    }
}

public class practice_19 {
    public static void main(String[] args) {

//        추상 클래스의 사용
//        Person p1 = new Person();
        Students s1 = new Students();
        s1.printInfo();

        Persons p2 = new Persons() {
            @Override
            void printInfo() {
                System.out.println("practice_19.printInfo");
            }
        };
        p2.printInfo();

    }

}

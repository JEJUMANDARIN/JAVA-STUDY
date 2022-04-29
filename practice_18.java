// Practice
// 아래의 클래스와 상속 관계에서 다형성을 이용하여
// Car 객체를 통해 아래와 같이 출력될 수 있도록 Test code 부분을 구현해보세요.
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class kuruma {
    kuruma(){}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTrucks extends kuruma {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulances extends kuruma {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class practice_18 {
    public static void main(String[] args) {
        // Test code
        kuruma car = new kuruma();
        car.horn();

        car = new FireTrucks();
        car.horn();

        car = new Ambulances();
        car.horn();

//        Car car[] = {new Car(), new FireTruck(), new Ambulance()};
//
//        for (Car item: car) {
//            item.horn();
//        }
    }
}


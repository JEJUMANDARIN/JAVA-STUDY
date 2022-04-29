// Practice
// 아래 Device 추상클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id;
    }

    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }
    void connect() {
        System.out.println("연결 하였습니다.");
    }
    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }
    void send() {
        System.out.println("데이터를 전송합니다.");
    }
    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}

// WiFi 클래스
class WiFi extends Device {
    public WiFi(int id) {
        this.deviceId = id;
    }

    void deviceInfo() {

    }

    void connect() {

    }

    void disconnect() {

    }

    void send() {

    }

    void receive() {

    }
}

public class practice_20 {
    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);
    }

}


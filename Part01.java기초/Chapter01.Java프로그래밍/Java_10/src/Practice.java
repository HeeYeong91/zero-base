// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

/**
 * Device 추상 클래스
 */
abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

/**
 * 추상클래스 Device를 상속받은 UsbPort1 클래스
 */
// UsbPort1 클래스
class UsbPort1 extends Device {

    public UsbPort1(int id) {
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("연결 하였습니다.");
    }

    @Override
    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    @Override
    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    @Override
    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}

/**
 * 추상클래스 Device를 상속받은 WiFi 클래스
 */
// WiFi 클래스
class WiFi extends Device {
    public WiFi(int id) {
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("연결 하였습니다.");
    }

    @Override
    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    @Override
    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    @Override
    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}

public class Practice {

    public static void main(String[] args) {
        // Test code

        UsbPort1 usb1 = new UsbPort1(1);
        usb1.deviceInfo(); // id = 1
        usb1.connect(); // 연결 하였습니다.
        usb1.disconnect(); // 연결이 해제되었습니다.
        usb1.send(); // 데이터를 전송합니다.
        usb1.receive(); // 데이터를 수신합니다.

        WiFi wifi = new WiFi(0);
        wifi.deviceInfo(); // id = 0
        wifi.connect(); // 연결 하였습니다.
        wifi.disconnect(); // 연결이 해제되었습니다.
        wifi.send(); // 데이터를 전송합니다.
        wifi.receive(); // 데이터를 수신합니다.

    }

}

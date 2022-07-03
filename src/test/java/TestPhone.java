import org.testng.annotations.Test;

public class TestPhone {
@Test
    public static void main(String[] args) {
    Phone p1 = new Phone(4002020, "Samsung", 80.25);
    Phone p2 = new Phone(4002030, "Xiaomi", 70.33);
    Phone p3 = new Phone(4002040, "Nokia", 100.25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    p1.receiveCall("Johnny");
    p1.getNumber(4001223);
    p2.receiveCall("Jackie");
    p2.getNumber(4002334);
    p3.receiveCall("Donnie");
    p3.getNumber(4003445);
    }
}

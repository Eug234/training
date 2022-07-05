package part3;

import org.testng.annotations.Test;
@Test
public class TestPhone {

    public static void main(String[] args) {
        Phone phone1 = new Phone(4002020, "Samsung", 80.25);
        Phone phone2 = new Phone(4002030, "Xiaomi", 70.33);
        Phone phone3 = new Phone(4002040, "Nokia", 100.25);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Johnny");
        phone1.getNumber(4001223);
        phone2.receiveCall("Jackie");
        phone2.getNumber(4002334);
        phone3.receiveCall("Donnie");
        phone3.getNumber(4003445);

        //Тут було не зрозуміло-консоль виводила щось типу "Phone@1eg6983a". Згенерував метод toString для класу Phone і добавив сюди. Рішення знайшов тут: https://ru.stackoverflow.com/questions/1312637/com-company-przyklad0322d8cfe0-%d0%bf%d1%80%d0%b8-%d1%87%d1%82%d0%b5%d0%bd%d0%b8%d0%b8-%d0%be%d0%b1%d1%8c%d0%b5%d0%ba%d1%82%d0%b0-%d0%b8%d0%b7-%d1%84%d0%b0%d0%b9%d0%bb%d0%b0-ser-java?noredirect=1&lq=1
        phone1.toString();
    }
}
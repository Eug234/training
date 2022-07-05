package part3;
//Клас Person
//a) поля fullName, age.
//методи move() і talk(), у яких просто виводить в консоль повідомлення -"Person рухається" i "Person говорить".
//в) Додайте два конструктори - Person() та Person(fullName, age).
//Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person(), інший – Person (fullName, age).

public class Person {
    String fullName;
    int age;
    public void move() {
        System.out.println("Person рухається");
    }
    public void talk(){
        System.out.println("Person говорить");
    }
    public Person(String name, int age) {
        this.fullName = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Johnny", 74);
        person1.move();
        person2.talk();
    }
}


import org.testng.annotations.Test;

//Клас Phone                                shift+alt+click   - редактировать сразу неск строк
//а) Створіть клас Phone, який містить змінні number, model та weight.
// вони мають бути приватними та доступ до них організований через геттери і сеттери
//б) Створіть три екземпляри цього класу.          //в) Виведіть в консоль значення їх змінних.
//г) Додати в клас Phone методи: receiveCall, має один параметр - ім'я того, хто дзвонить.
// Виводить в консоль повідомлення “Телефонує {name}”. getNumber – повертає номер телефону. Викликати ці методи кожного з об'єктів.
//д) Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу – number, model та weight.
//е) Додати конструктор, який приймає на вхід два параметри для ініціалізації змінних класів – number, model.
//ж) Додати конструктор без параметрів.
//
//Читачі бібліотеки
//а) Визначити клас Reader, який зберігає таку інформацію про користувача бібліотеки: ПІБ, номер квитка читача, телефон.
//б) Додати методи takeBooks(), returnBooks().
//
//- takeBooks() прийматиме два параметри: кількість книг, які вже взяв читач, і кількість книг, які бере читач зараз. Цей метод буде виводити запис у форматі. "Читач Петров взяв сьогодні n книг. Загалом читач взяв "загальна сумма" книг."
//Опрацювати кейс, коли читач взяв більше ніж 5 книг. За це нарахувати штраф (кожна книжка, яка перевищує ліміт = 50 грн).  В даному випадку вивести в консоль повідомлення з текстом "Ліміт перевищенний. Сума штрафу = n грн"
//
//-returnBooks() прийматиме два параметри: кількість книг, які вже взяв читач, і кількість книг, які повертає читач зараз. Цей метод буде виводити в консоль запис у форматі. "Читач Петров повернув сьогодні книг. Загалом в читача залишається  загальна сумма книг."
//Опрацювати кейс, коли в читача було (тобто перед повернення) більше 5 книг і нарахувати за це штраф як і в першому випадку, але також нарахувати майбутній штраф, якщо після повернення в читача залишиться більше 5 книг і вивести про це попередження в консоль.
@Test
public class Phone {
    private int number;
    private String model;
    private double weight;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }
    public void getNumber(int number){
        System.out.println("Number " + number);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
}
//public class Phone {
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    private int number;
//    private String model;
//    private double weight;
//
//        public void receiveCall (String name){
//            System.out.println("Телефонує: " + name);
//        }
//        public void getNumber ( int number){
//            System.out.println("Його номер: " + number);
//        }
//    public Phone( int number, String model,double weight){
//            this.number = number;
//            this.model = model;
//            this.weight = weight;
//        }
//
//    public Phone( int number, String model){
//            this.number = number;
//            this.model = model;
//        }
//
//    public Phone() {
//        }
//    }

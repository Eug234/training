package part3;
import org.testng.annotations.Test;
//Читачі бібліотеки. а) Визначити клас Reader, який зберігає таку інформацію про користувача бібліотеки:
// ПІБ, номер квитка читача, телефон. б)Додати методи takeBooks(), returnBooks(). -takeBooks() прийматиме два параметри:
// кількість книг, які вже взяв читач, і кількість книг, які бере читач зараз. Цей метод буде виводити запис у форматі:
// "Читач Петров взяв сьогодні n книг. Загаломчитач взяв "загальна сумма" книг." Опрацювати кейс, коли читач взяв більше
// ніж 5 книг.За це нарахувати штраф (кожна книжка,яка перевищує ліміт = 50 грн). В даному випадку вивести в консоль повідомлення з
// текстом "Ліміт перевищенний. Сума штрафу = n грн". -returnBooks() прийматиме два параметри: кількість книг, які вже взяв читач,
// і кількість книг, які повертає читач зараз. Цей метод буде виводити в консоль запис у форматі. "Читач Петров повернув сьогодні
// книг.Загалом в читача залишається загальна сумма книг." Опрацювати кейс, коли в читача було (тобто перед повернення) більше
// 5 книг і нарахувати за це штраф як і в першому випадку,але також нарахувати майбутній штраф, якщо після повернення в читача
// залишиться більше 5 книг і вивести про це попередженняв консоль.
@Test
public class Reader {
    static String PIB;
    static int nomerKvytka;
    static int telephone;
//    static int shtraf =50;
//    static int chytachVzheVzyavKnyg;

    public Reader(String PIB2, int nomerKvytka2, int telephone2) {
        PIB = PIB2;
        nomerKvytka = nomerKvytka2;
        telephone = telephone2;
    }
        public void takeBooks ( int chytachVzheVzyavKnyg, int chytachBereKnygZaraz){
            System.out.println("Читач " + PIB + " взяв сьогодні " + chytachBereKnygZaraz + ". Загалом читач взяв " + chytachVzheVzyavKnyg + " книг.");
        }
//        if (chytachVzheVzayvKnyg > 5) {
//            System.out.println("Ліміт перевищенний. Сума штрафу = n грн");
//        }
        public void returnBooks ( int chytachVzheVzyavKnyg, int chytachPovertaeKnygZaraz){

            System.out.println("Читач " + PIB + " повернув сьогодні " + chytachPovertaeKnygZaraz + " книг. Загалом в читача залишається " + chytachVzheVzyavKnyg);
        }
//    //варіант розрахунку штрафу:
//    public void CheckShtraf(chytachVzheVzyavKnyg>5){
//        System.out.println("штраф")}
}


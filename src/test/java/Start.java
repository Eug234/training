public class Start {

    public static void main(String[] args) {
        Computer apple /*в этой переменной лежит не сам комп, а ссылка на него*/= new Computer();//хранится в памяти как отдельный экземпляр

        apple.cpu = 2500;
        apple.memory = 1000;
        apple.name = "MacBook";
        apple.isCpu();

        Computer deal = apple;

        apple.memory = 1500;
        apple.isMemory();
        deal.isMemory();
    }
}
//класс2, главный метод, в нем объект класса1 (что позволяет
//брать переменные из класс1 и присваивать их объекту. Также
//и методы методы класса1 через точку.
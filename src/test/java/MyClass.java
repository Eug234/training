class MyClass{
    // Поля класса:
    int number;
    char symbol;
    // Метод для отображения значений полей:
    void show(){
        System.out.println("Число: "+number);
        System.out.println("Символ: "+symbol);
    }
    // Конструктор:
    MyClass(){
        // Присваивание значений полям:
        number=100;
        symbol='A';
        // Отображение значения полей:
        show();
    }
}
// Главный класс:
class Demo{
    public static void main(String[] args){
        MyClass obj;
        System.out.println("Создается объект");
        obj=new MyClass();
    }
}
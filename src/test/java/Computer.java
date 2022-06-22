import com.google.gson.internal.bind.util.ISO8601Utils;
public class Computer {
    int memory;
    int cpu;
    String name;

    void isCpu() {
        System.out.println(cpu);
    }
    void isMemory(){
        System.out.println(memory);
    }
}

//класс1, в нем объявляем переменные и метод с принтом
//когда мы работаем с классами, класс можно назвать опред
//типом данных - не примитив, ссылочный.
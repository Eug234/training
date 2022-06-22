package Constructors;
import org.testng.annotations.Test;
@Test
public class FirstConstructor {
    int memory;
    char model;
    String seriya;
    double cpu;
    boolean os;

    void show() {
        System.out.println(/*"Pamyat" + memory*/);
    }
    public FirstConstructor(int memoryN,char modelN, String seriyaN, double cpuN, boolean osN) {
memory = memoryN;
model = modelN;
seriya = seriyaN;
cpu = cpuN;
os = osN;

    }

//    public void display() {
//        System.out.println(memory + model + seriya + cpu + os);
//    }

//    public static void main(String[] args) {
//        RecipientClass recipientClass = new RecipientClass();
//
//
//    }
}

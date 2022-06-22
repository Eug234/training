package Constructors;

public class SecConstructor {

    public int memoryQ;
    public char modelQ;
    String seriyaQ;
    double cpuQ;
    boolean osQ;

    void show() {
        System.out.println(memoryQ + modelQ);
    }

    public SecConstructor(int memoryW, char modelW, String seriyaW, double cpuW, boolean osW) {
        memoryQ = memoryW;
        modelQ = modelW;
        seriyaQ = seriyaW;
        cpuQ = cpuW;
        osQ = osW;
    }

    public void display() {
        System.out.println(memoryQ + modelQ + seriyaQ + cpuQ + osQ);
    }

    public static void main(String[] args) {
        RecipientClass recipientClass = new RecipientClass();

    }
}


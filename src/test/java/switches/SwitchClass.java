package switches;

import org.testng.annotations.Test;

public class SwitchClass {
    @Test
    public void show(){
        int day = 15;
        switch (day) {
            case 10:
                // code block
                System.out.println("one");
                break;
            case (12):
                // code block
                System.out.println("two");
                break;
            default:
                System.out.println("three");
        }
    }
}
package switches;

import org.testng.annotations.Test;
//Use if to specify a block of code to be executed, if a specified condition is true
//Use else to specify a block of code to be executed, if the same condition is false
//Use else if to specify a new condition to test, if the first condition is false
//Use switch to specify many alternative blocks of code to be executed
@Test
public class IfElse {


    public static void main(String[] args) {
        int time = 20;

        if (time < 18) {
            System.out.println("Good day");
        } else if (time > 20) {
            System.out.println("good morning");
        } else {
            System.out.println("Good evening");
        }
    }

}

//    public static void main(String[] args) {
//
//        if (20 > 18) {
//            System.out.println("yolo");
//        }
//    }
//}


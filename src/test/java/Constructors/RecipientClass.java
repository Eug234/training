package Constructors;

import org.testng.annotations.Test;
        //int char string double boolean
@Test
public class RecipientClass {
    public static void main(String[] args) {
        FirstConstructor firstConstructor = new FirstConstructor(8, 'Y', "novaya", 3.400, false);

//        firstConstructor.os = false;
//        firstConstructor.memory = 10;
//        firstConstructor.cpu = 3.500;
//        firstConstructor.model = 'U';
//        firstConstructor.seriya = "staray";


        firstConstructor.show();{
            System.out.println(firstConstructor.os);
            System.out.println(firstConstructor.memory);
            System.out.println(firstConstructor.cpu);
            System.out.println(firstConstructor.model);
            System.out.println(firstConstructor.seriya);
        }

    }
}

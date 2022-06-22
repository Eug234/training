import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.Test;

public class TestStrings {
    @Test
    public void testSimpleString() {

        String email = "vrudenko106@gmail.com";
        String[] emailSplitted = email.split("@"); //массив {"vrudenko106", "gmail.com"} - @ удал, бо по нему сплитуем
        System.out.println(emailSplitted[0].split("r")[1]);
//        String sentence = "Kyiv is the Greatest city in the world";
//        String[] splitted = sentence.split(" ");  //массив присваиваем переменной сплиттед
//        System.out.println(splitted[4]);
//        for (String word : splitted){
//            System.out.println(word);
        }

        //sentence.split(" ");    //делает массив {"kyiv", "is", "the", тд}

        //String sourceString = "Hello my name is Vadym";

        //for (int i = sourceString.length()-1; i >= 0; i--){
          //  System.out.print(sourceString.charAt(i));   //попробовать вывести часть строки в обратном порядке
//    System.out.println(sourceString);
//    String secondString = "Jack";
//    int age = 35;
//    double weight = 40.5d;
//    System.out.println(sourceString+secondString+(age+weight));

        }


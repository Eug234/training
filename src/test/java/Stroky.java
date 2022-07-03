import org.testng.annotations.Test;

//Робота зі строками
@Test
public class Stroky {
    static String stroka = "The quick brown fox jumps over the lazy dog 4 times. 2 fast 2 furious fox";
    public static void main(String[] args) {

        System.out.println( "Текст до змін: " + stroka);
//1. вивести строку без голосних
        String minusVowels = "[aeiouAEIOU]";
        String result = stroka.replaceAll(minusVowels, "");
        System.out.println(result);

//regex беремо тут: docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
// чому подвійна "\\" - вказано в розділі Backslashes, escapes, and quoting
        //2. Вивести строку без приголосних
//        String vowels = stroka.replaceAll("[^aeiouAEIOU]", "");
//        System.out.println(vowels);


//        stroka = stroka.replaceAll("\\W",""); //- все що не слово
//        System.out.println(stroka);

//        stroka = stroka.replaceAll("\\w",""); //- всі слова, крім пунктуації, беремо у лапки
//        char vokrugStroki = '"';
//        System.out.println(vokrugStroki+stroka+vokrugStroki);

//        stroka = stroka.replaceAll("\\S",""); // лише пробіли, без букв, у лапках
//        char vokrugStroki = '"';
//        System.out.println(vokrugStroki+stroka+vokrugStroki);

//        stroka = stroka.replaceAll("\\D",""); // - всі не цифри
//        System.out.println(stroka);

//        stroka = stroka.replaceAll("\\d",""); // - цифри
//        System.out.println(stroka);

        //3. Вивести речення без пробілів

//        stroka = stroka.replaceAll("\\s","");
//        System.out.println(stroka);

    }
    
}

package part2;

import org.testng.annotations.Test;

//Робота зі строками
//1. вивести строку без голосних
//2. Вивести строку без приголосних
@Test
public class Stroky {
    static String stroka = "The quick brown fox jumps over the lazy dog";
    public static void main(String[] args) {

        System.out.println( "Текст до змін: " + stroka);

//Вивести речення без пробілів
//regex беремо тут: docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
// чому подвійна "\\" - вказано в розділі Backslashes, escapes, and quoting
        stroka = stroka.replaceAll("\\s","");
        System.out.println(stroka);

    }
}

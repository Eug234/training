package part3;

import static part3.Reader.shtraf;

public class ReaderTest{
    public static void main(String[] args) {
        Reader vasya = new Reader("Vasylii Petrovich", 222, 2300770);
        Reader katya = new Reader("Kateryna Vasylivna", 333, 4201256);
        Reader nazar = new Reader("Nazar Katerynovuch", 444, 2308756);

        vasya.takeBooks(3, 1);
        katya.takeBooks(23,2);
        nazar.returnBooks(4, 3);

        if (vasya.CheckShtraf( chytachVzheVzyavKnyg> 5) {
            System.out.println("Ліміт перевищенний. Сума штрафу = " + shtraf + "грн");
        }
        //кожна книжка,яка перевищує ліміт = 50 грн. - можливо, цикл
        if (chytachVzheVzyavKnyg>5){
            System.out.println("штраф");
        } else if(chytachVzheVzyavKnyg>5){
            System.out.println("штраф");
        }
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Добро пожаловать в ИГРУ, таинственный путник! ***");
        System.out.println("*** Вы должны сразу определиться - НА ЧЬЕЙ ВЫ СТОРОНЕ?! ***");
        System.out.println("Нажав 1 вы попадёте на сторону ЭЛЬФОВ, нажав 2 вы отправитесь в ряды ОРКОВ ");
        byte wiborRaci = new Scanner(System.in).nextByte();
        while (true) {
            if (wiborRaci == 1) {
                System.out.println("Вы сделали верный выбор...");
                System.out.println("...Почетные старцы эльфов принимают вас с почестями ...");
                System.out.println("...Жители ликуют ...");
                Elf el = new Elf();
                el.elf();
                break;

            } else if (wiborRaci == 2) {
                System.out.println("Вы сделали верный выбор...");
                System.out.println("...Главный вождь орков принимает вас с почестями ...");
                System.out.println("...Жители ликуют ...");
                Ork or = new Ork();
                or.ork();
                break;

            }else System.out.println("1 - ОРКИ; 2 - ЭЛЬФЫ");
            wiborRaci = new Scanner(System.in).nextByte();
        }
       Chudoviwe chu = new Chudoviwe();

    }

}
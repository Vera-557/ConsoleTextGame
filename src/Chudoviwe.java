import java.util.Random;
import java.util.Scanner;

public class Chudoviwe {
    int monsterHP;
    int monsterName;
    int monsterSkill;
    int playerSkill;

    public Chudoviwe(){
        System.out.println("...Не успели стихнуть звуки радости благодарных жителей, не успели остыть поджаренные на костре явства, как издалека послышался свирепый рёв...");
        System.out.println("...Этот шум был только для вас загадкой...");
        System.out.println("...Каждый житель Небыляндии знал, что это воет страшное чудовище, уже который год, проживающее в пещере...");
        System.out.println("...На этот раз чудовище не собирается играть в прятки и воровать зазевавшихся жителей, не успевших вернуться домой до заката...");
        System.out.println("...Оно вышло на охоту открыто...");
        System.out.println("...Кто-то должен сразиться с монстром...");
        System.out.println("...На честном голосовании все жители Небыляндии выбрали вас, в качестве добровольца...");
        System.out.println("...Удачи!...");
    }

    public void player(){System.out.println("Ваш ход. Выберите действие: 1 - атака; 2 - защита.");
        int command = new Scanner(System.in).nextInt();
        if(command==1){
            System.out.println("Вы нанесли удар "+this.monsterName + "получает "+ this.playerSkill + " единиц урона");
            monsterHP -= playerSkill;
            //if (){}
        }

    }
}

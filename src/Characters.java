import java.util.Scanner;

public class Characters {
    String name;
    String gender;
    String userName;
    int age;
    String skill;
    String spetialSkill;
    int lvl;
    int hp;
    int mp;
    int skillPower;
    String wozrast;    public Characters (){

    }

    public Characters (String name, String spetialSkill, int lvl, int hp, int mp, int skillPower){
        this.name = name;
        this.spetialSkill = spetialSkill;
        this.lvl = lvl;
        this.hp = hp;
        this.mp = mp;
        this.skillPower = skillPower;


    }

    public void znakomstwo(){
        System.out.println("Введите ваше имя");
        userName = new Scanner(System.in).next().trim();
        System.out.println("Выберите ваш пол: м - мужчина, ж - женщина");
        gender = new Scanner(System.in).next().trim();
        String m = "м";
        String f = "ж";
        while (true) {
            if (gender.equals(m)) {
                System.out.println("мужчина");
                this.gender = "мужчина";
                break;

            } else if (gender.equals(f)) {
                System.out.println("женщина");
                this.gender = "женщина";
                break;

            } else {
                System.out.println("Тут только два варианта: М - мужчина, Ж - женщина");
                gender = new Scanner(System.in).next().trim();

            }

        }



        System.out.println("Сколько вам лет");
        age = new Scanner(System.in).nextInt();
        if (4 <= age && age <= 20){ this.wozrast = " лет";
        }else if (21 <= age && age <= 24){ this.wozrast = " года";
        }else this.wozrast = " лет";
        System.out.println("Выберите своё призвание");
        System.out.println("В этом мире вы можете стать настоящим магом - повелителем стихий,"+" научиться управлять острым клинком так искуссно, что могут позавидовать все древние старцы," + "овладеть искусством стрельбы из лука, когда каждая стрела попадёт в цель");
        System.out.println("м - маг, в - воин, л - лучник");
        skill = new Scanner(System.in).next().trim();
        String q = "м";
        String w = "в";
        String e = "ц";
        String r = "л";
        while(true){
            if(skill.equals(q)){
                System.out.println("Принято!");
                this.skill = "маг";
                break;
            }
            else if(skill.equals(w)) {
                System.out.println("Принято!");
                this.skill = "воин";
                break;

            }
            else if(skill.equals(r)) {
                System.out.println("Принято!");
                this.skill = "лучник";
                break;
            }
            else{
                System.out.println("Выберите указанные классы: м - маг, в - воин, л - лучник");
                skill = new Scanner(System.in).next().trim();

            }


        }




    }

}



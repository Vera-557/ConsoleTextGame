public class Elf {
    public void elf (){

        Characters elf = new Characters("Эльф", "быстрое заживление ран",1,100,100,10  );
        elf.znakomstwo();
        System.out.println("Добро пожаловать, " + elf.userName  +". Ваша раса: " +elf.name+ ". Вам "  + elf.age + elf.wozrast + " . Вы "  + elf.gender +  ". Ваш текущий уровень - "  + elf.lvl);
        System.out.println("У вас есть особенный талант - " + elf.spetialSkill +  ". Ваш уровень жизни - "  + elf.hp + ". Ваш уровень маны - " + elf.mp  + ". Сила ваших навыков - " + elf.skillPower);
        System.out.println("Вы - " + elf.skill);

    }

}

public class Ork {
    public void ork() {

        Characters ork = new Characters("Орк", "крепкая броня", 1, 100, 100, 10);
        ork.znakomstwo();
        System.out.println("Добро пожаловать, " + ork.userName + ". Ваша раса: " + ork.name + ". Вам " + ork.age + ork.wozrast + " . Вы " + ork.gender + ". Ваш текущий уровень - " + ork.lvl);
        System.out.println("У вас есть особенный талант - " + ork.spetialSkill + ". Ваш уровень жизни - " + ork.hp + ". Ваш уровень маны - " + ork.mp + ". Сила ваших навыков - " + ork.skillPower);
        System.out.println("Вы - " + ork.skill);

    }

}

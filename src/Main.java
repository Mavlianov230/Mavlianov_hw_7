public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[] {
                new Magic(150, 40),
                new Medic(130, 25, 60),
                new Warrior(160, 30)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("Новое значение healPoints медика: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}

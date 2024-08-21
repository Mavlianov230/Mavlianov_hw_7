public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, "MAGIC");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность MAGIC ATTACK");
    }
}

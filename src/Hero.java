public abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }


}

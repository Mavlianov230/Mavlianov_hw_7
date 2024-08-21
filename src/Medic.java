public class Medic extends Hero {
    private double healPoints;

    public Medic(int health, int damage, double healPoints) {
        super(health, damage, "HEAL");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEAL");
    }

    public void increaseExperience() {
        this.healPoints *= 1.10;
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }
}


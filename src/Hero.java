public class Hero {
    String name;
    int health;
    int damage;
    String superpower;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }


    public void hero(String name, int health, int damage, String superpower) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }
    public void hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

}

public class Main {
    public static void main(String[] args){

    Hero play = new Hero();

    play.name = "artur";
    play.health = 300;
    play.damage = 50;
    play.superpower = "fly";
        System.out.println("name "+play.name);
        System.out.println("health "+play.health);
        System.out.println("damage "+play.damage);
        System.out.println("superpower "+play.superpower);

        Boss boss = new Boss();
        boss.setDamage(30);
        boss.setHealth(1000);
        boss.setTypeOfProtection("барьер");
        System.out.println("damage - "+boss.getDamage()+ ":"+"health - "+boss.getHealth()+":"+"typeOfProtection - "+boss.getTypeOfProtection());



    }

}
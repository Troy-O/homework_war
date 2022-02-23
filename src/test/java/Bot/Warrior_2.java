package Bot;

public class Warrior_2 extends Warrior_general{

    public Warrior_2(int damage_general, int hp_general) {
        super(damage_general, hp_general);
    }

    void characteristic(int d, int h){
        int damage=d;
        int hp=h;
        System.out.println("Воїн №2");
        System.out.println("Урон:"+""+damage);
        System.out.println("Хп:"+""+hp);

    }
    int damage (){
        return damage_general;
    }
    int health(){
        return hp_general;
    }

    void battle(int number){
        System.out.println("Воїн №2 поцілив  у Воїн №"+number);
        System.out.println("Воїн №"+number+" "+"hp:");
    }
}

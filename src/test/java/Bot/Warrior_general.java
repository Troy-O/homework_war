package Bot;

 public class Warrior_general {
    int damage_general;
    int hp_general;

     public Warrior_general(int damage_general, int hp_general) {
         this.damage_general = damage_general;
         this.hp_general = hp_general;
     }

     void characteristic(int d, int h){
        int damage=d;
        int hp=h;
        System.out.println("Урон:"+""+damage);
        System.out.println("Хп:"+""+hp);

    }

        void battle(){
            System.out.println("Воїн № поцілив  у Воїн №");
            System.out.println("Воїн № hp:");
        }


}

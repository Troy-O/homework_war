package Bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warrior_1 warrior1 = new Warrior_1(500, 700);
        Warrior_2 warrior2 = new Warrior_2(700, 600);
        Warrior_3 warrior3 = new Warrior_3(1000, 1000);


        warrior1.characteristic(500, 700);
        System.out.println("");
        warrior2.characteristic(700, 600);
        System.out.println("");
        warrior3.characteristic(1000, 1000);
        System.out.println("");
        System.out.println("Битва!!!");
        for (int a = 0; a < 20; a++) {
            int i = 0;
            int a_2=0;
            int a_3=0;
            int c_2=0;
            int b_1=0;
            int b_3=0;
            int c_1=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть хто на кого буде атакувати: ");
            i = scanner.nextInt();
            if (i<=32){

                if (i == 12) {
                    warrior1.battle(2);
                    System.out.println(a_2=warrior2.hp_general - warrior1.damage_general);
                    if (a_2<=0){
                        System.out.println(" ");
                        System.out.println("Воїн 1 переміг");
                        System.out.println("Воїн 2 помер hp:"+" "+a_2);
                        break;
                    }
                } else if (i == 13) {
                    warrior1.battle(3);
                    System.out.println(a_3=warrior3.hp_general - warrior1.damage_general);
                    if (a_3<=0){
                        System.out.println(" ");
                        System.out.println("Воїн 1 переміг");
                        System.out.println("Воїн 3 помер hp:"+" "+a_3);
                       break;
                    }
                } else if (i == 21) {
                    warrior2.battle(1);
                    System.out.println(b_1=warrior1.hp_general - warrior2.damage_general);
                        if (b_1<=0){
                            System.out.println(" ");
                            System.out.println("Воїн 2 переміг!!!");
                            System.out.println("Воїн 1 помер hp:"+" "+b_1);
                            break;
                        }
                } else if (i == 23) {
                    warrior2.battle(3);
                    System.out.println(b_3=warrior3.hp_general - warrior2.damage_general);
                    if (b_3<=0){
                        System.out.println(" ");
                        System.out.println("Воїн 2 переміг!!!");
                        System.out.println("Воїн 3 помер hp:"+" "+b_3);
                        break;
                    }
                } else if (i == 31) {
                    warrior3.battle(1);
                    System.out.println(c_1=warrior1.hp_general - warrior3.damage_general);
                    if (c_1<=0){
                        System.out.println(" ");
                        System.out.println("Воїн 3 переміг!!!");
                        System.out.println("Воїн 1 помер hp:"+" "+c_1);
                        break;
                    }
                } else if (i == 32) {
                    warrior3.battle(2);
                    System.out.println( c_2=warrior2.hp_general - warrior3.damage_general);
                    if (c_2<=0){
                        System.out.println(" ");
                        System.out.println("Воїн 3 переміг!!!");
                        System.out.println("Воїн 2 помер hp:"+" "+c_2);
                        break;
                    }
                } else {
                    System.out.println("Ви ввели не  ту комбінацію");
                    break;
                }
            }else if(a_2<0 || a_3<0 || b_1<0 || b_3<0 || c_1<0 || c_2<0){
                break;

            }else {
                System.out.println("Кінець головного if");
            }
        }
    }
}


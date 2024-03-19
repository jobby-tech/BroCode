package OOPS;

import java.util.Random;

public class DiceRoller {

    //Local Varialbe = declared inside a method , visible only to that method
    // Global Variable = declared outside a method, but within a class, and is accessible to

    int number;
    Random random;

    DiceRoller(){
        random = new Random();

        roll(random,number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}

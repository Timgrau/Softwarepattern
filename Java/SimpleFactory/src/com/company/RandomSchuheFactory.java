package com.company;
import java.util.Random;

public class RandomSchuheFactory {

    public static ISchuhe getRandomSchuh() {
        Integer random = new Random().nextInt(2);

        if ( random.equals(0) )
            return new FlipFlops();
        else if ( random.equals(1) )
            return new Wanderschuhe();
        else if ( random.equals(2) )
            return new Turnschuhe();
        else
            return null;
    }
}

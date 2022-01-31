package com.company;

public class Main {

    public static void main(String[] args) {
        ISchuhe wanderSchuh, turnSchuh, randomSchuh;

	    turnSchuh = SimpleSchuheFactory.getSchuh("Turnschuhe");
        wanderSchuh = SimpleSchuheFactory.getSchuh("Wanderschuhe");
        randomSchuh = RandomSchuheFactory.getRandomSchuh();


        assert randomSchuh != null;
        System.out.println(randomSchuh.getModel());
    }
}

package com.example.fakefinalproject;

public class Player {
    private int hitPoint;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int totalGold;

    public Player(int hitPoint, int strength, int dexterity, int intelligence, int totalGold) {
        this.hitPoint = 20;
        this.strength = threeRollOfASixSidedDie();
        this.dexterity = threeRollOfASixSidedDie();
        this.intelligence = threeRollOfASixSidedDie();
        this.totalGold = 0;
    }

    public int threeRollOfASixSidedDie(){
        return (int)(Math.random()*6+1) + (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
    }

    private int addGold(){
        return 0;
    }
}

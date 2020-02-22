package com.sda.game;

public class Hero {
    private String name;
    private int health;
    private Weapon weapon;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
        this.weapon = new BareFists();
    }

    public void fight(Hero enemy) {
        System.out.printf("Fighting with enemy %s, health: %d, strength: %d\n", enemy.getName(), enemy.getHealth(), enemy.getStrength());
        if (enemy.getStrength() > this.getStrength()) {
            System.out.println(this.name + "looooose!!\nActual health: " + this.getHealth());
            this.setHealth(this.health - enemy.getWeapon().damage());
        } else {
            System.out.println(this.getName() + "WINS");
        }
    }

    public int getStrength() {
        return this.health + this.getWeapon().damage();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}

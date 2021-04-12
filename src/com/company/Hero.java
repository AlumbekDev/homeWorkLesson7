package com.company;

public abstract class Hero implements HavingSuperAbility {
    int Health;
    int Damage;
    String Superpower;

    public Hero(){

    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperpower() {
        return Superpower;
    }

    public void setSuperpower(String superpower) {
        Superpower = superpower;
    }
}

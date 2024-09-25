package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        setHealthPercentage(healthPercentage);
        this.weapon = weapon;
    }

    // Health değerini dönen metod
    public int healthRemaining() {
        return healthPercentage;
    }

    // Sağlık kaybı metod
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    // Sağlık yenileme metod
    public void restoreHealth(int health) {
        healthPercentage += health;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    // HealthPercentage'yi set eden yardımcı metod
    private void setHealthPercentage(int healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }
}
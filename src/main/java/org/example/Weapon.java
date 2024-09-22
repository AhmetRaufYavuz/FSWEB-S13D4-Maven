package org.example;

    public enum Weapon {
        SWORD(20,2),
        AXE(50,1.5),
        BOW(40,4);

        private int damage;
        private double attackSpeed;

        Weapon (int damage, double attackSpeed){
            this.attackSpeed =  attackSpeed;
            this.damage = damage;
        }

        public int getDamage() {
            return damage;
        }

        public double getAttackSpeed() {
            return attackSpeed;
        }
    }


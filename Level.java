public enum Level {
    EASY(10),
    MEDIUM(20),
    HARD(30),
    VERY_HARD(40);

    private final int enemyDamage;

    Level(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public int getDamage() {
        return enemyDamage;
    }

}

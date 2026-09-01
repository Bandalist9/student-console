public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void describe() {
        System.out.println(name + " | HP " + hp);
    }

    public int getHp() {
        return hp;
    }

    public void takeDamage(int damage) {
//        if (hp - damage <= 0) {
//            hp = 0;
//        } else {
//            hp -= damage;
//        }
        hp = Math.max(0, hp - damage);
    }
}

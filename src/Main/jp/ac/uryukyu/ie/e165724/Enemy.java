package jp.ac.uryukyu.ie.e165724;

public class Enemy extends LivingThing{
    public Enemy(String name, int hitPoint, int attack){
        super(name,hitPoint,attack);
    }

    @Override
    public void attack(LivingThing opponent) {
        if (isDead() == false) {
            int damage = (int) (Math.random() * opponent.getAttack());
            int critical = (int) (Math.random() * 10);
            if (damage == 0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
            }else if(critical < 2) {
                damage = damage*2;
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            }
            else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            }
            opponent.wounded(damage);
        }
    }
}



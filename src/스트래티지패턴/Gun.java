package 스트래티지패턴;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("총으로 공격!");
    }
}

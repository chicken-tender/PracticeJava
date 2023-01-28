package 포켓몬게임;

public class Pokemon {
    protected String name;
    protected String village;
    protected int power;
    protected int defensive;
    protected int HP;

    public Pokemon(String name, String village, int power, int defensive, int HP) {
        this.name = name;
        this.village = village;
        this.power = power;
        this.defensive = defensive;
        this.HP = HP;
    }

    public void attacked(Pokemon pokemon) {
        HP -= (pokemon.power - defensive);
        System.out.println(name + " 이(가) 방어합니다.");
        System.out.println(name + " 현재 HP : " + HP);
        System.out.println();
    }

    public void attack(Pokemon pokemon) {
        System.out.println(name + " 이(가) " + pokemon.name + " 을(를) 공격합니다.");
        System.out.println();
    }

    public void infoView() {
        System.out.println("====== " + name + " 정보 ======");
        System.out.println("마을 : " + village);
        System.out.println("HP: " + HP);
        System.out.println("공격: " + power);
        System.out.println("방어: " + defensive);
        System.out.println();
    }

    public void create() {
        System.out.println(name + " 이(가) " + village + " 마을에서 생성되었습니다.");
        System.out.println();
    }
}

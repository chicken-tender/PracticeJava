package 정적팩토리메소드_예제;

public class Main {
    public static void main(String[] args) {
        final ItemCreator hpc = new HpPotionCreator();
        final HpPotion hpPotion = (HpPotion) hpc.create();
        hpPotion.use();
        System.out.println("================================");
        final ItemCreator k = new SwordCreator();
        final Sword sword = (Sword) k.create();
        sword.use();
    }
}

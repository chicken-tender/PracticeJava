package 스트래티지패턴;

public class Main {
    public static void main(String[] args) {
        final Character swordMan = new Character();
        final Character shooter = new Character();
        final Character magicion = new Character();

        final Weapon knife = new Knife();
        final Weapon gun = new Gun();
        final Weapon magic = new Magic();

        swordMan.setWeapon(knife);
        shooter.setWeapon(gun);
        magicion.setWeapon(magic);

        swordMan.attack();
        shooter.attack();
        magic.attack();


    }
}

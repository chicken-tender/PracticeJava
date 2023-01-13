package 갤럭시탭만들기;

public class GalaxyTabMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            GalaxyTab oongni = new GalaxyTab();
            if(!oongni.continueOrder()) break;
            oongni.setTapType();
            oongni.setScreenSize();
            oongni.setMemory();
            oongni.setColor();
            oongni.setNetwork();
            oongni.setSerialNum();
            oongni.makeTab();
            oongni.TabInfo();
        }
    }

}

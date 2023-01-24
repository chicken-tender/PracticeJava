package 정적팩토리메소드_예제;
import java.util.HashMap;
import java.util.Map;

public class HpPotionCreator extends ItemCreator {
    @Override
    protected Map<String, String> getItemInfo() {
        System.out.println("DB에서 아이템 정보를 가져온다.");

        final Map<String,String> itemInfo = new HashMap<>();
        itemInfo.put("name", "체력 회복약");
        itemInfo.put("category", "potion");

        return itemInfo;
    }

    @Override
    protected Item createItem(Map<String, String> itemInfo) {
        System.out.println("HP 물약 생성!!");
        return new HpPotion(itemInfo);
    }
}

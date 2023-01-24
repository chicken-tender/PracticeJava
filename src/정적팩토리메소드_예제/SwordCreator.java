package 정적팩토리메소드_예제;
import java.util.HashMap;
import java.util.Map;

public class SwordCreator extends ItemCreator{
    @Override
    protected Map<String, String> getItemInfo() {
        System.out.println("DB에서 아이템 정보를 가져온다.");

        final Map<String,String> itemInfo = new HashMap<>();
        itemInfo.put("name", "장검");
        itemInfo.put("category", "weapon");

        return itemInfo;
    }

    @Override
    protected Item createItem(Map<String, String> itemInfo) {
        System.out.println("장검 장착!!");
        return new Sword(itemInfo);
    }
}

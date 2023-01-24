package 정적팩토리메소드_예제;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class ItemCreator {
    // DB에서 아이템 정보 조회
    protected abstract Map<String,String> getItemInfo();
    protected abstract Item createItem(Map<String,String> itemInfo);
    private void log(String itemName) {
        System.out.println(new Date() + " - " + itemName + " - 아이템 생성됐습니다.");
    }

    public Item create() {
        // 템플릿 메소드 패턴 이용
        // 1. DB에서 아이템 정보를 가져온다.
        final Map<String,String> itemInfo = getItemInfo();
        // 2. 아이템 생성
        final Item item = createItem(itemInfo);
        // 3. 아이템 생성 로그를 남긴다.
        log(itemInfo.get("name"));

        return item;
    }
}

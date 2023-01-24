package 정적팩토리메소드_예제;

import java.util.Map;

public class HpPotion implements Item{
    private String name;
    private String category;

    public HpPotion(Map<String,String> itemInfo) {
        this.name = itemInfo.get("name");
        this.category = itemInfo.get("category");
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void use() {
        System.out.println("'" + getName() + "' 사용하여 체력 회복.");
    }
}

package 빌더패턴;

public class NutritionFacts {
    // 필수 입력
    private final int servingSize; // 1회 제공량
    private final int servings; // 총 n회 제공량
    // 선택 입력
    private final int calories; // 1회 제공량당
    private final int fat; // 지방
    private final int carbohydrage; // 탄수화물
    private final int protein; // 단백질

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int carbohydrage = 0;
        private int protein = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this; // 현재 객체에 대한 포인터이며, 함수 연쇄 호출 의도???
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder carbohydrage(int val) {
            carbohydrage = val;
            return this;
        }
        public Builder protein(int val) {
            protein = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        carbohydrage = builder.carbohydrage;
        protein = builder.protein;
    }

    public void viewInfo() {
        System.out.println("===== 성분표 =====");
        System.out.println("1회 제공량 : " + servingSize + "ml");
        System.out.println("총 제공량 : " + servings + "회");
        System.out.println("칼로리 : " + calories + "kcal");
        System.out.println("지방 : " + fat + "g");
        System.out.println("탄수화물 : " + carbohydrage + "g");
        System.out.println("단백질 : " + protein + "g");
    }
}

package 빌더패턴;

public class Main {
    public static void main(String[] args) {
        NutritionFacts n1 = new NutritionFacts.Builder(240, 8).calories(420)
                .fat(35).carbohydrage(9).protein(2).build();

        n1.viewInfo();
    }
}

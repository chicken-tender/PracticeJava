package 입출력스트림_자동차예제;

public class Car implements Comparable<Car> {
    // 필수
    private final String name;
    private final int price;
    // 선택
    private final String company, type, oilType;
    private final int year;
    private final double fuelEff;

    private Car(Builder builder) {
        company = builder.company;
        type = builder.type;
        name = builder.name;
        oilType = builder.oilType;
        year = builder.year;
        price = builder.price;
        fuelEff = builder.fuelEff;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getType() {
        return type;
    }

    public String getOilType() {
        return oilType;
    }

    public int getYear() {
        return year;
    }

    public double getFuelEff() {
        return fuelEff;
    }

    @Override
    public int compareTo(Car o) {
        if(this.year == o.year) return o.price-this.price;
        return o.year - this.year;
    }

    public static class Builder{
        private final String name;
        private final int price;

        private String company = null;
        private String type = null;
        private String oilType = null;
        private int year = 0;
        private double fuelEff = 0;

        public Builder(String name, int price) {
            this.name = name;
            this.price = price;
        }
        public Builder company(String str) {
            company = str;
            return this;
        }
        public Builder type(String str) {
            type = str;
            return this;
        }
        public Builder oilType(String str) {
            oilType = str;
            return this;
        }
        public Builder year(int val) {
            year = val;
            return this;
        }
        public Builder fuelEff(double val) {
            fuelEff = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

        public int getPrice() {
            return price;
        }

        public int getYear() {
            return year;
        }
    }
}

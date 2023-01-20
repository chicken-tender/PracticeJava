package 자동차종합예제;
// 연비가 8이면.. 1리터로 8km를 갈 수 있음. 50리터로 400km를 갈 수 있다.
// 총 거리가 10km 연비가 2km 기름값 1리터 2000원 => 10리터 필요 총 거리 / 연비 * 2000 = 5 * 2000 = 10000
// 이동 횟수 = 승객 수 / 좌석 수
// ★주유 횟수 = (거리 * 이동횟수) / 연비 / 연료탱크 크기
// ★이동에 필요한 총 비용 = 총 거리 * 이동 횟수 / 연비 * 기름값(2000)
// ★총 시간 = (거리 * 이동횟수) / 시속
// 외부에서 입력 받는 정보 : 승객 수, 거리, 부가모드(on/off)
abstract class Car {
    protected int speed;
    protected int fuelEfficiency;
    protected int fuelTank;
    protected int seat;
    protected int moveCount;
    protected String carName;

    // 차량 이름 표시
    public String getCarName() {
        return carName;
    }
    // 이동 횟수
    public int MoveCount(int passenger) {
        if(passenger % seat != 0) moveCount = (passenger / seat) + 1;
        else moveCount = passenger / seat;
        return moveCount;
    }

    public int fuelCount(int dist) {
        if(dist * moveCount / fuelEfficiency % fuelTank != 0) return dist * moveCount / fuelEfficiency / fuelTank + 1;
        return dist * moveCount / fuelEfficiency / fuelTank;
    }

    public int totalCost(int dist) {
        return dist * moveCount / fuelEfficiency * 2000;
    }

    public double totalTime(int dist) {
        return (double)dist * moveCount / speed;
    }

    public abstract void addOption(boolean isOption);
}

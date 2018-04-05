package racingcar;

public class Car {
    private int position;

    public int move(int randomValue) {
        if (randomValue >= 4)
            this.position++;
        return this.position;
    }

    public int move(MoveStrategy moveStrategy) {
        if(moveStrategy.isMovale()) {
            this.position++;
        }
        return this.position;
    }
}

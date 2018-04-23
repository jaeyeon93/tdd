package bowling;

public class FirstBowl implements State {
    private int first;
    public FirstBowl(int first) {
        this.first = first;
    }

    public String displayText() {
        return first + "";
    }

    public State bowl(int second) {
        if (this.first + second == 10)
            return new Spare(first);
        return new Miss(first, second);
    }

    @Override
    public boolean isFinish() {
        return false;
    }
}

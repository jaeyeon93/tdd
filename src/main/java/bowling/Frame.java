package bowling;

public class Frame {
    private State state = new Ready();

    public void bowl(int pin) {
        state = state.bowl(first);
    }
}

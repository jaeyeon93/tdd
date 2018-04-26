package bowling;

public class Frame {
    private Integer first;
    private Integer second;
    private State state = new Ready();
    private Pin pin = new Pin();

    public void bowl(int throwPin) {
        verifyOverTwoBowlEx();

        if (pin.isReady()) {
            pin = new Pin(throwPin);
            verifyThrowPinEx(throwPin);
        } else {
            pin = pin.bowl(throwPin);
            pin.verifyTotalPinEx();
        }
    }

    private void verifyOverTwoBowlEx() {
        if (pin.isFinish())
            throw new IllegalArgumentException();
    }

    public void bowl2(int pin) {
        state = state.bowl(first);
    }
}

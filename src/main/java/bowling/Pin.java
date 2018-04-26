package bowling;

public class Pin {
    private Integer first;
    private Integer second;

    public Pin() {
    }

    public Pin(Integer first ,int throwPin) {
        this.first = throwPin;
        this.second = throwPin;
        verifyTotalPinEx();
    }

    public Pin bowl(int throwPin) {
        return new Pin(this.first, throwPin);
    }

    public void verifyThrowPinEx(int throwPin) {
        if (throwPin < 0 || throwPin > 10)
            throw new IllegalArgumentException();
    }

    void verifyTotalPinEx() {
        if (first + second > 10)
            throw new IllegalArgumentException();
    }

    public boolean isReady() {
        return first == null;
    }

    public boolean isFinish() {
        if (isReady() || isFirstBowl()) {
            return false;
        }
        return true;
    }

    private boolean isStrike() {
        return first == 10;
    }

    private boolean isSpare() {
        return (first + second) == 10;
    }
}

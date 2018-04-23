package bowling;

public class Ready extends State {
    public State bowl(int first) {
        if (first == 10)
            return new Strike();
        return new FirstBowl(first);
    }
}

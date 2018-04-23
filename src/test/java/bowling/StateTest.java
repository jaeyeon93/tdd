package bowling;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class StateTest {
    @Test
    public void miss() {
        FirstBowl firstBowl = new FirstBowl(8);
        State miss = firstBowl.bowl(0);
    }

    @Test
    public void firstBowl() {
        Ready ready = new Ready();
        State firstBowl = ready.bowl(8);
        String result = firstBowl.displayText();
        Assert.assertThat(result, is("8"));
    }

    @Test
    public void strike() {
        Strike strike = new Strike();
        Ready ready = new Ready();
        State firstBowl = ready.bowl(10);
        String result = strike.displayText();
        Assert.assertThat(result, is("X"));
    }

    @Test
    public void spare() {
        FirstBowl firstBowl = new FirstBowl(8);
        State spare = firstBowl.bowl(2);
        State result = spare.displayText();
        Assert.assertThat(result, is("/"));
    }
}

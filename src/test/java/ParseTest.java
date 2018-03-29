import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseTest {
    @Test
    public void 좌표값_하나() {
        int [] numbers = Parser.parse("(1,2)");
        int [] expected = {1, 2};
        assertEquals(1, numbers[0]);
        assertEquals(2, numbers[1]);
    }
}

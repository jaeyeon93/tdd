import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void 덧셈() {
        assertEquals(3,Calculator.sum(1, 2));
    }

    @Test
    public void 뺄셈() {
        assertEquals(2, Calculator.sub(4, 2));
    }

    @Test
    public void 곱셈() {
        assertEquals(24, Calculator.multiple(4, 6));
    }

    @Test
    public void 나눗셈() {
        assertEquals(2, Calculator.div(10, 5));
    }

    @Test
    public void 공백() {
        assertEquals("공백에러", Calculator.empty(null));
    }

}

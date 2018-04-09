import org.junit.Test;

public class PositionTest {
    @Test
    public void create() {
        new Position("a");
    }
    // 예외처리를 못하면 다시 throw를 해라

    @Test
    public void create_ex() {
        try {
            new Position("a");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void create_ex2() {
        create();
    }
}

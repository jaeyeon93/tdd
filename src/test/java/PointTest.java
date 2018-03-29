import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void 생성() {
        Point point1 = new Point("1,2");
        Point point2 = new Point(1,2);
        assertEquals(point2, point1);
        // 인스턴스가 다르기때문에 에러가 난다. Equals로 해결
    }
}

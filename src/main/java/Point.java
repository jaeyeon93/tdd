import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(String s) {
        String [] values = s.split(",");
        this.x = Integer.parseInt(values[0]);
        this.y = Integer.parseInt(values[1]);
    }

    public Point(int i, int j) {
        this.x = i;
        this.y = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}

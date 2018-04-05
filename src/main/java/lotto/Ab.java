package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ab {
    List<String> values;

    public Ab(String value) {
        init(value);
        values = init2(value);
    }

    private void init(String value) {
        String[] vs = value.split(",");
        values = new ArrayList<>();
        for (String v : vs)
            values.add(v);
    }

    public List<String> getValues() {
        return values;
    }

    public List<String> init2(String value) {
        String[] vs = value.split(",");
        List<String> values = new ArrayList<>();
        for (String v : vs)
            values.add(v);
        return values;
    }

    void a(Direction d) {
        if (d.equals(Direction.EAST))
            System.out.println("East");

        if (d == Direction.EAST)
            System.out.println("East");
    }
}

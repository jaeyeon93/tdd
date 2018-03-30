import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lotto {
//    private static List<Integer> lotto;
    private static List<Integer> lotto;
    private List<String> right;

    public Lotto() {
        Random rnd = new Random();
        lotto = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            lotto.add(rnd.nextInt(46));
        }
    }

    public Lotto(String string) {
        right = Arrays.asList(string.split(","));
        lotto = new ArrayList<>();
        for (String s: right) {
            lotto.add(Integer.parseInt(s));
        }
    }

    public int getSize() {
        return lotto.size();
    }

    public static Lotto auto() {
        Lotto lotto = new Lotto();
        return lotto;
    }

    public List<String> getRight() {
        return right;
    }

    public List<Integer> getLotto() {
        return lotto;
    }

    public Integer checkNumber(Lotto right) {
        int count = 0;
        for(int i = 0; i < right.getRight().size(); i++) {
            if(lotto.contains(Integer.parseInt(right.getRight().get(i))))
                count++;
        }
        return count;
    }
}

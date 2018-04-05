import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LottoTest {
    // 로또의 생성옵션 2가지
    // 1. 자동 2. 수동
    @Test
    public void 자동생성() {
        Lotto lotto = new Lotto();
        assertEquals(6, lotto.getSize());
    }

    @Test
    public void 수동생성() {
        Lotto lotto = new Lotto("1,2,3,4,5,6");
        String str = "1,2,3,4,5,6";
        List<String> strArr = Arrays.asList(str.split(","));
        List<Integer> expected = new ArrayList<>();
        for (String s : strArr) {
            expected.add(Integer.parseInt(s));
        }
        assertEquals(expected, lotto.getLotto());
    }

    @Test
    public void 맞춘갯수체크() {
        Lotto lotto = new Lotto("1,2,3,4,5,6");
        Lotto winningLotto = new Lotto("1,2,3,15,14,16");
        System.out.println(lotto.getLotto());
        System.out.println(winningLotto.getLotto());
        int result = lotto.checkNumber(winningLotto);
        assertEquals(3, result);
    }
}

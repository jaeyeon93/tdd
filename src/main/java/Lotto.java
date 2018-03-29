//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//public class Lotto {
//    private static List<Integer> lotto;
//
//    public Lotto() {
//        Random rnd = new Random();
//        for(int i = 0; i < 6; i++) {
//            lotto.add(rnd.nextInt(46));
//        }
//    }
//
//    public static Lotto manual(String bonusNum) {
//        List<String> split = Arrays.asList(bonusNum.split(","));
//        for(int i = 0; i < split.size(); i++)
//            lotto.add(Integer.parseInt(split.get(i)));
////        return lotto;
//    }
//
//    public int getSize() {
//        return lotto.size();
//    }
//
//    public static Lotto auto() {
//        Random rnd = new Random();
//        for(int i = 0; i < 6; i++) {
//            lotto.add(rnd.nextInt(46));
//        }
//    }
//}

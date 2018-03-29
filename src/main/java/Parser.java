public class Parser {
    public static int[] parse(String s) {
        String value = removeBracket(s);
        String[] values = split(value);
        return toInts(values);
    }

    public static Point parse2(String text) {
        return new Point(removeBracket(text));
    }

    private static int[] toInts(String[] values) {
        int [] numbers = new int[values.length];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = Integer.parseInt(values[i]);
        return numbers;
    }

    private static String[] split(String value) {
        return value.split(",");
    }

    private static String removeBracket(String s) {
        return s.substring(1, s.length() - 1);
    }
}

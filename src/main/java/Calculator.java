public class Calculator {
    public static int sum(int i, int j) {
        return i + j;
    }

    public static int sub(int i, int j) {
        return i - j;
    }

    public static int multiple(int i, int j) {
        return i * j;
    }

    public static int div(int i, int j) {
        return i / j;
    }

    public static String empty(String s) {
        if(s != "" || s == null)
            return s;
        return "공백에러";
    }

    public static int run(String input) {
        //"2 + 3 * 4 / 2"
        String [] values = input.split(" ");
        for(int i = 0; i < values.length; i++) {
            
        }
    }
}

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
}

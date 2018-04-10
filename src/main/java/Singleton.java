public class Singleton {
    static Singleton singletonObject; //정적 참조 변수

    private Singleton() { }; // private생성자

    // 객체 반환 정적 메소드
    public static Singleton getInstance() {
        if (singletonObject == null)
            singletonObject = new Singleton();
        return singletonObject;
    }
}

class Client {
    public static void main(String[] args) {
        // private생성자라서 new를 통해 인스턴스를 생성할 수 없다.
        // Singleton s = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1 = null;
        s2 = null;
        s3 = null;
    }
}
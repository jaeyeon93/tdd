public class Position {
    public Position(String position) throws IllegalArgumentException {
        if (position.length() != 2)
            throw new IllegalArgumentException(position + "은 위치 값 형식에 맞지 않습니다.");
        // 위의 에러는 프로그램을 종료시키게 된다.
    }
}

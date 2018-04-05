package lotto;

public enum Rank {
    FIRST(6, 1000000000),
    SECOND(5, 300000000),
    THIRD(5, 1500000),
    FOURTH(4, 50000),
    FIFTH(3, 5000);

    private final int matchCount;
    private final int winnerPrize;

    private Rank(final int matchCount,final int winnerPrize) {
        this.matchCount = matchCount;
        this.winnerPrize = winnerPrize;
    }

    public boolean isFirst() {
        // 하나이기때문에 this가 가능하다.
        return FIRST == this;
    }

    public int getTotalWinnerPrize(int count) {
        return this.winnerPrize * count;
    }

    public static Rank valueOf(int matchCount) {
        Rank[] ranks = values();
        for (Rank rank : ranks) {
            if (rank.matchCount == matchCount)
                return rank;
        }
        throw new IllegalArgumentException();
    }
}
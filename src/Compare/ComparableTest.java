package Compare;

public class ComparableTest implements Comparable<ComparableTest> {

    private int score;

    @Override
    public int compareTo(ComparableTest ct) {
        return this.score - ct.score;
    }
}
